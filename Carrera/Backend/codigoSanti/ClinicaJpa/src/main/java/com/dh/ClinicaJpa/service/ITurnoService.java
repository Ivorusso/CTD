package com.dh.ClinicaJpa.service;

import com.dh.ClinicaJpa.dto.PacienteDto;
import com.dh.ClinicaJpa.dto.TurnoDto;

import java.util.Set;

public interface ITurnoService {

    void crearTurno(TurnoDto turnoDto);
    TurnoDto leerTurno(Long id);
    void modificarTurno(TurnoDto turnoDto);
    void eliminarTurno(Long id);
    Set<TurnoDto> getTodos();
}
