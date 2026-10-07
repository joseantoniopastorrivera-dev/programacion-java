package com.japr.vehiculos;

public class Bicicleta implements Vehiculo {

    // Atributos
    private String velocidad;

    // Constructor
    public Bicicleta(String velocidad) {
        this.velocidad = velocidad;
    }

    // Getters and Setters
    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;

    }

    // Métodos
    @Override
    public void acelerar() {
        System.out.println("La bicicleta acelera " + velocidad + " pedaleando con las piernas.");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta frena " + velocidad + " pulsando las manetas de los frenos con las manos.");

    }
}
