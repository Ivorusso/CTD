package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorTest {
    @Test
    public void deberiaAdminitirSoloLasPersonasQueCumplenConElCriterio(){
        //DADOS
        Gestor sujetoDePrueba = new Gestor();
        Persona p1 = new Persona("Juan", 17);
        Persona p2 = new Persona("Pedro", 18);
        Persona p3 = new Persona("Ana", 22);
        Persona p4 = new Persona("Luz", 14);
        Persona p5 = new Persona("Julian", 32);
        //CUANDO
        sujetoDePrueba.agregar(p1);
        sujetoDePrueba.agregar(p2);
        sujetoDePrueba.agregar(p3);
        sujetoDePrueba.agregar(p4);
        sujetoDePrueba.agregar(p5);

        //ENTONCES
        Assertions.assertTrue(sujetoDePrueba.getListaDePersonas().size() == 2);
    }
}