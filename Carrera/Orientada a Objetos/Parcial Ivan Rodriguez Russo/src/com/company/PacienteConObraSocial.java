package com.company;

public class PacienteConObraSocial extends Paciente implements Comparable {
    private String nombreObraSocial;
    private Integer numeroDeAsociado;

    public PacienteConObraSocial(Consulta consulta, String fechaDeNacimiento, String nombre, String apellido, Boolean primerConsulta, String nombreObraSocial, Integer numeroDeAsociado) {
        super(consulta, fechaDeNacimiento, nombre, apellido, primerConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroDeAsociado = numeroDeAsociado;
    }

    @Override
    public int compareTo(Object object) {
        PacienteConObraSocial otroPacienteConObraSocial = (PacienteConObraSocial) object;
        if (this.numeroDeAsociado > otroPacienteConObraSocial.numeroDeAsociado){
            return 1;
        }
        if (this.numeroDeAsociado < otroPacienteConObraSocial.numeroDeAsociado){
            return -1;
        }
        return 0;
    }
}
