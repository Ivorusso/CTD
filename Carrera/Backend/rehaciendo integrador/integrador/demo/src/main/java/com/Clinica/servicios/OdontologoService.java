package com.Clinica.servicios;

import com.Clinica.daos.IDao;
import entidad.Odontologo;

import java.util.List;

public class OdontologoService {


    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoDao) {
        this.odontologoIDao = odontologoDao;
    }
    public IDao<Odontologo> getOdontologoIDao() {
        return odontologoIDao;
    }

    public void setOdontologoIDao(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }


    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }

    public void eliminarOdontologo(Integer id){
        odontologoIDao.eliminar(id);
    }

    public Odontologo buscarOdontologo(Integer id){
        return odontologoIDao.buscar(id);
    }

    public List<Odontologo> mostrarTodos(){
        return odontologoIDao.buscarTodos();
    }
}




