package com.company;

public class Circulo implements FiguraGeometrica{
    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularSuperficie() {
        double area = radio * radio * Math.PI;
        System.out.println("Encontre un Circulo y su superficie es de " + area);
        return area;
    }
}
