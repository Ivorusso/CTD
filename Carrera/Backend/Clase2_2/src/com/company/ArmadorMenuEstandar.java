package com.company;

public class ArmadorMenuEstandar extends Armador {

    @Override
    protected String armarPaquete(Menu menu) {
        return "Armando menu estandar. ";
    }

    @Override
    protected String calcularCosto(Menu menu) {
        return "El precio del menu es: $" + menu.getPrecioBase();

    }
}
