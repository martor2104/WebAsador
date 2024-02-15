package com.rmt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwes.security.entities.Usuario;
import com.rmt.entities.Cliente;

public interface UserRepository extends JpaRepository<Cliente, Long>{

    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findById(Long id);
    Boolean existsByEmail(String email);
}
