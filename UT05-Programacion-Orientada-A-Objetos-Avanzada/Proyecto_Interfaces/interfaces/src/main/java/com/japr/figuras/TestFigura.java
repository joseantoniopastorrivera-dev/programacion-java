//Autor: JAPR
//Fecha: 16/Feb/2026
//Clase TestFigura.java

package com.japr.figuras;

public class TestFigura {
    public static void main(String[] args) {
        System.out.println("---INICIANDO LAS PRUEBAS---");

        Circulo circulo1 = new Circulo(2.5);
        Rectangulo rectangulo1 = new Rectangulo(4, 2);

        System.out.println("Área del círculo1: " + circulo1.calcularArea());
        System.out.println("Perímetro del círculo1: " + circulo1.calcularPerimetro());
        System.out.println("Área del rectángulo1: " + rectangulo1.calcularArea());
        System.out.println("Perímetro del rectángulo1: " + rectangulo1.calcularPerimetro());

    }
}
