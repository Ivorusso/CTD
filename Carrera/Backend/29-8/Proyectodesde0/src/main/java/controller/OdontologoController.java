package controller;

import daos.OdontologoH2;
import entidad.Odontologo;
import servicios.OdontologoService;

public class OdontologoController {

    private OdontologoService odontologoService = new OdontologoService(new OdontologoH2());


    @PostMapping()
    public ReponseEntity<Odontologo> registrarOdontologo(@RequestBody Odontologo odontologo){
        return  ResponseEntity.ok(odontologoService.guardarOdontologo(odontologo));
    }


}
