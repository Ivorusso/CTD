package com.company;

import java.util.List;

public interface Idao<T> {

    public T darDeAlta(T t);

    public void darDeBaja(Long id);

    public T buscar(Long  id);

    public List<Odontologo> listar();
}
