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

    public void eliminarOdontologo(Long id){
        odontologoIDao.eliminar(id);
    }

    public Odontologo buscarOdontologo(Long id){
        return odontologoIDao.buscar(id);
    }

    public List<Odontologo> mostrarTodos(){
        return odontologoIDao.mostrarTodos();
    }
}
