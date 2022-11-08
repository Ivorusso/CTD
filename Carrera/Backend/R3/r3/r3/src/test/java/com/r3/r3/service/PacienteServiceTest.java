package com.r3.r3.service;

import com.r3.r3.model.PacienteDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

    @SpringBootTest
    class PacienteServiceTest {
        @Autowired
        @Qualifier("pacienteService")
        private IPacienteService pacienteService;

        @Test
        public void testCrearPaciente(){
            PacienteDTO pacienteDTO = new PacienteDTO();
            pacienteDTO.setNombre("Ivo");
            pacienteDTO.setApellido("Russo");
            pacienteDTO.setDni("12345");

            pacienteService.crearPaciente(pacienteDTO);

            PacienteDTO pacienteIvo = pacienteService.buscarPaciente(1);

            assertTrue(pacienteIvo != null);
        }

    }

