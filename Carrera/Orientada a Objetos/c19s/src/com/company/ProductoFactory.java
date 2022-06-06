package com.company;

public class ProductoFactory {
    private static ProductoFactory instanciaProducto;

    public static final String CodigoPelotaFutbol = "PelotaFutbol";
    public static final String CodigoPelotaTenis = "PelotaTenis";
    public static final String CodigoCaja10X10 = "Caja10X10";

    private ProductoFactory(){}

    public static ProductoFactory getInstance(){
        if (instanciaProducto == null){
            instanciaProducto = new ProductoFactory();
        }
        return  instanciaProducto;
    }

    public Producto crearProducto(String codigo) throws Exception{
        switch (codigo){
            case CodigoPelotaTenis:
                return new Pelota(0.32);
            case CodigoPelotaFutbol:
                return new Pelota(11.0);
            case CodigoCaja10X10:
                return new Caja(10.0, 10.0, 10.0);
        }
        throw  new ProductoFactoryException("Codigo Inexistente");
    }
}
