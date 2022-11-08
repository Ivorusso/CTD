package com.Clinica.controller;

import com.Clinica.daos.OdontologoDaoH2;
import com.Clinica.servicios.OdontologoService;
import entidad.Odontologo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());


    @PostMapping()
    public ResponseEntity<Odontologo> registrarOdontologo(@RequestBody Odontologo odontologo){
        return  ResponseEntity.ok(odontologoService.guardarOdontologo(odontologo));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Odontologo> buscar(@PathVariable Integer id) {
        Odontologo odontologo = odontologoService.buscarOdontologo(id);

        return ResponseEntity.ok(odontologo);
    }

//    @PutMapping()
//    public ResponseEntity<Odontologo> actualizar(@RequestBody Odontologo odontologo) {
//        ResponseEntity<Odontologo> response = null;
//
//        if (odontologo.getId() != null && odontologoService.buscarOdontologo(odontologo.getId()) != null)
//            response = ResponseEntity.ok(odontologoService.actualizar(odontologo));
//        else
//            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//
//        return response;
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminar(@PathVariable Integer id) {
        ResponseEntity<String> response = null;

        if (odontologoService.buscarOdontologo(id) != null) {
            odontologoService.eliminarOdontologo(id);
            response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("Eliminado");
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return response;
    }
    @GetMapping
    public ResponseEntity<List<Odontologo>> buscarTodos(){
        return ResponseEntity.ok(odontologoService.mostrarTodos());
    }





}
