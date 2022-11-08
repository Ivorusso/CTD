package proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.OdontologoDTO;
import proyecto.model.Turno;
import proyecto.model.TurnoDTO;
import proyecto.service.IOdontologoService;
import proyecto.service.ITurnoService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    @Autowired
    ITurnoService turnoService;

    @PostMapping
    public ResponseEntity<?> crearTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.crearTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> actualizarTurno(@RequestBody TurnoDTO turnoDTO){
        turnoService.actualizarturno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public TurnoDTO getOdontologo(@PathVariable Integer id) throws ResourceNotFoundException{
        return  turnoService.buscarturno(id);
    }

    @GetMapping
    public ResponseEntity<List<TurnoDTO>> listar() {
        return ResponseEntity.ok(turnoService.getTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Integer id) throws ResourceNotFoundException {
        turnoService.eliminarturno(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<String> procesarErrorNotFound(ResourceNotFoundException exception){
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }


}

