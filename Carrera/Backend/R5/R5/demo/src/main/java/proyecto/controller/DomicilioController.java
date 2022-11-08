package proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto.exceptions.ResourceNotFoundException;
import proyecto.model.Domicilio;
import proyecto.model.DomicilioDTO;
import proyecto.model.OdontologoDTO;
import proyecto.service.IDomicilioService;
import proyecto.service.IOdontologoService;

import java.util.Set;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {
    @Autowired
    IDomicilioService domicilioService;

    @PostMapping
    public ResponseEntity<?> crearDomicilio(@RequestBody DomicilioDTO domicilioDTO){
        domicilioService.crearDomicilio(domicilioDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> actualizarDomicilio(@RequestBody DomicilioDTO domicilioDTO){
        domicilioService.actualizarDomicilio(domicilioDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public DomicilioDTO getDomicilio(@PathVariable Integer id) throws ResourceNotFoundException{
        return  domicilioService.buscarDomicilio(id);
    }

    @GetMapping
    public ResponseEntity<Set<DomicilioDTO>> listar() {
        return ResponseEntity.ok(domicilioService.getTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity eliminarDomicilio(@PathVariable Integer id) throws ResourceNotFoundException {
        domicilioService.eliminarDomicilio(id);
        return ResponseEntity.ok("Eliminado");
    }

    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<String> procesarErrorNotFound(ResourceNotFoundException exception){
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }


}

