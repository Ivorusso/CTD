package com.company;

import com.company.daos.OdontologoH2;
import com.company.entidad.Odontologo;
import com.company.servicios.OdontologoService;

public class Main {

    public static void main(String[] args) {
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoH2());
//
//        Odontologo odontologo =  new Odontologo();
//        odontologo.setNombre("ivan");
//        odontologo.setApellido("russo");
//        odontologo.setMatricula("A123");
//
//        Odontologo odontologo1 =  new Odontologo();
//        odontologo1.setNombre("ivan");
//        odontologo1.setApellido("rodriguez");
//        odontologo1.setMatricula("B123");
//
//
//        odontologoService.guardarOdontologo(odontologo);
//        odontologoService.guardarOdontologo(odontologo1);

//
//        odontologoService.eliminarOdontologo("A123");
//        odontologoService.eliminarOdontologo("B123");
//
//        odontologoService.mostrarTodos();
//
//        odontologoService.buscarOdontologo("A123");

    }
}
