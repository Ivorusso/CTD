package com.company;

public class Main {

    public static void main(String[] args) {
        Almacen almacen = new Almacen("SuperCHino");
        ProductoFactory fabrica = ProductoFactory.getInstance();

        almacen.agregarProducto(fabrica.CodigoCaja10X10);
        almacen.agregarProducto(fabrica.CodigoPelotaTenis);
        almacen.agregarProducto(fabrica.CodigoPelotaFutbol);


        System.out.println(almacen.calcularEspacio());

    }
    }

