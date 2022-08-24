package com.company;

public class Usuario {

    private String nombre;
    private Integer id;
    private String email;
    private boolean esPremium;

    public Usuario(String nombre, Integer id, String email, boolean esPremium) {
        this.nombre = nombre;
        this.id = id;
        this.email = email;
        this.esPremium = esPremium;
    }

    public boolean getEsPremium() {
        return esPremium;
    }
}
