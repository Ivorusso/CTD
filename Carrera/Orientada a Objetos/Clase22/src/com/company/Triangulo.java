package com.company;

public class Triangulo implements FiguraGeometrica{
    private Double base;
    private Double altura;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularSuperficie() {
        double area = base * (altura/2);

        System.out.println("Encontre un Triangulo y su superficie es de " + area);
        return area;
    }
}
