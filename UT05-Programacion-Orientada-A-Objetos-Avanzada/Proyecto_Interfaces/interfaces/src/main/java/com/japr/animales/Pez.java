package com.japr.animales;

public class Pez implements Animal {
    
    @Override
    public void hacerSonido(){
        System.out.println("Glu Glu");
    }

    @Override
    public void moverse(){
        System.out.println("El pez se mueve usando sus aletas.");
    }
}
