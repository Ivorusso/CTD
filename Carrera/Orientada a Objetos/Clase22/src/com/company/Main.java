package com.company;

public class Main {

    public static void main(String[] args) {
	Rectangulo rectangulo = new Rectangulo(5.0, 4.0);
    Circulo circulo = new Circulo(1.0);

    Rectangulo rectangulo1 = new Rectangulo(6.0, 4.0);
    Triangulo triangulo = new Triangulo(2.0, 2.0);

    FiguraGeometricaComposite figuraGeometricaComposite = new FiguraGeometricaComposite();
    figuraGeometricaComposite.agregarFigura(rectangulo);
    figuraGeometricaComposite.agregarFigura(circulo);
    figuraGeometricaComposite.agregarFigura(circulo);
    figuraGeometricaComposite.agregarFigura(circulo);

    Tren tren = new Tren();
    tren.agregarFigura(figuraGeometricaComposite);
    tren.calcularSuperficie();

    FiguraGeometricaComposite figuraGeometricaComposite1 = new FiguraGeometricaComposite();
        figuraGeometricaComposite1.agregarFigura(rectangulo1);
        figuraGeometricaComposite1.agregarFigura(rectangulo1);
        figuraGeometricaComposite1.agregarFigura(rectangulo1);
        figuraGeometricaComposite1.agregarFigura(circulo);
        figuraGeometricaComposite1.agregarFigura(circulo);
        figuraGeometricaComposite1.agregarFigura(triangulo);
        figuraGeometricaComposite1.calcularSuperficie();

        Tren tren1 = new Tren();
        tren1.agregarFigura(figuraGeometricaComposite1);
        tren1.calcularSuperficie();
    }
}
