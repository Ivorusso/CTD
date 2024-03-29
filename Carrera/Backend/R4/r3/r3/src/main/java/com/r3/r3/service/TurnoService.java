package com.r3.r3.service;

import com.r3.r3.model.dto.Turno;
import com.r3.r3.repository.IDao;

import java.util.List;

public class TurnoService {

    private IDao<Turno> turnoRepository;

    public TurnoService(IDao<Turno> turnoRepository){
        this.turnoRepository = turnoRepository;
    }

    public Turno registrarTurno(Turno turno){
        return  turnoRepository.guardar(turno);
    }
    public List<Turno> listar(){
        return turnoRepository.buscarTodos();
    }
    public void eliminar(Integer id){
        turnoRepository.eliminar(id);
    }
    public Turno actualizar(Turno turno){
        return turnoRepository.actualizar(turno);
    }
    public Turno buscar(Integer id){
        return turnoRepository.buscar(id);
    }
}
