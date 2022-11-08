package com.dh.ClinicaJpa.repository;

import com.dh.ClinicaJpa.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaciente extends JpaRepository<Paciente, Long> {
}
