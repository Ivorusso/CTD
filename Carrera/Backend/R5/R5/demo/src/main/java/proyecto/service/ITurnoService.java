package proyecto.service;

import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.TurnoDTO;

import java.util.List;

public interface ITurnoService {
    void crearTurno(TurnoDTO turnoDTO);
    TurnoDTO buscarturno(Integer id) throws ResourceNotFoundException;
    void actualizarturno(TurnoDTO turnoDTO);
    void eliminarturno(Integer id) throws ResourceNotFoundException;
    List<TurnoDTO> getTodos();
}