package com.company;

public class Simple extends Pizza {
    private Double precioBase;
    private Boolean esGrande;

    public Simple(String nombre, String descripcion, Double precioBase, Boolean esGrande) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.esGrande = esGrande;
    }

    @Override
    public Double calcularPrecio() {
        if (esGrande == true){
            return precioBase * 2;
        }
        return precioBase;
    }
}
