package com.company;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(Integer numeroDeCliente, String apellido, Integer dni, Integer cuit, Double saldo) {
        super(numeroDeCliente, apellido, dni, cuit, saldo);
    }


    @Override
    public Double extraer(Double montoAExtraer) {
        Double giroAlDescubierto = 1000.00;
        if (montoAExtraer > getSaldo()){
            System.out.println(getSaldo() - montoAExtraer - giroAlDescubierto);
            return  getSaldo();
        }else{
            System.out.println(montoAExtraer - getSaldo());
            return getSaldo() ;
        }
    }
}
