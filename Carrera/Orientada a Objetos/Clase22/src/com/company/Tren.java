package com.company;

import java.util.ArrayList;
import java.util.List;

public class Tren {
    private List<FiguraGeometrica> figuras;

    public Tren() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(FiguraGeometrica figuraGeometrica){
        figuras.add(figuraGeometrica);
    }

    public Double calcularSuperficie() {
        Double areaTotal = 0.0;
        for (FiguraGeometrica figura : figuras) {
            areaTotal += figura.calcularSuperficie();
        }
        return areaTotal;
    }

}
