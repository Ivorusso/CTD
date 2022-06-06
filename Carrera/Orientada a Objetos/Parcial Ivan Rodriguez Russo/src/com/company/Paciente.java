package com.company;

public abstract class Paciente {
    private Consulta consulta;
    private String fechaDeNacimiento;
    private String nombre;
    private String apellido;
    private Boolean primerConsulta;

    public Paciente(Consulta consulta, String fechaDeNacimiento, String nombre, String apellido, Boolean primerConsulta) {
        this.consulta = consulta;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.primerConsulta = primerConsulta;
    }

    public String evaluarHistoriaClinica(){
        if(primerConsulta == true) {
            return "Evaluar si se debe hacer Historia Clinica ";
        }else{
            return  "No se Debe Evaluar";
        }
    }
}
