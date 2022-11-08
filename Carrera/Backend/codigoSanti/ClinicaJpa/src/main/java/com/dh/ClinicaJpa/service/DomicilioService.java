package com.dh.ClinicaJpa.service;

import com.dh.ClinicaJpa.dto.DomicilioDto;
import com.dh.ClinicaJpa.entity.Domicilio;
import com.dh.ClinicaJpa.repository.IDomicilio;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
//solo implementamos la interface IdomicilioService
//falta USAR DomicilioRepositorio _Muy Importante_ Video3 minuto 8
public class DomicilioService implements IDomicilioService{

    @Autowired
    IDomicilio domicilioRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void crearDomicilio(DomicilioDto domicilioDto) {
        guardarDomicilio(domicilioDto);

    }

    @Override
    public DomicilioDto leerDomicilio(Long id) {

        DomicilioDto domicilioDto = null;
        Optional<Domicilio> domicilio = domicilioRepository.findById(id);
        if (domicilio.isPresent())
            domicilioDto = mapper.convertValue(domicilio, DomicilioDto.class);

        return domicilioDto;
    }

    public void guardarDomicilio(DomicilioDto domicilioDto){
        Domicilio domicilio = mapper.convertValue(domicilioDto, Domicilio.class);
        domicilioRepository.save(domicilio);
    }

    @Override
    public void modificarDomicilio(DomicilioDto domicilioDto) {
        guardarDomicilio(domicilioDto);

    }

    @Override
    public void eliminarDomicilio(Long id) {
        domicilioRepository.deleteById(id);
    }

    @Override
    public Set<DomicilioDto> getTodos() {
        
        List<Domicilio> domicilios = domicilioRepository.findAll();
        Set<DomicilioDto> domiciliosDto = new HashSet<>();

        for (Domicilio domicilio : domicilios) {
            domiciliosDto.add(mapper.convertValue(domicilio, DomicilioDto.class));
        }
        
        return domiciliosDto;
    }
}
