package com.company;

public class Caja extends Producto {
    private Double longitud;
    private Double ancho;
    private Double altura;

    public Caja(Double longitud, Double ancho, Double altura) {
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public Double calcularEspacio() {
        return  longitud*ancho*altura;
    }
}
