package com.company;

public class StateFinalizado implements StateReparacion{
    @Override
    public StateReparacion pasarSiguientePaso() {
        return this;
    }

    @Override
    public StateReparacion cambiarDireccion() throws StateReparacionException{
        throw new StateReparacionException("No se puede cambiar la direccion de una reparacion en estado de Finalizado");
    }

    @Override
    public StateReparacion darValorDelPresupuesto() throws StateReparacionException{
        throw new StateReparacionException("No se puede dar valor de una reparacion en estado de Finalizado");
    }

    @Override
    public StateReparacion agregarRepuestos() throws StateReparacionException{
        throw new StateReparacionException("No se agregar repuestos en una reparacion en estado de Finalizado");
    }
}
