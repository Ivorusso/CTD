package com.company;

public interface StateCarrito {
    public StateCarrito agregando(Producto producto);
    public StateCarrito cancelado();
    public StateCarrito seguir();
    public StateCarrito volver();
}
