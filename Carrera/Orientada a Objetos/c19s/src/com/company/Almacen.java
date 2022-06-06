package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private String nombre;
    private List<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        productos = new ArrayList<>();
    }

    public void agregarProducto(String codigo){
        try{
            this.productos.add(ProductoFactory.getInstance().crearProducto(codigo));
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public double calcularEspacio(){
        double espacioNecesario = 0.0;
        for (Producto producto: productos) {
            espacioNecesario += producto.calcularEspacio();
        }
        return espacioNecesario;
    }
}
