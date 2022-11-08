package com.r3.r3.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.r3.r3.model.Paciente;
import com.r3.r3.model.PacienteDTO;
import com.r3.r3.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PacienteService implements IPacienteService {

 @Autowired
 @Qualifier("iPacienteRepository")
 private IPacienteRepository pacienteRepository;

 @Autowired
 ObjectMapper mapper;

 @Override
 public void crearPaciente(PacienteDTO pacienteDTO) {
   Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
  pacienteRepository.save(paciente);
 }

 @Override
 public PacienteDTO buscarPaciente(Integer id) {
  Optional<Paciente> paciente = pacienteRepository.findById(id);
  PacienteDTO pacienteDTO = null;
  if (paciente.isPresent())
   pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);

  return pacienteDTO;
 }

 @Override
 public void actualizarPaciente(PacienteDTO pacienteDTO) {
  Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
  pacienteRepository.save(paciente);

 }

 @Override
 public void eliminarPaciente(Integer id) {
  pacienteRepository.deleteById(id);

 }

 @Override
 public Set<PacienteDTO> getTodos() {
  List<Paciente> pacientes = pacienteRepository.findAll();
  Set<PacienteDTO> pacientesDTO = new HashSet<>();
  for (Paciente paciente : pacientes){
   pacientesDTO.add(mapper.convertValue(paciente, PacienteDTO.class));
  }
  return pacientesDTO;
 }
}
