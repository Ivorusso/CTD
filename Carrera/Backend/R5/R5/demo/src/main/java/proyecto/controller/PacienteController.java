package proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.OdontologoDTO;
import proyecto.model.PacienteDTO;
import proyecto.service.IDomicilioService;
import proyecto.service.IOdontologoService;
import proyecto.service.IPacienteService;

import java.util.Set;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    IPacienteService pacienteService;


    @PostMapping
    public ResponseEntity<?> crearPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.crearPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> actualizarPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.actualizarPaciente(pacienteDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public PacienteDTO getPaciente(@PathVariable Integer id) throws ResourceNotFoundException{
        return  pacienteService.buscarPaciente(id);
    }

    @GetMapping
    public ResponseEntity<Set<PacienteDTO>> listar() {
        return ResponseEntity.ok(pacienteService.getTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarPaciente(@PathVariable Integer id) throws ResourceNotFoundException {
     pacienteService.eliminarPaciente(id);
     return ResponseEntity.ok("Eliminado");
    }

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<String> procesarErrorNotFound(ResourceNotFoundException exception){
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }


}
