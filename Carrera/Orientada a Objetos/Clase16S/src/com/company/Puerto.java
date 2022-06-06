package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private String nombre;
    private List<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        contenedores = new ArrayList<>();
    }

    public void agregarContenedores(Contenedor contenedor){
        contenedores.add(contenedor);
        contenedores.sort(null);
    }

    public void mostrarContenedores(){
        for (Contenedor contenedor:contenedores) {
            System.out.println(contenedor);
        }
    }

    public Integer esPeligroso( ){
        Integer contenedorPeligroso = 0;
        for (Contenedor contenedor:contenedores) {
            if(contenedor.getMarca() && contenedor.getPais() == "Desconocido"){
                contenedorPeligroso ++;
            }
        }
        return contenedorPeligroso;
    }



}
