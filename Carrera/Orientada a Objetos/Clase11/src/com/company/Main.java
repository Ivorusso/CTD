package com.company;

public class Main {

    public static void main(String[] args) {

        CajaDeAhorro cuenta = new CajaDeAhorro(1,"Rodriguez",44336435, 44336435, 10000.0);
        Cuenta cuenta1 = new CuentaCorriente(2,"Russo", 44336435, 44336435, 5000.0);

        cuenta.extraer(2000.0);
        cuenta.depositar(5000.0);
        cuenta.cobrarInteres();

        cuenta1.depositar(2000.0);
        cuenta1.extraer(6000.0);
    }
}
