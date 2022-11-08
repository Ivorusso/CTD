package proyecto.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.DomicilioDTO;
import proyecto.model.PacienteDTO;
import proyecto.service.IPacienteService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PacienteServiceTest {
    @Autowired
    private IPacienteService pacienteService;

    @Test
    public void testCrearPaciente() throws ResourceNotFoundException{
        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setNombre("Ivo");
        pacienteDTO.setApellido("Russo");
        pacienteDTO.setDni("12345");
        pacienteDTO.setDomicilio(new DomicilioDTO());

        pacienteService.crearPaciente(pacienteDTO);

        PacienteDTO pacienteIvo = pacienteService.buscarPaciente(1);

        assertTrue(pacienteIvo != null);
    }

    @Test
    public void actualizarPaciente(){
        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setNombre("Ivo");
        pacienteDTO.setApellido("Russo");
        pacienteDTO.setDni("12345");
        pacienteService.crearPaciente(pacienteDTO);
        pacienteDTO.setApellido("Rodriguez Russo");
        pacienteService.actualizarPaciente(pacienteDTO);

        Assertions.assertTrue(pacienteDTO.getApellido() == "Rodriguez Russo");

    }

    @Test
    public void testEliminarPaciente() throws ResourceNotFoundException {
        pacienteService.eliminarPaciente(1);
        assertTrue(pacienteService.buscarPaciente(1) == null);
    }

}