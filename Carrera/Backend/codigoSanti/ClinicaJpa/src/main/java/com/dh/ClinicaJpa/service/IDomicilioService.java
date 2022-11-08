package com.dh.ClinicaJpa.service;

import com.dh.ClinicaJpa.dto.DomicilioDto;
import com.dh.ClinicaJpa.dto.OdontologoDto;

import java.util.Set;

public interface IDomicilioService {

        void crearDomicilio(DomicilioDto domicilioDto);
        DomicilioDto leerDomicilio(Long id);
        void modificarDomicilio(DomicilioDto domicilioDto);
        void eliminarDomicilio(Long id);
        Set<DomicilioDto> getTodos();


    }

