package com.company;

public class Reparacion{

    private String nombreArticulo;
    private Double costo;
    private String direccionEntrega;
    private StateReparacion estadoActual;

    public Reparacion(String nombreArticulo, Double costo, String direccionEntrega) {
        this.nombreArticulo = nombreArticulo;
        this.costo = costo;
        this.direccionEntrega = direccionEntrega;
        this.estadoActual = new StatePresupuesto();
    }

    public void pasoSiguiente(){
        estadoActual = estadoActual.pasarSiguientePaso();
        System.out.println(estadoActual);
    }

    public String otraDireccion(String nuevaDireccion){
        try {
            estadoActual = estadoActual.cambiarDireccion();
        } catch (StateReparacionException e) {
            e.printStackTrace();
        }
        System.out.println(estadoActual);
        return  direccionEntrega = nuevaDireccion;
    }


    public Double darUnValor(Double valorRepuestos){
        try {
            estadoActual = estadoActual.darValorDelPresupuesto();
        } catch (StateReparacionException e) {
            e.printStackTrace();
        }
        System.out.println(estadoActual);
        return costo += valorRepuestos;
    }


    public void ponerMasRepuestos(){
        try {
            estadoActual = estadoActual.agregarRepuestos();
        } catch (StateReparacionException e) {
            e.printStackTrace();
        }
        System.out.println(estadoActual);
    }

    public Double getCosto() {
        return costo;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }
}
