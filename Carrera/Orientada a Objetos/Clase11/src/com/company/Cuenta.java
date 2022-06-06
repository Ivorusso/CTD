package com.company;


public abstract class  Cuenta extends Cliente{
    private Double saldo;


    public Cuenta(Integer numeroDeCliente, String apellido, Integer dni, Integer cuit, Double saldo) {
        super(numeroDeCliente, apellido, dni, cuit);
        this.saldo = saldo;
    }

    public  Double depositar(Double montoADepositar){
        System.out.println(saldo + montoADepositar);
        return saldo;
    }

    public Double extraer(Double montoAExtraer){
        System.out.println(saldo - montoAExtraer);
        return saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}
