package com.company;

public class EmpleadoEfectivo extends Empleado {
    Integer sueldoBase;
    Integer bonos;
    Integer descuentos;

    public EmpleadoEfectivo(String nombre, String apellido, String numeroDeCuenta, Integer sueldoBase, Integer bonos, Integer descuentos) {
        super(nombre, apellido, numeroDeCuenta);
        this.sueldoBase = sueldoBase;
        this.bonos = bonos;
        this.descuentos = descuentos;
    }

    public Integer getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(Integer sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Integer getBonos() {
        return bonos;
    }

    public void setBonos(Integer bonos) {
        this.bonos = bonos;
    }

    public Integer getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Integer descuentos) {
        this.descuentos = descuentos;
    }
}
