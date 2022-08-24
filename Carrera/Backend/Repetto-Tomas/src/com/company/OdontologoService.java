package com.company;

import java.util.List;

public class OdontologoService {

    private Idao<Odontologo> odontologoIDao;

    public Idao<Odontologo> getOdontologoIDao() {
        return odontologoIDao;
    }

    public void setOdontologoIDao(Idao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }


    public Odontologo guardarOdontologo(Odontologo odontologo) {
        return odontologoIDao.darDeAlta(odontologo);
    }

    public void eliminarOdontologo(Long id) {
        odontologoIDao.darDeBaja(id);
    }

    public Odontologo buscarOdontologo(Long id) {
        return odontologoIDao.buscar(id);
    }

    public List<Odontologo> mostrarTodos() {
        return odontologoIDao.listar();
    }
}
