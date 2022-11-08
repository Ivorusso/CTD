package com.r3.r3.service;

import com.r3.r3.model.OdontologoDTO;

import java.util.Set;

public interface IOdontologoService {
    void crearOdontologo(OdontologoDTO odontologoDTO);
    OdontologoDTO buscarOdontologo(Integer id);
    void actualizarOdontologo(OdontologoDTO odontologoDTO);
    void eliminarOdontologo(Integer id);
    Set<OdontologoDTO> getTodos();
}
