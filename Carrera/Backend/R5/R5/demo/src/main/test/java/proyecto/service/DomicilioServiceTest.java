package proyecto.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.DomicilioDTO;
import proyecto.model.OdontologoDTO;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DomicilioServiceTest {
    @Autowired
    private IDomicilioService domicilioService;

    @Test
    public void testCrearDomicilio() {
        DomicilioDTO domicilioDTO = new DomicilioDTO();
        domicilioDTO.setCalle("AAA");
        domicilioDTO.setNumero("123");
        domicilioDTO.setLocalidad("General Pueyrredon");
        domicilioDTO.setProvincia("Buenos Aires");

        domicilioService.crearDomicilio(domicilioDTO);
    }

    @Test
    public void testActualizarDomicilio() {
        DomicilioDTO domicilioDTO = new DomicilioDTO();
        domicilioDTO.setCalle("AAA");
        domicilioDTO.setNumero("123");
        domicilioDTO.setLocalidad("MDQ");
        domicilioDTO.setProvincia("Buenos Aires");
        domicilioService.crearDomicilio(domicilioDTO);
        domicilioDTO.setLocalidad("MDQ");

        assertTrue(domicilioDTO.getLocalidad() == "MDQ");

    }

    @Test
    public void testEliminarDomicilio() throws ResourceNotFoundException {
        domicilioService.eliminarDomicilio(1);
        assertTrue(domicilioService.buscarDomicilio(1) == null);
    }
}