package com.company;

public class StatePresupuesto implements StateReparacion{
    @Override
    public StateReparacion pasarSiguientePaso() {
        return new StateEnReparacion();
    }

    @Override
    public StateReparacion cambiarDireccion() throws StateReparacionException{
        throw new StateReparacionException("No se puede cambiar la direecion de una reparacion en estado de presupuesto");
    }

    @Override
    public StateReparacion darValorDelPresupuesto(){
        return this;
    }


    @Override
    public StateReparacion agregarRepuestos() throws StateReparacionException{
        throw new StateReparacionException("No se agregar repuestos en una reparacion en estado de presupuesto");
    }
}
