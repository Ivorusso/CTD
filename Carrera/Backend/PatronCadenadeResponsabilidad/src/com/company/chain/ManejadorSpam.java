package com.company.chain;


import com.company.model.Correo;

public class ManejadorSpam extends Manejador{

    // --------------------------------------------------

    @Override
    public String comprobar(Correo email){
        return MENSAJE_SPAM;
     }
}
