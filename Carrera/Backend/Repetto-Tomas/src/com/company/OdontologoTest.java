package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OdontologoTest {

    @Test
    public void puedoDarDeAlta(){

        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoH2());

        odontologoService.eliminarOdontologo(1L);
        Odontologo odontologo1 = new Odontologo();
        odontologo1.setId(1L);
        odontologo1.setMatricula("A1");
        odontologo1.setNombre("Tomas");
        odontologo1.setApellido("Repetto");

        odontologoService.guardarOdontologo(odontologo1);

    }

    @Test
    public void puedoBuscar(){
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoH2());
        odontologoService.eliminarOdontologo(1L);
        Odontologo odontologo1 = new Odontologo();
        odontologo1.setId(1L);
        odontologo1.setMatricula("A1");
        odontologo1.setNombre("Tomas");
        odontologo1.setApellido("Repetto");
        odontologoService.guardarOdontologo(odontologo1);
        odontologoService.buscarOdontologo(1L);
        Assertions.assertNotNull(odontologo1);
    }

    @Test
    public void puedoListar(){
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoH2());
        String resultadoEsperado ="[Odontologo{id=1, matricula='A1', nombre='Tomas', apellido='Repetto'}, Odontologo{id=2, matricula='A2', nombre='tomi', apellido='rep'}]";
        odontologoService.eliminarOdontologo(1L);
        odontologoService.eliminarOdontologo(2L);
        Odontologo odontologo1 = new Odontologo();
        odontologo1.setId(1L);
        odontologo1.setMatricula("A1");
        odontologo1.setNombre("Tomas");
        odontologo1.setApellido("Repetto");
        Odontologo odontologo2 = new Odontologo();
        odontologo2.setId(2L);
        odontologo2.setMatricula("A2");
        odontologo2.setNombre("tomi");
        odontologo2.setApellido("rep");
        odontologoService.guardarOdontologo(odontologo1);
        odontologoService.guardarOdontologo(odontologo2);
        odontologoService.mostrarTodos();

        Assertions.assertEquals(resultadoEsperado, odontologoService.mostrarTodos().toString());

    }

    @Test
    public void puedoDarDeBaja(){
        OdontologoService odontologoService = new OdontologoService();
        odontologoService.setOdontologoIDao(new OdontologoH2());
        odontologoService.eliminarOdontologo(1L);
        odontologoService.eliminarOdontologo(2L);
        Assertions.assertFalse((odontologoService.buscarOdontologo(1L) != null));
        Assertions.assertFalse((odontologoService.buscarOdontologo(2L) != null));

    }
}
