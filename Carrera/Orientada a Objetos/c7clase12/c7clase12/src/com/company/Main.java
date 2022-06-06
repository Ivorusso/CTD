package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

          Cliente cliente = new Cliente(1,"1234","Colombo","1234");

//        Cuenta cuentaCorriente = new CuentaCorriente(cliente,1000.0);
//
//        cuentaCorriente.extraer(1500.0);
//
//        CuentaCajaDeAhorro cuentaCajaDeAhorro = new CuentaCajaDeAhorro(cliente,2000.0,0.0);
//
//        cuentaCajaDeAhorro.extraer(1000.0);
//
//        cuentaCajaDeAhorro.informarSaldo();
//
//        cuentaCajaDeAhorro.cobrarInteres();
//
//        Cheque cheque = new Cheque("banco de springfield",1000.0);
//
//
//
//        ((CuentaCorriente)cuentaCorriente).depositar(cheque);

        CuentaComitente cuentaComitente = new CuentaComitente(cliente, 1000.0, "asd");



    }
}
