package com.company;

public class Consulta {
    private String fechaDeConsulta;
    private String especialidad;
    private Double horaYMinuto;

    public Consulta(String fechaDeConsulta, String especialidad, Double horaYMinuto) {
        this.fechaDeConsulta = fechaDeConsulta;
        this.especialidad = especialidad;
        this.horaYMinuto = horaYMinuto;
    }
}
