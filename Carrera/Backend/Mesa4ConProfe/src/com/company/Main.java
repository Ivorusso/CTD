package com.company;
import com.company.libreriaexterna.Registro;
import com.company.model.Persona;
import com.company.proxy.RegistroVacunaProxy;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("yuma", "yumosa", "123456", "pfizer", LocalDate.of(2022,5,10));
        Registro registro = new RegistroVacunaProxy();
        registro.registrar(persona.datos());
    }
}
