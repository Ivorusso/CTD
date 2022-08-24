package com.company.daos;

import java.util.List;

public interface IDao<T>{

    public T guardar(T t);

    public void eliminarAvion(Long t);

    public T buscarAvion(Long t);

    public List<T> buscarTodos();
}
