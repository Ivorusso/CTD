package com.company;

public class Contenedor implements Comparable<Contenedor> {
    private Integer numero;
    private String pais;
    private Boolean marca;

    public Contenedor(Integer numero, String pais, Boolean marca) {
        this.numero = numero;
        this.pais = pais;
        this.marca = marca;
    }

    public Boolean getMarca() {
        return marca;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        if (this.numero > contenedor.numero){
            return 1;
        }
        if (this.numero < contenedor.numero){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Contenedor" + "numero=" + numero + ", pais='" + pais +  ", Esta marcado=" + marca;
    }
}
