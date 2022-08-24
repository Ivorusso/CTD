package com.company;

public abstract class Armador {

    public String prepararMenu(Menu menu){
        return armarPaquete(menu) + calcularCosto(menu);
    }

    protected abstract String armarPaquete(Menu menu);
    protected abstract String calcularCosto(Menu menu);


}
