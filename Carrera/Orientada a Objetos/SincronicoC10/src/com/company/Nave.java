package com.company;

public class  Nave extends ObjetoGrafico {
    private Double velocidad;
    private Integer vida;

    public Nave(Integer posx, Integer posy, char direccion, Double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        vida = 3;
    }


    private void girar (char direccion){
        super.setDireccion(direccion);
    }


    @Override
    public void irA(Integer x, Integer y, char direccion){
        if (super.getDireccion() != direccion) {
            girar(direccion);
        }
        super.setPosx(x);
        super.setPosy(y);
    }




}
