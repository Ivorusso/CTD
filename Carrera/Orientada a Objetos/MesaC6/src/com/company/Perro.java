package com.company;

import java.time.LocalDate;
public class Perro {
    private String raza;
    private Integer añoDeNacimiento;
    private Double peso;
    private Boolean tieneChip;
    private String nombre;
    private Boolean estaLastimado;



    public Perro(String nombre, String raza, Double peso, Integer añoDeNacimiento, Boolean tieneChip, Boolean estaLastimado) {
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
        this.añoDeNacimiento = añoDeNacimiento;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        tieneChip = false;
        estaLastimado = true;
        peso = 2.0;
        añoDeNacimiento = 1998;
    }

    public Boolean sePuedePerder() {
        return !(tieneChip = true);
    }

    public Boolean estaEnAdopcion() {
            return !estaLastimado && peso > 5.0;
        }
    public Integer getEdad(){
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        return year - this.añoDeNacimiento;
    }

}
