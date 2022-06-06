package com.company;

public class Main {

    public static void main(String[] args) {
        Alumno alumno = new Alumno("Maria","Gerva",1);
        Alumno alumno2 = new Alumno("Clark","Kent",2);


        Parcial parcial = new Parcial(alumno,"poo","Java",7.0,1,1);
        System.out.println("se puede recuperar el parcial?:" + parcial.puedoRecuperar());

        Parcial parcial2 = new Parcial(alumno2,"poo","Java",9.0,1,3);
        System.out.println("se puede recuperar el parcial?:" + parcial2.puedoRecuperar());
        System.out.println("esta aprobado el parcial?: "+parcial2.estaAprobado());


        Final final1 = new Final(alumno,"poo","java",5.0,5.0,"java");
        System.out.println("esta aprobado el final?: "+final1.estaAprobado());

        Final final2 = new Final(alumno2,"poo","java",3.0,5.0,"java");
        System.out.println("esta aprobado el final2?: "+final2.estaAprobado());

        System.out.println("final1 es mayor a final2?: "+ final1.compareTo(final2));
    }
}


