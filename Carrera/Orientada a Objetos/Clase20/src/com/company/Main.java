package com.company;

public class Main {

    public static void main(String[] args) {
        Producto producto = new Producto("Leche", 20.0);
        Producto producto1 = new Producto("agua", 20.0);
        Producto producto2 = new Producto("fideos", 20.0);
        Producto producto3 = new Producto("gaseosa", 20.0);
        Carrito carrito = new Carrito();
       carrito.agregarProducto(producto);
       carrito.cancelar();
       carrito.agregarProducto(producto1);
       carrito.pasoAnterior();
       carrito.agregarProducto(producto2);
       carrito.pasoSiguiente();
       carrito.cancelar();


    }
}
