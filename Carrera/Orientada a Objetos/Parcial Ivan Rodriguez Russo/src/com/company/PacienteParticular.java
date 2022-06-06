package com.company;

public class PacienteParticular extends Paciente {
    private Double precioConsulta;
    private Integer dni;

    public PacienteParticular(Consulta consulta, String fechaDeNacimiento, String nombre, String apellido, Boolean primerConsulta, Double precioConsulta, Integer dni) {
        super(consulta, fechaDeNacimiento, nombre, apellido, primerConsulta);
        this.precioConsulta = precioConsulta;
        this.dni = dni;
    }
}
