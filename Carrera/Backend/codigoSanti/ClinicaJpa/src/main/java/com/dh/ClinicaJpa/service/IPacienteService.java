package com.dh.ClinicaJpa.service;

import com.dh.ClinicaJpa.dto.OdontologoDto;
import com.dh.ClinicaJpa.dto.PacienteDto;

import java.util.Set;

public interface IPacienteService {

    void crearPaciente(PacienteDto pacienteDto);
    PacienteDto leerPaciente(Long id);
    void modificarPaciente(PacienteDto pacienteDto);
    void eliminarPaciente(Long id);
    Set<PacienteDto> getTodos();
}
