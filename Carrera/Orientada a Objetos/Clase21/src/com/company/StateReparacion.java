package com.company;

import javax.swing.plaf.nimbus.State;

public interface StateReparacion {

    public StateReparacion pasarSiguientePaso();
    public StateReparacion cambiarDireccion() throws StateReparacionException;
    public StateReparacion darValorDelPresupuesto() throws StateReparacionException;
    public StateReparacion agregarRepuestos() throws StateReparacionException;
}
