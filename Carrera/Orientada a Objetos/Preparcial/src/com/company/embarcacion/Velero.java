package com.company.embarcacion;

import com.company.Capitan;

public class Velero extends Embarcacion {
    private Integer cantidadMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }


    public Boolean esGrande(){
        if (cantidadMastiles > 4) {
            return true;
        }
        return  false;
    }
}
