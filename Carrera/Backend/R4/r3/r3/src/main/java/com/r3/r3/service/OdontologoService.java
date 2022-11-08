package com.r3.r3.service;

import com.r3.r3.model.dto.Odontologo;
import com.r3.r3.repository.IDao;

import java.sql.SQLException;
import java.util.List;

public class OdontologoService {
    private IDao<Odontologo> odontologoIdao;


    public OdontologoService(IDao<Odontologo> odontologoIdao){
        this.odontologoIdao = odontologoIdao;
    }


    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoIdao.guardar(odontologo);
    }

    public void eliminar(Integer id){
        odontologoIdao.eliminar(id);
    }

    public Odontologo buscar(Integer id) {
        return odontologoIdao.buscar(id);
    }

    public List<Odontologo> buscarTodos() {
        return odontologoIdao.buscarTodos();
    }

    public Odontologo actualizar(Odontologo odontologo) {
        return odontologoIdao.actualizar(odontologo);
    }

}
