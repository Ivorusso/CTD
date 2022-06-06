package com.company;

public class CuentaCorriente extends CuentaBancaria{
    private Double descubierto;
    protected Double saldo;

    public CuentaCorriente(String numero, Double saldo, Double descubierto) {
        super(numero, saldo);
        this.descubierto = descubierto;
        descubierto = 1000.00;
    }

    public Double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(Double descubierto) {
        this.descubierto = descubierto;
    }
    public Double depositar() {
        Double importe = 0.00;
        return descubierto + importe;
    }

    public Double extraer(Double importe){
        if (importe > descubierto + saldo){
            return descubierto + saldo;
        }
        else
        return null;
    }

    @Override
    Double extraer(){
        return  1000.00;

    }
}
