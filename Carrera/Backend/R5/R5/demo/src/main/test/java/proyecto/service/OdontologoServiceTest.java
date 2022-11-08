package proyecto.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.Odontologo;
import proyecto.model.OdontologoDTO;
import proyecto.model.PacienteDTO;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OdontologoServiceTest {
    @Autowired
    private IOdontologoService odontologoService;

    @Test
    public void testCrearOdontologo() {
        OdontologoDTO odontologoDTO = new OdontologoDTO();
        odontologoDTO.setNombre("ivo");
        odontologoDTO.setApellido("Russo");
        odontologoService.crearOdontologo(odontologoDTO);
        assertNotNull(odontologoDTO);
    }

    @Test
    public void actualizarOdontologo() {
        OdontologoDTO odontologoDTO = new OdontologoDTO();
        odontologoDTO.setNombre("Ivo");
        odontologoDTO.setApellido("Russo");
        odontologoService.crearOdontologo(odontologoDTO);
        odontologoDTO.setApellido("Rodriguez Russo");
        odontologoService.actualizarOdontologo(odontologoDTO);

        assertTrue(odontologoDTO.getApellido() == "Rodriguez Russo");

    }

    @Test
    public void testEliminarOdontologo() throws ResourceNotFoundException {
        odontologoService.eliminarOdontologo(1);
        assertTrue(odontologoService.buscarOdontologo(1) == null);
    }
}
