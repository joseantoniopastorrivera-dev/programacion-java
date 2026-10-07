package com.japr.animales;

public class Perro implements Animal {
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau Guau");
    }

    @Override
    public void moverse(){
        System.out.println("El perro se mueve caminando sobre sus cuatro patas.");
    }
}
