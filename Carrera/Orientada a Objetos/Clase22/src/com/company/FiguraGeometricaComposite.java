package com.company;

import java.util.ArrayList;
import java.util.List;

public class FiguraGeometricaComposite implements FiguraGeometrica{

    private List<FiguraGeometrica> figuras;

    public FiguraGeometricaComposite() {
        figuras = new ArrayList<>();
    }
    public void agregarFigura(FiguraGeometrica figuraGeometrica){
        figuras.add(figuraGeometrica);
    }

    @Override
    public Double calcularSuperficie() {
        Double areaTotal = 0.0;
        System.out.println("Estoy recorriendo un conjunto de figuras");
        for (FiguraGeometrica figura : figuras) {
            areaTotal += figura.calcularSuperficie();
        }
        System.out.println("Recorri el conjunto y su superficie final es de " + areaTotal);
        return areaTotal;
    }
}
