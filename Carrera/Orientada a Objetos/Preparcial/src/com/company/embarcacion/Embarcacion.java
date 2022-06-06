package com.company.embarcacion;

import com.company.Capitan;

import java.util.Date;

public abstract class  Embarcacion  {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioDeFabricacion;
    private Double eslora;


    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.eslora = eslora;
    }

    public Double calcularMontoAlquiler(){
        if (anioDeFabricacion > 2020){
            return precioBase + valorAdicional;
        }
        return precioBase;
    }


}
