package proyecto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.Odontologo;
import proyecto.model.OdontologoDTO;
import proyecto.service.IOdontologoService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    IOdontologoService odontologoService;

    @PostMapping
    public ResponseEntity<?> crearOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.crearOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> actualizarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.actualizarOdontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOdontologo(@PathVariable Integer id) throws ResourceNotFoundException{
          odontologoService.buscarOdontologo(id);
        return ResponseEntity.ok(odontologoService.buscarOdontologo(id));
    }

    @GetMapping
    public ResponseEntity<Set<OdontologoDTO>> listar() {
        return ResponseEntity.ok(odontologoService.getTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarOdontologo(@PathVariable Integer id) throws ResourceNotFoundException {
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok("Eliminado");
    }

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<String> procesarErrorNotFound(ResourceNotFoundException exception){
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

}
