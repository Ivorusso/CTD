package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class Gestor {


    private ArrayList<Persona> listaDePersonas = new ArrayList<>();

    public void agregar(Persona p) {
        if (p.getnombre().length() >= 5 && p.getedad() >= 18){
            this.listaDePersonas.add(p);
        }
    }

    public ArrayList<Persona> getListaDePersonas() {
        return this.listaDePersonas;
    }


}
