package com.rmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.rmt.entities.Usuario;
import com.rmt.entities.Mesa;
import com.rmt.entities.Reserva;
import com.rmt.repository.MesaRepository;
import com.rmt.repository.ReservaRepository;
import com.rmt.service.MesaService;

import jakarta.validation.Valid;

@Service
public class MesaServiceImpl implements MesaService{

	@Override
	public Mesa agregarMesa(Mesa mesa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Mesa> listarTodasLasMesas(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mesa obtenerMesaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mesa actualizarMesa(Long id, Mesa mesa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarMesa(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Mesa> listarMesasReservadasPorUsuario(Long usuarioId, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reserva reservarMesa(List<Mesa> mesa, Usuario cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelarReserva(Long reservaId) {
		// TODO Auto-generated method stub
		
	}
	
	/*@Autowired
	private MesaRepository repository;
	
	@Autowired
	private ReservaRepository reservaRepository;
	

	@Override
	public Mesa agregarMesa(@Valid Mesa mesa) {
		return repository.save(mesa);
	}

	@Override
	public Page<Mesa> listarTodasLasMesas(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public Mesa obtenerMesaPorId(Long id) {
		return repository.findById(id)
				.orElseThrow(null);
	}

	@Override
	public Mesa actualizarMesa(Long id, Mesa detallesMesa) {
		Mesa mesa = obtenerMesaPorId(id);
		mesa.setNumMesa(detallesMesa.getNumMesa());
		mesa.setZona(detallesMesa.getZona());
		mesa.setMaxCliente(detallesMesa.getMaxCliente());
		
		return repository.save(mesa);
	}

	@Override
	public void eliminarMesa(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public Page<Mesa> listarMesasReservadasPorUsuario(Long usuarioId, Pageable pageable) {
		return reservaRepository.findMesaPorIdUsuario(usuarioId, pageable);
	}

	@Override
	public Reserva reservarMesa(List<Mesa> mesa, Usuario cliente) {
        // Crear una nueva instancia de Reserva
		Reserva reserva = new Reserva();
		reserva.setMesas(mesa);
        reserva.setCliente(cliente);

        return reservaRepository.save(reserva);
	}

	@Override
	public void cancelarReserva(Long reservaId) {
		 Reserva reserva = reservaRepository.findById(reservaId)
				 .orElseThrow(null);

		 reservaRepository.delete(reserva);
		
	}*/

	 
}
