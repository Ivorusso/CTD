package proyecto.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.Domicilio;
import proyecto.model.DomicilioDTO;
import proyecto.repository.IDomicilioRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DomicilioService implements IDomicilioService {

    @Autowired
    private IDomicilioRepository domicilioRepository;

    @Autowired
    ObjectMapper mapper;



    private static final org.apache.log4j.Logger logger = Logger.getLogger(DomicilioService.class);


    @Override
    public Domicilio crearDomicilio(DomicilioDTO domicilioDTO) {
        Domicilio domicilio = mapper.convertValue(domicilioDTO, Domicilio.class);
        logger.info("Se Creo el Domicilio en la calle = " + domicilioDTO.getCalle() + " Numero = " + domicilioDTO.getNumero());
        return  domicilioRepository.save(domicilio);
    }

    @Override
    public DomicilioDTO buscarDomicilio(Integer id)  {
        Optional<Domicilio> domicilio = domicilioRepository.findById(id);
        DomicilioDTO domicilioDTO = null;
        if (domicilio.isPresent())
            domicilioDTO = mapper.convertValue(domicilio, DomicilioDTO.class);
        logger.info("Se encontro el Domicilio = " + id);
        return domicilioDTO;
    }

    @Override
    public void actualizarDomicilio(DomicilioDTO domicilioDTO) {
        Domicilio domicilio = mapper.convertValue(domicilioDTO, Domicilio.class);
        domicilioRepository.save(domicilio);
        logger.info("Se cambio el domicilio = " + domicilioDTO.getId());
    }

    @Override
    public void eliminarDomicilio(Integer id) throws ResourceNotFoundException{
        if (buscarDomicilio(id) == null)
            throw new ResourceNotFoundException("No existe el Domicilio con el id " + id);
        logger.info("Se elimino el domicilio = " + id);
        domicilioRepository.deleteById(id);

    }

    @Override
    public Set<DomicilioDTO> getTodos() {
        List<Domicilio> domicilios = domicilioRepository.findAll();
        Set<DomicilioDTO> domiciliosDTO = new HashSet<>();
        for (Domicilio domicilio : domicilios){
            domiciliosDTO.add(mapper.convertValue(domicilio, DomicilioDTO.class));
        }
        return domiciliosDTO;
    }
}