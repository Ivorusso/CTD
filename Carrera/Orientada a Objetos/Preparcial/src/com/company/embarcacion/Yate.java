package com.company.embarcacion;

import com.company.Capitan;

public class Yate extends  Embarcacion implements Comparable {
    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }


    public  int compareTo(Object object){
        Yate otroYate = (Yate) object;

        if (this.cantidadCamarotes > otroYate.cantidadCamarotes){
            return  1;
        }
        if (this.cantidadCamarotes < otroYate.cantidadCamarotes){
            return -1;
        }
        return 0;
    }
}
