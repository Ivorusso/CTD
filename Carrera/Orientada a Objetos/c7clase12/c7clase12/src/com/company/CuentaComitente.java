package com.company;

public class CuentaComitente extends Cuenta{
    private String claveDeValidacion;


    public CuentaComitente(Cliente titular, Double saldo, String cnv) {
        super(titular, saldo);
        this.claveDeValidacion = cnv;
    }


    @Override
    public void depositar(Double monto) {
        if (monto > 0) {
            super.depositar(monto * 0.99);

        }
    }


    public void extraer(Double monto, String cnv) {

        if (claveDeValidacion == cnv && getSaldo() >= monto) {
            super.extraer(monto);
            informarSaldo();
        }
        else if (getSaldo() >= monto){
            super.extraer(monto*0.5);
            informarSaldo();
        }
    }
}



