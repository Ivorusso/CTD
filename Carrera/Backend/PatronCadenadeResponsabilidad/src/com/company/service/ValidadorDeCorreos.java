 package com.company.service;

import com.company.chain.*;
import com.company.model.Correo;

public class ValidadorDeCorreos
    {
        private Manejador inicial;

        public ValidadorDeCorreos() {
            //Creamos los eslabones de la cadena....
            this.inicial = new ManejadorGerencia();
            Manejador tecnica = new ManejadorSoporteIT();
            Manejador comercial = new ManejadorComercial();
            Manejador spam = new ManejadorSpam();

            //Luego los unimos.
            inicial.setSiguiente(comercial);
            comercial.setSiguiente(tecnica);
            tecnica.setSiguiente(spam);
        }

        public boolean comprobar(Correo email) {
            return !Manejador.MENSAJE_SPAM.equalsIgnoreCase(inicial.comprobar( email ));
        }
    }

