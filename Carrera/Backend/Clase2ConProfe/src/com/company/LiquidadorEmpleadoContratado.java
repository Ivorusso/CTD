package com.company;

public class LiquidadorEmpleadoContratado extends Liquidador {

    @Override
    public String liquidarSueldo(Empleado empleado){
        String mensajeDeRespuesta = "La liquidacion no pudo ser calculada.";

        if(empleado instanceof  EmpleadoContratado){
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado;
            int sueldoFinal = empleadoContratado.getHorasTrabajadas() * empleadoContratado.getValorHora();
            mensajeDeRespuesta = "La liquidacion generada es un documento impreso, Saldo a liquidar: " + sueldoFinal;
        }
        return mensajeDeRespuesta;
    }
}
