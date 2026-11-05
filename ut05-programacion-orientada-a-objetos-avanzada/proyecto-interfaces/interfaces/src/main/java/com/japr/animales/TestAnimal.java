//Autor: JAPR
//Fecha: 16/Feb/2026
//Clase TestAnimal.java

package com.japr.animales;

public class TestAnimal {

    public static void main(String[] args) {

        System.out.println("---INICIANDO LAS PRUEBAS---");
        Gato gato1 = new Gato();
        Perro perro1 = new Perro();
        Pez pez1 = new Pez();

        System.out.println("Sonido y movimiento de gato1: ");
        gato1.hacerSonido();
        gato1.moverse();
        System.out.println("Sonido y movimiento de perro1: ");
        perro1.hacerSonido();
        perro1.moverse();
        System.out.println("Sonido y movimiento de pez1: ");
        pez1.hacerSonido();
        pez1.moverse();

    }

}
