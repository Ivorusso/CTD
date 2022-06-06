package com.company;

public class CajaDeAhorro extends Cuenta {

    public CajaDeAhorro(Integer numeroDeCliente, String apellido, Integer dni, Integer cuit, Double saldo) {
        super(numeroDeCliente, apellido, dni, cuit, saldo);
    }

    public void cobrarInteres(){
        System.out.println("Retiraste tu interes mensual");
    }
}
