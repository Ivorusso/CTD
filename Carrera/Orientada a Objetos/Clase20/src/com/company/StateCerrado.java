package com.company;

public class StateCerrado implements StateCarrito{
    @Override
    public StateCarrito agregando(Producto producto) {
        return this;
    }

    @Override
    public StateCarrito cancelado() {
        return new StateVacio();
    }

    @Override
    public StateCarrito seguir() {
        return new StateVacio();
    }

    @Override
    public StateCarrito volver() {
        return this;
    }
}
