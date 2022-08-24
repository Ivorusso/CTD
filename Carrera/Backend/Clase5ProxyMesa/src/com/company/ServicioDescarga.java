package com.company;

public class ServicioDescarga implements Descarga {


    @Override
    public void descargar(Usuario usuario) {
        System.out.println("Descargando Musica seleccionada");
    }
}
