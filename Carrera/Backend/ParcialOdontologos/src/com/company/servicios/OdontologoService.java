package com.company.servicios;

import com.company.daos.IDao;
import com.company.entidad.Odontologo;

import java.util.List;

public class OdontologoService {


    private IDao<Odontologo> odontologoIDao;

    public IDao<Odontologo> getOdontologoIDao() {
        return odontologoIDao;
    }

    public void setOdontologoIDao(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }


    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }

    public void eliminarOdontologo(String matricula){
        odontologoIDao.eliminar(matricula);
    }

    public Odontologo buscarOdontologo(String matricula){
        return odontologoIDao.buscar(matricula);
    }

    public List<Odontologo> mostrarTodos(){
        return odontologoIDao.mostrarTodos();
    }
}




