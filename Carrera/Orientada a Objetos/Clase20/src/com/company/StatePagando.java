package com.company;

public class StatePagando implements StateCarrito{
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
        return new StateCerrado();
    }

    @Override
    public StateCarrito volver() {
        return new StateCargando();
    }
}
