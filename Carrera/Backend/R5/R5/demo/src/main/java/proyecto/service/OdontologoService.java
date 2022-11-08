package proyecto.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.Odontologo;
import proyecto.model.OdontologoDTO;
import proyecto.repository.IOdontologoRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OdontologoService implements IOdontologoService {

    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    private static final org.apache.log4j.Logger logger = Logger.getLogger(OdontologoService.class);

    @Override
    public Odontologo crearOdontologo(OdontologoDTO odontologoDTO) {
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        logger.info("Se creo el odontologo = " + odontologoDTO.getNombre());
        return odontologoRepository.save(odontologo);

    }

    @Override
    public OdontologoDTO buscarOdontologo(Integer id)  {
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        OdontologoDTO odontologoDTO = null;
        if (odontologo.isPresent())
            odontologoDTO = mapper.convertValue(odontologo, OdontologoDTO.class);
        logger.info("Se encontro el odontologo = " + id);

        return odontologoDTO;
    }

    @Override
    public void actualizarOdontologo(OdontologoDTO odontologoDTO) {
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        logger.info("Se actualizo el odontologo = " + odontologoDTO.getNombre());
        odontologoRepository.save(odontologo);
    }

    @Override
    public void eliminarOdontologo(Integer id) throws ResourceNotFoundException{
        if (buscarOdontologo(id) == null)
            throw new ResourceNotFoundException("No existe el odontologo con el id " + id);
        logger.info("Se elimino el odontologo = " + id);
        odontologoRepository.deleteById(id);
    }

    @Override
    public Set<OdontologoDTO> getTodos() {
        List<Odontologo> odontologos = odontologoRepository.findAll();
        Set<OdontologoDTO> odontologosDTO = new HashSet<>();
        for (Odontologo odontologo : odontologos){
            odontologosDTO.add(mapper.convertValue(odontologo, OdontologoDTO.class));
        }
        return odontologosDTO;
    }

}
