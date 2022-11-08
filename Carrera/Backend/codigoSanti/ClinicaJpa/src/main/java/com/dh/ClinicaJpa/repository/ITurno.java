package com.dh.ClinicaJpa.repository;

import com.dh.ClinicaJpa.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurno extends JpaRepository<Turno, Long> {
}
