package proyecto.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.Domicilio;
import proyecto.model.DomicilioDTO;
import proyecto.model.Paciente;
import proyecto.model.PacienteDTO;
import proyecto.repository.IDomicilioRepository;
import proyecto.repository.IPacienteRepository;

import java.lang.module.ResolutionException;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PacienteService implements IPacienteService {

    @Autowired
    private IPacienteRepository pacienteRepository;

    @Autowired
    ObjectMapper mapper;

    @Autowired
    private DomicilioService domicilioService;

    private static final org.apache.log4j.Logger logger = Logger.getLogger(PacienteService.class);

    @Override
    public Paciente crearPaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        if (paciente.getDomicilio() != null){
            Domicilio domicilio = domicilioService.crearDomicilio(pacienteDTO.getDomicilio());
            paciente.getDomicilio().setId(domicilio.getId());
        }
        logger.info("Se creo el Paciente = " + pacienteDTO.getNombre() + " Domiciliado en = " + paciente.getDomicilio());
        return pacienteRepository.save(paciente);
    }

    @Override
    public PacienteDTO buscarPaciente(Integer id)   {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        PacienteDTO pacienteDTO = null;
        if (paciente.isPresent())
            pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);
        logger.info("Se encontro el paciente = " + id);

        return pacienteDTO;
    }

    @Override
    public void actualizarPaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        logger.info("Se actualizo el Paciente = " + pacienteDTO.getNombre());
        pacienteRepository.save(paciente);

    }

    @Override
    public void eliminarPaciente(Integer id) throws ResourceNotFoundException {
        if (buscarPaciente(id) == null)
            throw new ResourceNotFoundException("No Existe un paciente con el id " + id);

        logger.info("Se elimino el Paciente = " + id);
        pacienteRepository.deleteById(id);

    }

    @Override
    public Set<PacienteDTO> getTodos() {
        List<Paciente> pacientes = pacienteRepository.findAll();
        Set<PacienteDTO> pacientesDTO = new HashSet<>();
        for (Paciente paciente : pacientes){
            pacientesDTO.add(mapper.convertValue(paciente, PacienteDTO.class));
        }
        return pacientesDTO;
    }
}



