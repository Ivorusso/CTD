package com.company;

public class Test {

    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria("Pizza Loca");

        pizzeria.agregarPizza(PizzaFactory.MUZZARELLA);
        pizzeria.agregarPizza(PizzaFactory.MUZZARELLA_GRANDE);
        pizzeria.agregarPizza(PizzaFactory.ANANA);
        pizzeria.agregarPizza(PizzaFactory.ANANA_GRANDE);
        pizzeria.agregarPizza(PizzaFactory.ESPECIAL);
        pizzeria.agregarPizza(PizzaFactory.ESPECIAL_GRANDE);
        pizzeria.agregarPizza(PizzaFactory.COMBINADA_LOCA);

        pizzeria.mostrarPizzas();

        pizzeria.agregarPizza("No soy una pizza");
    }
}
