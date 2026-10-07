package com.japr.vehiculos;

public class Coche implements Vehiculo {

    // Atributos
    private String velocidad;

    // Constructor
    public Coche(String velocidad) {
        this.velocidad = velocidad;
    }

    // Getters y setters
    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    // Métodos
    @Override
    public void acelerar() {
        System.out.println("El coche acelera " + velocidad + " pulsando el pedal del acelerador con el pie derecho.");
    }

    @Override
    public void frenar() {
        System.out.println("El coche frena pulsando el pedal del freno con el pie derecho.");
    }
}
