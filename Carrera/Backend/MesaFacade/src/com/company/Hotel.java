package com.company;

public class Hotel {
    private String fechaDeEntrada;
    private String fechaDeEgreso;
    private String ciudad;

    public Hotel(String fechaDeEntrada, String fechaDeEgreso, String ciudad) {
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeEgreso = fechaDeEgreso;
        this.ciudad = ciudad;
    }

    public String getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public void setFechaDeEntrada(String fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }

    public String getFechaDeEgreso() {
        return fechaDeEgreso;
    }

    public void setFechaDeEgreso(String fechaDeEgreso) {
        this.fechaDeEgreso= fechaDeEgreso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
