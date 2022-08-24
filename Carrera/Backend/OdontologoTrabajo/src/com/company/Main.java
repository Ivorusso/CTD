package com.company;

import com.company.daos.OdontologoDAOH2;
import com.company.entidad.Odontologo;
import com.company.servicios.OdontologoService;

public class Main {

    public static void main(String[] args) {

        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoDAOH2());

//        Odontologo odontologo =  new Odontologo();
//        odontologo.setId(3L);
//        odontologo.setNombre("Juan");
//        odontologo.setApellido("Blanco");
//        odontologo.setMatricula("A123");
//
//        Odontologo odontologo1 =  new Odontologo();
//        odontologo.setId(2L);
//        odontologo.setNombre("Guille");
//        odontologo.setApellido("Saloiña");
//        odontologo.setMatricula("B123");

//        odontologoService.guardarOdontologo(odontologo);
//        odontologoService.guardarOdontologo(odontologo1);

        Odontologo odontologo =  odontologoService.buscarOdontologo(3L);
        System.out.println(odontologo);

    }
}
