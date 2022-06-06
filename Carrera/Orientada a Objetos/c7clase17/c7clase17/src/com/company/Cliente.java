package com.company;

public class Cliente {

    private String nombre;
    private String apellido;
    private Integer dni;
    private Double saldo;
    private Double deuda;
    private Double limite;

    public Cliente(String nombre, String apellido, Integer dni, Double limite) throws ClienteException {

        if(limite <0){
            throw new ClienteException("limite no valido");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.limite = limite;
        deuda = 100.0;
        saldo = 0.0;
    }

    public void saldarDeudar(Double monto) throws ClienteException{
        if(monto <= 0){
            throw new ClienteException("no podes ingresar montos negativos");
        }
        if(deuda < monto){
            throw new ClienteException("tu deuda es de " + deuda + " e intentaste pagar " + monto);
        }
        deuda -= monto;
    }

    public Double getLimite() {
        return limite;
    }
}
