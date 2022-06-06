package com.company;

import java.util.List;

public abstract class Pizza {

    private  String nombre;
    private String descripcion;

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString(){
        return "Pizza: " + nombre + " Precio: " + calcularPrecio();
    }
}

