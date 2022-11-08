package proyecto.service;

import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.Paciente;
import proyecto.model.PacienteDTO;

import java.util.Set;

public interface IPacienteService {

    Paciente crearPaciente(PacienteDTO pacienteDTO);
    PacienteDTO buscarPaciente(Integer id) throws ResourceNotFoundException;
    void actualizarPaciente(PacienteDTO pacienteDTO);
    void eliminarPaciente(Integer id) throws ResourceNotFoundException;
    Set<PacienteDTO> getTodos();
}
