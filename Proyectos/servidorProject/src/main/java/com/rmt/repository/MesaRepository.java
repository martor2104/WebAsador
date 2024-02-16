package com.rmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rmt.entities.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Long>{

	
}
