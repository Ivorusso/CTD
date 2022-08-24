package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LiquidadorTest {



    @Test
    public void deberiaEimitirUnDocumentoDigirtalParaUnEmpleadoEfectivo(){
        //DADO
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoEfectivo();
        Empleado empleado = new EmpleadoEfectivo("Martin", "Martini", "001A", 400, 60 ,40);
        String resultadoEsperado = "La liquidacion generada es un documento digital, Saldo a liquidar: 420" ;
        //CUANDO
        String resultado = sujetoDePrueba.liquidarSueldo(empleado);
        //ENTONCES
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void deberiaEmitirUndocumentoImpresoParaUnEmpleadoContratado(){
        //DADO
        Liquidador sujetoDePrueba = new LiquidadorEmpleadoContratado();
        Empleado empleado = new EmpleadoContratado("Pompilia", "Pompini", "001B", 120, 7);
        String resultadoEsperado = "La liquidacion generada es un documento impreso, Saldo a liquidar: 840";
        //CUANDO
        String resultado = sujetoDePrueba.liquidarSueldo(empleado);
        //ENTONCES
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

}
