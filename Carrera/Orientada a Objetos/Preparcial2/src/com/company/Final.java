package com.company;

public class Final extends Examen implements Comparable{
    private Double notaOral;
    private String descripcionTema;
    private Double promedioNotas;

    public Final(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String descripcionTema) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
        this.promedioNotas = (nota + notaOral) / 2;
    }


    @Override
    public int compareTo(Object object) {
        Final otroFinal = (Final) object;
        if (this.promedioNotas > otroFinal.promedioNotas){
            return 1;
        }
        if (this.promedioNotas < otroFinal.promedioNotas){
            return  -1;
        }
        return 0;
    }

    @Override
    public Boolean estaAprobado() {
        if(notaOral >= 4 && getNota() >= 4){
            return  true;
        }
        return false;
    }
}




