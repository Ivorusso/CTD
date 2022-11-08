package com.r3.r3.service;

import com.r3.r3.model.dto.Paciente;
import com.r3.r3.repository.IDao;

import java.util.Date;
import java.util.List;

public class PacienteService {

    private IDao<Paciente> pacienteIDao;
    public PacienteService(IDao<Paciente> pacienteIDao){
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente guardar(Paciente paciente){
        paciente.setFechaIngreso((new Date()));
        return pacienteIDao.guardar(paciente);
    }

    public Paciente buscar(Integer id){
        return  pacienteIDao.buscar(id);
    }

    public List<Paciente> buscarTodos(){
        return pacienteIDao.buscarTodos();
    }

    public void eliminar (Integer id){
        pacienteIDao.eliminar(id);
    }
    public Paciente actualizar(Paciente paciente){
        return pacienteIDao.actualizar(paciente);
    }
}
