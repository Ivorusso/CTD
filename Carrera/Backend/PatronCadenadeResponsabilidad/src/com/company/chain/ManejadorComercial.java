package com.company.chain;

import com.company.model.Correo;


public class ManejadorComercial extends Manejador{

    public ManejadorComercial(){
        this.direccionDeCorreoAsignada = "comercial@colmena.com";
        this.asuntoPorAtender = "comercial";
    }

    @Override
    public String comprobar(Correo email) {
        String mensaje = "";

        if(esValidoElCorreo(email)){
            mensaje = "comercial";
        }else{
            mensaje = siguienteManejador.comprobar(email);
        }

        return mensaje;
    }
}