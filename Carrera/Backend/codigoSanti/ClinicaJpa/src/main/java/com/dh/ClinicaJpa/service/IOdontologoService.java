package com.dh.ClinicaJpa.service;

import com.dh.ClinicaJpa.dto.OdontologoDto;

import java.util.Set;

public interface IOdontologoService {

    void crearOdontologo(OdontologoDto odontologoDto);
    OdontologoDto leerOdontologo(Long id);
    void modificarOdontologo(OdontologoDto odontologoDto);
    void eliminarOdontologo(Long id);
    Set<OdontologoDto> getTodos();


}

