package com.rmt.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


import com.rmt.entities.Usuario;
import com.rmt.entities.Role;
import com.rmt.repository.MesaRepository;
import com.rmt.repository.ReservaRepository;
import com.rmt.repository.UserRepository;


@Profile("demo")
@Component
public class InitializationData implements CommandLineRunner{

    @Autowired
    private UserRepository usuarioRepository;
    
    @Autowired
    private ReservaRepository reservaRepository;
    
    @Autowired
    private MesaRepository mesaRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    private final boolean borrarReservas = false;

	@Override
	public void run(String... args) throws Exception {
		if(borrarReservas) {
			reservaRepository.deleteAll();
		}
		
		try {
			Usuario cliente = new Usuario();
			cliente.setEmail("prueba@gmail.com");
			cliente.setName("Roberto");
			cliente.setPassword(passwordEncoder.encode("password123"));
            cliente.getRoles().add(Role.ROLE_USER);
            cliente.setTelefono(123556789);
		} catch (Exception e) {
			
		}
		
	}
    
    
}
