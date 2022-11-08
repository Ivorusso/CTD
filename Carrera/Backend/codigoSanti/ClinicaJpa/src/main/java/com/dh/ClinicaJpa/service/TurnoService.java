package com.dh.ClinicaJpa.service;

import com.dh.ClinicaJpa.dto.PacienteDto;
import com.dh.ClinicaJpa.dto.TurnoDto;
import com.dh.ClinicaJpa.entity.Paciente;
import com.dh.ClinicaJpa.entity.Turno;
import com.dh.ClinicaJpa.repository.IPaciente;
import com.dh.ClinicaJpa.repository.ITurno;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class TurnoService implements ITurnoService {
    @Autowired
    ITurno turnoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearTurno(TurnoDto turnoDto) {
    guardarTurno(turnoDto);
    }

    @Override
    public TurnoDto leerTurno(Long id) {

        TurnoDto turnoDto = null;

        Optional<Turno> turno = turnoRepository.findById(id);
        if (turno.isPresent())
            turnoDto = mapper.convertValue(turno, TurnoDto.class);

        return turnoDto;
    }

    public void guardarTurno(TurnoDto turnoDto){
        Turno turno = mapper.convertValue(turnoDto, Turno.class);
        turnoRepository.save(turno);
    }

    @Override
    public void modificarTurno(TurnoDto turnoDto) {
        guardarTurno(turnoDto);
    }

    @Override
    public void eliminarTurno(Long id) {
        turnoRepository.deleteById(id);

    }

    @Override
    public Set<TurnoDto> getTodos() {

       List<Turno> turnos = turnoRepository.findAll();
       Set<TurnoDto> turnosDto = new HashSet<>();

        for (Turno turno : turnos) {
            turnosDto.add(mapper.convertValue(turno, TurnoDto.class));
        }

        return turnosDto;
    }
}
