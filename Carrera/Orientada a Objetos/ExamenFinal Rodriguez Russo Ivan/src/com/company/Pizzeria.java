package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private String nombre;
    private List<Pizza> pizzas;


    public Pizzeria(String nombre) {
        this.nombre = nombre;
        pizzas = new ArrayList<>();
    }

    public void agregarPizza (String codigoPizza){
        try {pizzas.add(PizzaFactory.getInstance().hacerPizza(codigoPizza));
        }catch (PizzaException e){
            System.out.printf(e.getMessage());
        }
    }

    public void mostrarPizzas(){
        for (Pizza pizza:pizzas) {
            System.out.println(pizza);
        }

    }
}

