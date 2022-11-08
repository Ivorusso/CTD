package com.r3.r3.service;


import com.r3.r3.model.TurnoDTO;

import java.util.Set;


public interface ITurnoService {
    void crearTurno(TurnoDTO turnoDTO);
    TurnoDTO buscarturno(Integer id);
    void actualizarturno(TurnoDTO turnoDTO);
    void eliminarturno(Integer id);
    Set<TurnoDTO> getTodos();
}
