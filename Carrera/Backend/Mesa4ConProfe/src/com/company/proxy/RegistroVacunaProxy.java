package com.company.proxy;
import com.company.libreriaexterna.Registro;
import com.company.libreriaexterna.RegistroVacuna;
import com.company.model.Persona;

import java.time.LocalDate;

public class RegistroVacunaProxy implements Registro {
    Persona persona;


    @Override
    public void registrar(Object[] datos){
        if (comprobarFecha((LocalDate)(datos[1]))){
            RegistroVacuna registro = new RegistroVacuna();
            registro.registrar(datos);

        }
    }
    public boolean comprobarFecha(LocalDate fecha){
        return fecha.isBefore(LocalDate.now());
    }
}
