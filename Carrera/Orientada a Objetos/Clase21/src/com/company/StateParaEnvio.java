package com.company;

public class StateParaEnvio implements StateReparacion{
    @Override
    public StateReparacion pasarSiguientePaso() {
        return new StateFinalizado();
    }

    @Override
    public StateReparacion cambiarDireccion() {
        return this;
    }

    @Override
    public StateReparacion darValorDelPresupuesto() throws StateReparacionException{
        throw new StateReparacionException("No se puede dar valor de una reparacion en estado de Envio");
    }


    @Override
    public StateReparacion agregarRepuestos() throws StateReparacionException{
        throw new StateReparacionException("No se puede agregar repuestos en una reparacion en estado de Envio");
    }
}
