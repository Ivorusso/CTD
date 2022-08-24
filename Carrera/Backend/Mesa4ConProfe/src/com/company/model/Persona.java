package com.company.model;

import com.company.libreriaexterna.RegistroVacuna;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private String DNI;
    private String nombreVacuna;
    private LocalDate fecha;

    public Persona(String nombre, String apellido, String DNI, String nombreVacuna, LocalDate fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.nombreVacuna = nombreVacuna;
        this.fecha = fecha;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public Object[] datos()
    {
        Object[] informacion;
        informacion=new Object[2];
        informacion[0]=DNI;
        informacion[1]=fecha;
        return informacion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}





