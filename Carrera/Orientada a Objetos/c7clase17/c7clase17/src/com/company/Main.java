package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cliente cliente = null;
        List<Integer> numeros = new ArrayList<>();
        try {
            cliente = new Cliente("Cosme","Fulanito",123,-500.0);
        } catch (ClienteException e) {
            e.printStackTrace();
        }

        try {
            numeros.get(3);
            cliente.saldarDeudar(-200.0);
        }catch (ClienteException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("fallo por ser nulo");
        }catch (Exception e){
            System.out.println("algo paso");
        }

        System.out.println("llegue hasta aca");

    }
}
