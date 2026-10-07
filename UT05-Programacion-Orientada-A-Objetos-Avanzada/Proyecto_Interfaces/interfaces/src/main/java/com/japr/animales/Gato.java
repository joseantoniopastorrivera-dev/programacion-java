package com.japr.animales;

public class Gato implements Animal {
    
    @Override
    public void hacerSonido(){
        System.out.println("Miau Miau");
    }

    @Override
    public void moverse(){
        System.out.println("El gato se mueve con sus cuatro patas.");
    }
}
