package com.dh.ClinicaJpa.service;

import com.dh.ClinicaJpa.dto.OdontologoDto;
import com.dh.ClinicaJpa.dto.PacienteDto;
import com.dh.ClinicaJpa.entity.Odontologo;
import com.dh.ClinicaJpa.entity.Paciente;
import com.dh.ClinicaJpa.repository.IPaciente;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class PacienteService implements IPacienteService {

    @Autowired
    IPaciente pacienteRepository;

    @Autowired
    ObjectMapper mapper;


    @Override
    public void crearPaciente(PacienteDto pacienteDto) {

        guardarPaciente(pacienteDto);

    }

    @Override
    public PacienteDto leerPaciente(Long id) {

        PacienteDto pacienteDto = null;

        Optional<Paciente> paciente = pacienteRepository.findById(id);
        if (paciente.isPresent())
            pacienteDto = mapper.convertValue(paciente, PacienteDto.class);

        return pacienteDto;

    }

    public void guardarPaciente(PacienteDto pacienteDto){
        Paciente paciente = mapper.convertValue(pacienteDto, Paciente.class);
        pacienteRepository.save(paciente);
    }

    @Override
    public void modificarPaciente(PacienteDto pacienteDto) {
        guardarPaciente(pacienteDto);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);

    }

    @Override
    public Set<PacienteDto> getTodos() {

       List<Paciente> pacientes = pacienteRepository.findAll();
       Set<PacienteDto> pacientesDto = new HashSet<>();

        for (Paciente paciente : pacientes) {
            pacientesDto.add(mapper.convertValue(paciente, PacienteDto.class));
        }


        return pacientesDto;
    }
}
