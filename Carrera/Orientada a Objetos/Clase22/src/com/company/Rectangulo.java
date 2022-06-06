package com.company;

public class Rectangulo implements FiguraGeometrica{
    private Double alto;
    private Double largo;

    public Rectangulo(Double alto, Double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public Double calcularSuperficie() {
        double area = alto * largo;
        System.out.println("Encontre un Rectangulo y su superficie es de " + area);
        return area;
    }
}
