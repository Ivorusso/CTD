package proyecto.service;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.*;
import proyecto.repository.ITurnoRepository;

import java.util.*;

@Service
public class TurnoService implements ITurnoService{

    @Autowired
    private ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private OdontologoService odontologoService;

    private static final org.apache.log4j.Logger logger = Logger.getLogger(TurnoService.class);

    @Override
    public void crearTurno(TurnoDTO turnoDTO) {
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);

        if (turno.getOdontologo() != null){
            Odontologo odontologo = odontologoService.crearOdontologo(turnoDTO.getOdontologo());
            turno.getOdontologo().setId(odontologo.getId());
        }

        if (turno.getPaciente() != null){
            Paciente paciente = pacienteService.crearPaciente(turnoDTO.getPaciente());
            turno.getPaciente().setId(paciente.getId());
        }

        logger.info("Se creo el turno para la  fecha = " + turnoDTO.getLocalDate());
        turnoRepository.save(turno);
    }

    @Override
    public TurnoDTO buscarturno(Integer id)  {

        Optional<Turno> turno = turnoRepository.findById(id);
        TurnoDTO turnoDTO = null;
        if (turno.isPresent())
            turnoDTO = mapper.convertValue(turno, TurnoDTO.class);
        logger.info("Se encontro el Turno = " + id);

        return turnoDTO;
    }

    @Override
    public void actualizarturno(TurnoDTO turnoDTO) {
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        logger.info("Se actualizo el turno de la  fecha = " + turnoDTO.getLocalDate());
        turnoRepository.save(turno);
    }

    @Override
    public void eliminarturno(Integer id)  throws ResourceNotFoundException {
        if (buscarturno(id) == null)
            throw new ResourceNotFoundException("No existe el turno con el id " + id);
        logger.info("Se elimino el Turno = " + id);
        turnoRepository.deleteById(id);
    }

    @Override
    public List<TurnoDTO> getTodos() {
        List<Turno> turnos = turnoRepository.findAll();
        List<TurnoDTO> turnosDTO = new ArrayList<>();
        for (Turno turno : turnos){
            turnosDTO.add(mapper.convertValue(turno, TurnoDTO.class));
        }
        return turnosDTO;
    }
}