package com.r3.r3.service;
import com.r3.r3.model.DomicilioDTO;

import java.util.Set;


public interface IDomicilioService {
    void crearDomicilio(DomicilioDTO domicilioDTO);
    DomicilioDTO buscarDomicilio(Integer id);
    void actualizarDomicilio(DomicilioDTO domicilioDTO);
    void eliminarDomicilio(Integer id);
    Set<DomicilioDTO> getTodos();
}
