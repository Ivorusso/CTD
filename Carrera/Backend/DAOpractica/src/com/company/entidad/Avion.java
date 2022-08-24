package com.company.entidad;

public class Avion {
    private Long id;
    private String marca;
    private String modelo;
    private String matricula;
    private String fechaDeEntradaEnServicio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaDeEntradaEnServicio() {
        return fechaDeEntradaEnServicio;
    }

    public void setFechaDeEntradaEnServicio(String fechaDeEntradaEnServicio) {
        this.fechaDeEntradaEnServicio = fechaDeEntradaEnServicio;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", fechaDeEntradaEnServicio='" + fechaDeEntradaEnServicio + '\'' +
                '}';
    }
}
