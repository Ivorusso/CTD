package proyecto.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.PacienteDTO;
import proyecto.model.TurnoDTO;

import java.time.LocalDate;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TurnoServiceTest {
    @Autowired
    private ITurnoService turnoService;

    @Test
    public void testCrearTurno(){
        TurnoDTO turnoDTO = new TurnoDTO();
        turnoDTO.setLocalDate(LocalDate.of(2022, 9 , 7));
        turnoService.crearTurno(turnoDTO);
        assertNotNull(turnoDTO);
    }

    @Test
    public void testActualizarTurno(){
        TurnoDTO turnoDTO = new TurnoDTO();
        turnoDTO.setLocalDate(LocalDate.of(2022, 9 , 7));
        turnoService.crearTurno(turnoDTO);

        turnoDTO.setLocalDate(LocalDate.of(2022,9,30));
        turnoService.actualizarturno(turnoDTO);
        Assertions.assertTrue(Objects.equals(turnoDTO.getLocalDate(), LocalDate.of(2022, 9, 30)));

    }

    @Test
    public void testEliminarTurno() throws ResourceNotFoundException {
        turnoService.eliminarturno(1);
        assertTrue(turnoService.buscarturno(1) == null);
    }



}