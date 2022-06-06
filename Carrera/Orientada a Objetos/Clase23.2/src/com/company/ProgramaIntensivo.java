package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {
    private Double descuento;
    private List<OfertaAcademica> ofertaAcademicas;

    public ProgramaIntensivo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        ofertaAcademicas = new ArrayList<>();
    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica) {
        ofertaAcademicas.add(ofertaAcademica);

    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (OfertaAcademica ofertaAcademica : ofertaAcademicas) {
            precioTotal += ofertaAcademica.calcularPrecio();
        }
        return precioTotal - (precioTotal * descuento);
    }
}
