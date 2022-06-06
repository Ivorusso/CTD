package com.company;

public class Parcial extends Examen{
    private Integer unidad;
    private Integer reintentosRestantes;

    public Parcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer unidad, Integer reintentosRestantes) {
        super(alumno, titulo, enunciado, nota);
        this.unidad = unidad;
        this.reintentosRestantes = reintentosRestantes;
    }


    public String puedoRecuperar(){
        if(unidad <= 3){
            reintentosRestantes = 3;
            return "Aun quedan " + reintentosRestantes + "reintentos restantes";
        }
        {
            reintentosRestantes = 2;
            return "Aun quedan " + reintentosRestantes + "reintentos restantes";
        }

    }
}
