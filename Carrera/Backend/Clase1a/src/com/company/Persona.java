package com.company;

public class Persona {
    private int edad;
    private String nombre;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getnombre() {
        return this.nombre;
    }

    public int getedad() {
        return this.edad;
    }
}
