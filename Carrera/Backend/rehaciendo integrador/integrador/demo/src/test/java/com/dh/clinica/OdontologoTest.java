package com.dh.clinica;

import com.Clinica.daos.OdontologoDaoH2;
import com.Clinica.servicios.OdontologoService;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4.class)
@SpringBootTest
public class OdontologoTest {

    @Test
    public void puedoGuardarUnOdontologo(){
        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());
        //DADO
        entidad.Odontologo odontologo =  new entidad.Odontologo();
        odontologo.setNombre("ivan");
        odontologo.setApellido("russo");
        odontologo.setMatricula("A123");
        //CUANDO
        odontologoService.guardarOdontologo(odontologo);
        //ENTONCES
        Assertions.assertTrue((odontologoService.buscarOdontologo(1) != null));
    }


    @Test
    public void buscarOdontologoPorMatricula(){
        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());
        odontologoService.eliminarOdontologo(1);

        entidad.Odontologo odontologo =  new entidad.Odontologo();
        odontologo.setNombre("ivan");
        odontologo.setApellido("russo");
        odontologo.setMatricula("A123");
        odontologoService.guardarOdontologo(odontologo);

        odontologoService.buscarOdontologo(1);
        Assertions.assertNotNull(odontologo);
    }

    @Test
    public void eliminarOdontologo(){
        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

        odontologoService.eliminarOdontologo(1);
        Assertions.assertNull(odontologoService.buscarOdontologo(1));
    }

    @Test
    public void mostrarTodosLosOdontologos(){
        OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());
        odontologoService.eliminarOdontologo(1);
        odontologoService.eliminarOdontologo(2);
        odontologoService.eliminarOdontologo(3);
        odontologoService.eliminarOdontologo(4);
        String resultadoEsperado = "[Odontologo{matricula='C123', nombre='ivan', apellido='russo'}, Odontologo{matricula='D123', nombre='ivan2', apellido='rodriguez'}]";

        entidad.Odontologo odontologo =  new entidad.Odontologo();
        odontologo.setNombre("ivan");
        odontologo.setApellido("russo");
        odontologo.setMatricula("C123");

        entidad.Odontologo odontologo1 =  new entidad.Odontologo();
        odontologo1.setNombre("ivan2");
        odontologo1.setApellido("rodriguez");
        odontologo1.setMatricula("D123");

        odontologoService.guardarOdontologo(odontologo);
        odontologoService.guardarOdontologo(odontologo1);

        Assertions.assertEquals(resultadoEsperado, odontologoService.mostrarTodos().toString());


    }
}


