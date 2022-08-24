package com.company;

public class EmpleadoContratado extends Empleado{
    Integer horasTrabajadas;
    Integer valorHora;

    public EmpleadoContratado(String nombre, String apellido, String numeroDeCuenta, Integer horasTrabajadas, Integer valorHora) {
        super(nombre, apellido, numeroDeCuenta);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Integer getValorHora() {
        return valorHora;
    }

    public void setValorHora(Integer valorHora) {
        this.valorHora = valorHora;
    }
}
