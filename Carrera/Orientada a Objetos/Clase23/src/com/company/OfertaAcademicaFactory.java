package com.company;

import java.util.Base64;

public class OfertaAcademicaFactory {
    public static final String FRONT_END = "FRONTEND";
    public static final String BACK_END = "BACKEND";
    public static final String FULL_STACK = "FULLSTACK";

    private static OfertaAcademicaFactory instance;

    public OfertaAcademicaFactory() {
    }

    public static OfertaAcademicaFactory getInstance() {
        if (instance == null) {
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica generarOferta(String codigo) throws OfertaAcademicaException {
        switch (codigo) {
            case FRONT_END:
                return new Curso("FRONTEND", "Hago Diseños", 1000.0, 16.0, 2.0);
            case BACK_END:
                return new Curso("BACKEND", "Soy Programador", 900.0, 20.0, 2.0);
            case FULL_STACK:
                ProgramaIntensivo fullstack = new ProgramaIntensivo("FULLSTACK", "Frontend + Backend", 0.2);
                fullstack.agregarOfertaAcademica(generarOferta(FRONT_END));
                fullstack.agregarOfertaAcademica(generarOferta(BACK_END));
                return fullstack;
        }
        throw new OfertaAcademicaException(codigo + " No es un codigo valido");
    }
}
