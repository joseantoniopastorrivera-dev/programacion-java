package com.japr.figuras;

public class Circulo implements Figura {

    // Atributos
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * radio * 2;
    }
}
