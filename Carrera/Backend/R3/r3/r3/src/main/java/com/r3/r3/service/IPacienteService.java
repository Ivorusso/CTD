package com.r3.r3.service;


import com.r3.r3.model.PacienteDTO;

import java.util.Set;

public interface IPacienteService {

    void crearPaciente(PacienteDTO pacienteDTO);
    PacienteDTO buscarPaciente(Integer id);
    void actualizarPaciente(PacienteDTO pacienteDTO);
    void eliminarPaciente(Integer id);
    Set<PacienteDTO> getTodos();
}
