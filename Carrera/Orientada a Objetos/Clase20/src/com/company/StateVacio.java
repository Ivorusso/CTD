package com.company;

public class StateVacio implements StateCarrito{

    @Override
    public StateCarrito agregando(Producto producto) {
        return new StateCargando();
    }

    @Override
    public StateCarrito cancelado() {
        return this;
    }

    @Override
    public StateCarrito seguir() {
        return new StateCargando();
    }

    @Override
    public StateCarrito volver() {
        return this;
    }
}
