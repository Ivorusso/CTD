package com.company;

public class LiquidadorEmpleadoEfectivo extends Liquidador {

    @Override
    public String liquidarSueldo(Empleado empleado){
        String mensajeDeRespuesta = "La liquidacion no pudo ser calculada.";

        if(empleado instanceof  EmpleadoEfectivo){
            EmpleadoEfectivo empleadoEfectivo = (EmpleadoEfectivo) empleado;
            int sueldoFinal = empleadoEfectivo.getSueldoBase() + empleadoEfectivo.getBonos() - empleadoEfectivo.getDescuentos();
            mensajeDeRespuesta = "La liquidacion generada es un documento digital, Saldo a liquidar: " + sueldoFinal;
        }
        return mensajeDeRespuesta;
    }

}
