package com.rmt.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.rmt.entities.Cliente;
import com.rmt.entities.Mesa;
import com.rmt.entities.Reserva;



public interface MesaService {


    Mesa agregarMesa(Mesa mesa);

    Page<Mesa> listarTodasLasMesas(Pageable pageable);

    Mesa obtenerMesaPorId(Long id);

    Mesa actualizarMesa(Long id, Mesa mesa);

    void eliminarMesa(Long id);

    Page<Mesa> listarMesasReservadasPorUsuario(Long usuarioId, Pageable pageable);

    Reserva reservarMesa(List<Mesa> mesa, Cliente cliente);

    void cancelarReserva(Long reservaId);
    
}
