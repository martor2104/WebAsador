package com.rmt.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.rmt.entities.EstadoReserva;
import com.rmt.entities.Reserva;

public interface ReservaService {

	Reserva crearReserva(Long mesaId, Long clienteId, LocalDate fechaReserva, Integer numClientes) throws NotFoundException;
	
	Reserva cancelarReserva(Long reservaId);
	
	Reserva actualizarEstadoReserva(Long reservaId, EstadoReserva nuevoEstado);
	
    Optional<Reserva> obtenerReservaPorId(Long reservaId);
    
    List<Reserva> listarTodasLasReservas();
    
    List<Reserva> listarReservasPorUsuario(Long usuarioId);
}
