package proyecto.service;

import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.Odontologo;
import proyecto.model.OdontologoDTO;

import java.util.Set;

public interface IOdontologoService {
    Odontologo crearOdontologo(OdontologoDTO odontologoDTO);
    OdontologoDTO buscarOdontologo(Integer id) throws ResourceNotFoundException;
    void actualizarOdontologo(OdontologoDTO odontologoDTO);
    void eliminarOdontologo(Integer id) throws ResourceNotFoundException;
    Set<OdontologoDTO> getTodos();
}
