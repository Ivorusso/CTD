package com.company;

public abstract class CuentaBancaria{
    private String numero;
    private Double saldo;

    public CuentaBancaria(String numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    abstract Double extraer(Double importe);

    abstract Double extraer();
}