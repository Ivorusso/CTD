package com.dh.ClinicaJpa.service;

import com.dh.ClinicaJpa.dto.OdontologoDto;
import com.dh.ClinicaJpa.entity.Odontologo;
import com.dh.ClinicaJpa.repository.IOdontologoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OdontologoService implements IOdontologoService {

    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void crearOdontologo(OdontologoDto odontologoDto) {
        guardarOdontologo(odontologoDto);
    }

    @Override
    public OdontologoDto leerOdontologo(Long id) {

       Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        OdontologoDto odontologoDto = null;
        if (odontologo.isPresent())
           odontologoDto = mapper.convertValue(odontologo, OdontologoDto.class);


        return odontologoDto;
    }

    public void guardarOdontologo(OdontologoDto odontologoDto) {
        Odontologo odontologo = mapper.convertValue(odontologoDto, Odontologo.class);
        odontologoRepository.save(odontologo);
    }

    @Override
    public void modificarOdontologo(OdontologoDto odontologoDto) {
        guardarOdontologo(odontologoDto);
    }

    @Override
    public void eliminarOdontologo(Long id) {
        odontologoRepository.deleteById(id);
    }

    @Override
    public Set<OdontologoDto> getTodos() {

        List<Odontologo> odontologos = odontologoRepository.findAll();
        Set<OdontologoDto> odontologosDto = new HashSet<>();

        for (Odontologo odontologo : odontologos) {
            odontologosDto.add(mapper.convertValue(odontologo, OdontologoDto.class));

        }



        return odontologosDto;
    }
}
