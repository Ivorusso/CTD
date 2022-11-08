package com.dh.ClinicaJpa.repository;

import com.dh.ClinicaJpa.entity.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDomicilio extends JpaRepository<Domicilio,Long > {
}
