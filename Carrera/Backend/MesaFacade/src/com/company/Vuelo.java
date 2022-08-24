package com.company;

public class Vuelo {
    private String fechaDeSalida;
    private String fechaDeRegreso;
    private String origenDeSalida;
    private String destino;

    public Vuelo(String fechaDeSalida, String fechaDeRegreso, String origenDeSalida, String destino) {
        this.fechaDeSalida = fechaDeSalida;
        this.fechaDeRegreso = fechaDeRegreso;
        this.origenDeSalida = origenDeSalida;
        this.destino = destino;
    }

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public String getFechaDeRegreso() {
        return fechaDeRegreso;
    }

    public void setFechaDeRegreso(String fechaDeRegreso) {
        this.fechaDeRegreso = fechaDeRegreso;
    }

    public String getOrigenDeSalida() {
        return origenDeSalida;
    }

    public void setOrigenDeSalida(String origenDeSalida) {
        this.origenDeSalida = origenDeSalida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
