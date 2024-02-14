package com.rmt.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rmt.entities.Cliente;
import com.rmt.entities.EstadoReserva;
import com.rmt.entities.Mesa;
import com.rmt.entities.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{

	@Query("SELECT r FROM Reserva r WHERE r.usuario.id = :usuarioId")
	Page<Mesa> findMesaPorIdUsuario(@Param("usuarioId")Long id, Pageable pageable);
	boolean existsByMesaAndUsuarioAndEstadoReserva(Mesa mesa, Cliente cliente, EstadoReserva estadoReserva);
}
