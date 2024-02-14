package com.rmt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwes.security.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{

    Optional<Usuario> findByEmail(String email);
    Optional<Usuario> findById(Long id);
    Boolean existsByEmail(String email);
}
