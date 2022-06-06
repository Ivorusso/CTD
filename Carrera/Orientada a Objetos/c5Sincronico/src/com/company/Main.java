package com.company;

import javax.security.auth.callback.ConfirmationCallback;

public class Main {

    public static void main(String[] args) {

        UsuarioJuego usuarioJuego = new UsuarioJuego("Ivan","1234");

        System.out.println(usuarioJuego.getNombre());
        usuarioJuego.aumentarPuntaje();
        System.out.println(usuarioJuego.getPuntaje());
        usuarioJuego.subirNivel();
        System.out.println(usuarioJuego.getNivel());
        usuarioJuego.bonus(2);
        System.out.println(usuarioJuego.getPuntaje());









}
}
