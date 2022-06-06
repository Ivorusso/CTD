package com.company;

public class Main {

    public static void main(String[] args) {

        Puerto puerto = new Puerto("Buenos Aires");
        puerto.agregarContenedores(new Contenedor(1,"China",false));
        puerto.agregarContenedores(new Contenedor(2,"Desconocido",true));

        puerto.mostrarContenedores();
        System.out.println(puerto.esPeligroso());

    }
}
