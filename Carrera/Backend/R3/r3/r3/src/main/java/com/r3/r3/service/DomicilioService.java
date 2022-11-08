package com.r3.r3.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.r3.r3.model.Domicilio;
import com.r3.r3.model.DomicilioDTO;
import com.r3.r3.repository.IDomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DomicilioService implements IDomicilioService {

    @Autowired
    @Qualifier("iDomicilioRepository")
    private IDomicilioRepository domicilioRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void crearDomicilio(DomicilioDTO domicilioDTO) {
        Domicilio domicilio = mapper.convertValue(domicilioDTO, Domicilio.class);
        domicilioRepository.save(domicilio);
    }

    @Override
    public DomicilioDTO buscarDomicilio(Integer id) {
        Optional<Domicilio> domicilio = domicilioRepository.findById(id);
        DomicilioDTO domicilioDTO = null;
        if (domicilio.isPresent())
            domicilioDTO = mapper.convertValue(domicilio, DomicilioDTO.class);

        return domicilioDTO;
    }

    @Override
    public void actualizarDomicilio(DomicilioDTO domicilioDTO) {
        Domicilio domicilio = mapper.convertValue(domicilioDTO, Domicilio.class);
        domicilioRepository.save(domicilio);
    }

    @Override
    public void eliminarDomicilio(Integer id) {
        domicilioRepository.deleteById(id);
    }

    @Override
    public Set<DomicilioDTO> getTodos() {
        List<Domicilio> domicilios = domicilioRepository.findAll();
        Set<DomicilioDTO> domiciliosDTO = new HashSet<>();
        for (Domicilio domicilio : domicilios){
            domiciliosDTO.add(mapper.convertValue(domicilio, DomicilioDTO.class));
        }
        return domiciliosDTO;
    }
}
