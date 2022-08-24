package com.company.test;

import com.company.model.Correo;
import com.company.service.ValidadorDeCorreos;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ValidadorDeCorreosTest {

    private Correo correo;
    private ValidadorDeCorreos sujetoDePrueba;

    @BeforeAll
    public void init(){
        sujetoDePrueba = new ValidadorDeCorreos();
    }

    @BeforeEach
    public void initForEach(){
        correo = new Correo();
    }

    @Test
    public void comprobar_deberíaIdentificarElCorreoComoSpam(){
        //DADO
        correo.setOrigen("mio@mail.com");
        correo.setDestino("qqq@unknown.com");
        correo.setAsunto("win 100USD per day!!!");

        //CUANDO
        boolean resultado = sujetoDePrueba.comprobar(correo);

        //ENTONCES
        Assertions.assertFalse(resultado);
    }


    @Test
    public void comprobar_deberíaIdentificarElCorreoComoValido(){
        //DADO
        correo.setOrigen("mio@mail.com");
        correo.setDestino("soporte@tecnica.com");
        correo.setAsunto("impresora");

        //CUANDO
        boolean resultado = sujetoDePrueba.comprobar(correo);

        //ENTONCES
        Assertions.assertTrue(resultado);
    }

}