package com.company;

import com.company.daos.AvionDAOH2;
import com.company.entidad.Avion;
import com.company.servicios.AvionService;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Avion avion = new Avion();
//        avion.setId(1L);
//        avion.setMarca("caza");
//        avion.setModelo("1B");
//        avion.setMatricula("123ABC");
//        avion.setFechaDeEntradaEnServicio("15/8/2022");
//
//        Avion avion1 = new Avion();
//        avion1.setId(2L);
//        avion1.setMarca("caza");
//        avion1.setModelo("1C");
//        avion1.setMatricula("456ABC");
//        avion1.setFechaDeEntradaEnServicio("16/8/2022");

        AvionService avionService = new AvionService();
        //SETEAMOS DAO
        avionService.setAvionIDao(new AvionDAOH2());

//        avionService.guardarAvion(avion);
//        avionService.guardarAvion(avion1);

//        avionService.eliminarAvion(1L);
//        avionService.eliminarAvion(2L);

        System.out.println(avionService.buscarAvion(1L));

    }
}
