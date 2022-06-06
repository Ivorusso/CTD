package com.company;

public class PizzaFactory {

    public static final String MUZZARELLA = "Muzza";
    public static final String MUZZARELLA_GRANDE = "Muzza Grande";
    public static final String ESPECIAL = "Especial";
    public static final String ESPECIAL_GRANDE = "Especial Grande";
    public static final String ANANA = "Anana";
    public static final String ANANA_GRANDE = "Anana Grande";
    public static final String COMBINADA_LOCA = "Especial/Anana";

    private static PizzaFactory instance;

    public PizzaFactory(){

    }

    public static PizzaFactory getInstance(){
        if(instance == null){
            instance = new PizzaFactory();
        }
        return instance;
    }


    public Pizza hacerPizza(String codigo) throws PizzaException{
        switch (codigo){
            case MUZZARELLA:
                return new Simple("Muzza Chica", "Solo tengo queso",700.0, false );
            case MUZZARELLA_GRANDE:
                return new Simple("Muzza Grande", "Solo tengo queso, pero soy gigante",700.0, true );
            case ESPECIAL:
                return new Simple("Especial", "Tengo Morron y Huevo", 850.0, false);
            case ESPECIAL_GRANDE:
                return new Simple("Especial Grande", "Tengo Morron y Huevo.... y soy gigante", 850.0, true);
            case ANANA:
                return new Simple("Anana", "Soy incomible", 950.0, false);
            case ANANA_GRANDE:
                return new Simple("Anana Grande", "Soy incomible, pero grande", 950.0, true);
            case COMBINADA_LOCA:
                 Combinada combinadaLoca = new Combinada("Combinada loca", "Mitad Especial y Mitad Anana");
                 combinadaLoca.agregarPizza(hacerPizza(ESPECIAL));
                 combinadaLoca.agregarPizza(hacerPizza(ANANA));
                 return combinadaLoca;
        }

        throw new PizzaException("No trabajamos este tipo de Pizza");
    }
}
