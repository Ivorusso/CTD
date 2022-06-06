package com.company;

public class StateCargando implements StateCarrito{
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
        return new StatePagando();
    }

    @Override
    public StateCarrito volver() {
        return new StateVacio();
    }
}
