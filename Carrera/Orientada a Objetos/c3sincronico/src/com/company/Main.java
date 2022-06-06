package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(cualGana());


    }

    public static String cualGana() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre Jugador 1 ");
        String jugador1 = scanner.nextLine();
        System.out.println("Nombre Jugador 2");
        String jugador2 = scanner.nextLine();

        Integer piedra = 1;
        Integer papel = 2 ;
        Integer tijera = 3;

        Integer puntajeJ1 = 0;
        Integer puntajeJ2 = 0;
        Integer finalizar = 4;
        Integer jugadaJ1 =  0;
        Integer jugadaJ2 = 0;

        while (finalizar != jugadaJ1){
            System.out.println("PIEDRA PAPEL O TIJERA");
            System.out.println("Jugador 1 elige ");
            jugadaJ1 = scanner.nextInt();
            System.out.println("Jugador 2 elige");
            jugadaJ2 = scanner.nextInt();
        if (jugadaJ1 == piedra && jugadaJ2 == tijera ){
            System.out.println(1);
            puntajeJ1 ++;
        } else if (jugadaJ1 == piedra  && jugadaJ2 == papel){
            System.out.println(2);
            puntajeJ2 ++;
        } else if (jugadaJ1 == piedra && jugadaJ2 == piedra){
            System.out.println(0);
        } else if (jugadaJ2 == piedra  && jugadaJ1 == papel){
        System.out.println(1);
            puntajeJ1 ++;
        } else if (jugadaJ2 == piedra && jugadaJ1 == tijera){
        System.out.println(2);
            puntajeJ2 ++;
        }else if (jugadaJ2 == tijera && jugadaJ1 == tijera) {
            System.out.println(0);
        }else if (jugadaJ2 == tijera && jugadaJ1 == papel) {
            System.out.println(2);
            puntajeJ2 ++;
        }else if (jugadaJ1 == tijera && jugadaJ2 == papel) {
            System.out.println(1);
            puntajeJ1 ++;
        }else if (jugadaJ2 == papel && jugadaJ1 == papel) {
            System.out.println(0);
        }
        }
        String ganador = " ";
        if (puntajeJ1 > puntajeJ2){
            ganador = "Jugador 1";
        } else if (puntajeJ1 < puntajeJ2){
            ganador = "Jugador 2";
        } else{
            ganador = "Empate";
        }

        return ("El ganador es " + ganador);
    }
}