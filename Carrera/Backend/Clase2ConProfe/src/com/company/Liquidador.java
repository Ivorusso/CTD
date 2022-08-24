package com.company;

public abstract class Liquidador {


    public void liquidarSueldo(){
        //Calcular
        int monto;
        //Imprimir

        //Depositar

    }

    private void depositarDinero(int monto){
        System.out.println("La liquidacion generada es un documento digital. saldo a liquidar " + monto);
    }

    public abstract String liquidarSueldo(Empleado empleado);
}
