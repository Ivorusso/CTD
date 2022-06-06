package com.company;

public class Main {

    public static void main(String[] args) {

        Reparacion reparacion = new Reparacion("batidora", 200.0,"cabildo");
        reparacion.pasoSiguiente();
        reparacion.darUnValor(200.0);
        System.out.println(reparacion.getCosto());
        reparacion.pasoSiguiente();
        reparacion.otraDireccion("casaBlanca");
        System.out.println(reparacion.getDireccionEntrega());
        reparacion.pasoSiguiente();


    }
}
