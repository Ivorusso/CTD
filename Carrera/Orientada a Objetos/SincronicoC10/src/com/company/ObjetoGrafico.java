package com.company;

public class ObjetoGrafico {

    private Integer posx;
    private Integer posy;
    private char direccion;

    ObjetoGrafico(Integer posx, Integer posy, char direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void irA(Integer x, Integer y, char direccion){
        this.posx = x;
        this.posy = y;
        this.direccion = direccion;
    }

    public void setPosx(Integer posx) {
        this.posx = posx;
    }

    public void setPosy(Integer posy) {
        this.posy = posy;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public Integer getPosx() {
        return posx;
    }

    public Integer getPosy() {
        return posy;
    }

    public char getDireccion() {
        return direccion;
    }
}
