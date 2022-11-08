package com.example.clase23Integradora.service;

import com.example.clase23Integradora.dao.PacienteDaoCollection;
import com.example.clase23Integradora.model.Paciente;

import java.util.List;

public class PacienteService {

    private PacienteDaoCollection dao = new PacienteDaoCollection();

    public List<Paciente> mostrarTodos(){
        return dao.mostrarTodos();
    }

    public String mostrarPacientePorEmail(String email){
        return dao.buscarPorEmail(email);
    }
}
