package com.company;

public class Main {

    public static void main(String[] args) {

        ObjetoGrafico objetoGrafico = new ObjetoGrafico(5, 2, 'N');
        Asteroide asteroide  = new Asteroide(6, 4, 'O', 2);
        Nave nave = new Nave(8, 2, 'S', 200.00);
        System.out.println(nave.getDireccion());
        nave.irA(2, 3, 'N');
        System.out.println(nave.getDireccion());

    }
}
