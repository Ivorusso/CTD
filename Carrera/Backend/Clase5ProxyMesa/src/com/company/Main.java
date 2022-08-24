package com.company;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("ivo", 1, "ivo@ivo.com", true);
        Usuario usuario1 = new Usuario("ivo", 2, "ivo@ivo.com", false);

        ServicioDescargaProxy servicioDescargaProxy = new ServicioDescargaProxy();

        servicioDescargaProxy.descargar(usuario);
        servicioDescargaProxy.descargar(usuario1);
    }
}
