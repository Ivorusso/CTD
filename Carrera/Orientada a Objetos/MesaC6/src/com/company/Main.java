package com.company;

public class Main {

    public static void main(String[] args) {
        Perro perro = new Perro("Sultan", "Golden", 8.0, 2002, true, false);
        System.out.println(perro.sePuedePerder());
        System.out.println(perro.estaEnAdopcion());
        System.out.println(perro.getEdad());

        Perro perro1 = new Perro("Fito", "Dogo");
        System.out.println(perro1.sePuedePerder());
        System.out.println(perro1.estaEnAdopcion());
        System.out.println(perro1.getEdad());
    }
}
