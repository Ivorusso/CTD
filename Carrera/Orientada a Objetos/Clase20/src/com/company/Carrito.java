package com.company;

public class Carrito {
    private Producto producto;
    private StateCarrito estadoActual;

    public Carrito() {
        this.producto = producto;
        this.estadoActual = new StateVacio();
    }


    public void agregarProducto(Producto producto){
        estadoActual = estadoActual.agregando(producto);
        System.out.println(estadoActual);
    }

    public void cancelar(){
        estadoActual = estadoActual.cancelado();
        System.out.println(estadoActual);
    }

    public void pasoAnterior(){
        estadoActual = estadoActual.volver();
        System.out.println(estadoActual);
    }

    public void pasoSiguiente(){
        estadoActual = estadoActual.seguir();
        System.out.println(estadoActual);
    }



}
