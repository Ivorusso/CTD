package com.example.clase23Integradora.dao;

import com.example.clase23Integradora.model.Paciente;

import java.util.List;

public class PacienteDaoCollection {

    private List<Paciente> pacientes = List.of(new Paciente("Ivo", 1, "ivo@ivo.ivo"), new Paciente("Seba", 2, "Seba@seba.seba"), new Paciente("maru", 3, "Maru@maru.maru"));

    public List<Paciente> mostrarTodos(){
        return this.pacientes;
    }

    public String buscarPorEmail(String email){
        String resultado = null;
        for (Paciente p:pacientes) {
            if (p.getEmail() == email){
                resultado = p.getEmail();
            } else{
               resultado = "Email no encontrado";
            }
        }
        return resultado;
    }
}
