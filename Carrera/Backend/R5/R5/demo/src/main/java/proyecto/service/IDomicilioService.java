package proyecto.service;

import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.Domicilio;
import proyecto.model.DomicilioDTO;

import java.util.Set;

public interface IDomicilioService {
    Domicilio crearDomicilio(DomicilioDTO domicilioDTO);
    DomicilioDTO buscarDomicilio(Integer id) throws ResourceNotFoundException;
    void actualizarDomicilio(DomicilioDTO domicilioDTO);
    void eliminarDomicilio(Integer id) throws ResourceNotFoundException;
    Set<DomicilioDTO> getTodos();
}
