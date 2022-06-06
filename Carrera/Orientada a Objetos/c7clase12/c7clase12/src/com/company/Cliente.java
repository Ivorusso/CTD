package com.company;

public class Cliente {

    private Integer numeroDeCliente;
    private String dni;
    private String apellido;
    private String cuit;

    public Cliente(Integer numeroDeCliente, String dni, String apellido, String cuit) {
        this.numeroDeCliente = numeroDeCliente;
        this.dni = dni;
        this.apellido = apellido;
        this.cuit = cuit;
    }
}
