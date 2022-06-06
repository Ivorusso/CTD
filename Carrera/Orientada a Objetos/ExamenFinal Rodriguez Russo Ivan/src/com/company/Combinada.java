package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Pizza {

    private List<Pizza> pizzas;

    public Combinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    public void agregarPizza (Pizza pizza){
        pizzas.add(pizza);
    }

    @Override
    public Double calcularPrecio() {
      Double  precioCombinada = 0.0;
        for (Pizza pizza:pizzas) {
            precioCombinada += (pizza.calcularPrecio() / 2);
        }
        return precioCombinada;
    }
}
