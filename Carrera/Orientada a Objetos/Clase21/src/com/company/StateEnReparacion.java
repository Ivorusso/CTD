package com.company;

public class StateEnReparacion implements StateReparacion{
    @Override
    public StateReparacion pasarSiguientePaso() {
        return new StateParaEnvio();
    }

    @Override
    public StateReparacion cambiarDireccion() throws StateReparacionException{
        throw new StateReparacionException("No se puede cambiar la direecion de una reparacion en estado de Reparacion");
    }

    @Override
    public StateReparacion darValorDelPresupuesto(){
        return this;
    }

    @Override
    public StateReparacion agregarRepuestos() {
        return this;
    }
}
