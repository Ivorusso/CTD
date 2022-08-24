package com.company;

public class ServicioDescargaProxy implements Descarga{
    @Override
    public void descargar(Usuario usuario) {
        ServicioDescarga servicio = new ServicioDescarga();
        if (usuario.getEsPremium() == true){
            servicio.descargar(usuario);
        }else{
            System.out.println("Debe ser premium para descargar");
        }
    }
}
