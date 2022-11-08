package com.r3.r3.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "turnos")
public class Turno {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "paciente_id",  nullable = false)
    private Paciente paciente;
    @ManyToOne()
    @JoinColumn(name = "odontologo_id", nullable = false )
    private Odontologo odontologo;

    private Date date;


    public Turno(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Turno{" +
                "id=" + id +
                ", paciente=" + paciente +
                ", odontologo=" + odontologo +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turno turno = (Turno) o;
        return Objects.equals(id, turno.id) && Objects.equals(paciente, turno.paciente) && Objects.equals(odontologo, turno.odontologo) && Objects.equals(date, turno.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paciente, odontologo, date);
    }
}
