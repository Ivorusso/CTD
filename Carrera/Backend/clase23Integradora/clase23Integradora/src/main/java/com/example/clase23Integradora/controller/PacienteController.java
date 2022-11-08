package com.example.clase23Integradora.controller;

import com.example.clase23Integradora.model.Paciente;
import com.example.clase23Integradora.service.PacienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacienteController {

    private PacienteService service = new PacienteService();

    @GetMapping
    public List<Paciente> mostrarTodos(){
        return service.mostrarTodos();
    }


    @GetMapping("buscar")
    public String mostarPorEmail(@RequestParam String email){
        email = "ivo@ivo.ivo";
        return  service.mostrarPacientePorEmail(email).toString();
    }
}


