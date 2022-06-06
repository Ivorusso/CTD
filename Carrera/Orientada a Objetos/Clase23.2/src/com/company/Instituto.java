package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertaAcademica> ofertaAcademicas;
    public Instituto() {
        ofertaAcademicas = new ArrayList<>();
    }


    public void agregarOfertaAcademica(String codigo) {
        try {
            ofertaAcademicas.add(OfertaAcademicaFactory.getInstance().generarOferta(codigo));
        }catch (OfertaAcademicaException e) {
            System.out.println(e.getMessage());
        }

    }


    public void generarInforme(){
        for (OfertaAcademica ofertaAcademica:ofertaAcademicas) {
            System.out.println(ofertaAcademica);

        }

    };
}

