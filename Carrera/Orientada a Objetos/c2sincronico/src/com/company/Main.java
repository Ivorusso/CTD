package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(esPrimo(180));

        System.out.println(maximoEntreTresNumeros(98, 156, 92));

        System.out.println(cadenasDeTextoDistintas("hola", "Hola"));

        System.out.println(esDivisible(8, 2));

    }

    public static boolean esDivisible(int numero1,int numero2) {
        if (numero1 % numero2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean esPrimo(int n) {
        Integer contador = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador = contador + 1;
            }
        }
        if (contador > 2) {
            return false;
        } else {
            return true;
        }
    }

    public static Integer maximoEntreTresNumeros(int n1, int n2, int n3) {
        if (n1 > n2) {
            if (n1 > n3) {
                return n1;
            } else {
                return n3;
            }
        } else if (n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static boolean cadenasDeTextoDistintas(String textoA, String textoB) {
        if (textoA == textoB) {
            return true;
        } else {
            return false;
        }
    }
}
