package com.company;

public class Cheque {

    private String banco;
    private Double valor;

    public Cheque(String banco, Double valor) {
        this.banco = banco;
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
}
