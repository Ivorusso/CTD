package com.company;

public class Main {

    public static void main(String[] args) {

        Consulta consulta = new Consulta("4/4/2022","abc",18.32);
        Consulta consulta1 = new Consulta("4/4/2022", "abcd", 18.37);
        Consulta consulta2 = new Consulta("/4/4/2022", "abcde", 18.38);
        PacienteParticular pacienteParticular = new PacienteParticular(consulta,"19/04/02","Ivan","Rodriguez Russo", true, 200.0, 44336435);
        PacienteConObraSocial pacienteConObraSocial = new PacienteConObraSocial(consulta1, "19/04/02", "Juan", "Rodriguez", false, "Osde", 1);
        PacienteConObraSocial pacienteConObraSocial2 = new PacienteConObraSocial(consulta2, "19/04/02", "Juan", "Perez", false, "Osde", 2);


        System.out.println(pacienteParticular.evaluarHistoriaClinica());
        System.out.println(pacienteConObraSocial.evaluarHistoriaClinica());
        System.out.println(pacienteConObraSocial2.evaluarHistoriaClinica());

        System.out.println("Paciente es mayor a Paciente2"+ pacienteConObraSocial.compareTo(pacienteConObraSocial2)) ;


    }
}
