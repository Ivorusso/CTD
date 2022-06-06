package com.company;

public class Pelota extends Producto{
    private Double radio;

    public Pelota(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularEspacio() {
        return (4/3) * Math.PI * Math.pow(radio, 3.0);
    }
}
