package com.company;

public class UsuarioJuego {

    //ATRIBUTOS
    private String nombre;
    private String clave;
    private Integer puntaje;
    private Integer nivel;

    //CONSTRUCTOR
    public  UsuarioJuego(String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave ;
        this.puntaje = 0 ;
        this.nivel = 0;
    }
    //METODOS

     public void aumentarPuntaje(){
        puntaje += 1;
     }

     public void subirNivel(){
        nivel += 1;
     }

     public void bonus(Integer valor){
        puntaje += valor;
     }

    //GETTER SETTERS

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public Integer getNivel() {
        return nivel;
    }
}
