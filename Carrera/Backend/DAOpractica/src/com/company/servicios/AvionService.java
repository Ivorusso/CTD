package com.company.servicios;

import com.company.daos.IDao;
import com.company.entidad.Avion;

import java.util.List;

public class AvionService {

    private IDao<Avion> avionIDao;

    public IDao<Avion> getAvionIDao() {
        return avionIDao;
    }

    public void setAvionIDao(IDao<Avion> avionIDao) {
        this.avionIDao = avionIDao;
    }

    public Avion guardarAvion(Avion avion){
        //Darle la responsabilidad al DAO
      return avionIDao.guardar(avion);
    }

    public void eliminarAvion(Long id){
        avionIDao.eliminarAvion(id);
    }

    public Avion buscarAvion(Long id){
        return avionIDao.buscarAvion(id);
    }

    public List<Avion> buscarTodos(){
        return avionIDao.buscarTodos();
    }
}
