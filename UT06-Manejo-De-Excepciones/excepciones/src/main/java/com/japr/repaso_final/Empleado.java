package com.japr.repaso_final;

public class Empleado {
    // Atributos
    private String nombre;
    private Cargo cargo;

    // Constructor
    public Empleado(String nombre, Cargo cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    // Sobrecarga
    public double calcularSueldo(double base) {
        return base;
    }

    public double calcularSueldo(double base, double bono) {
        return base + bono;
    }

    // Métodos
    @Override
    public String toString() {
        return nombre + " tiene el cargo de " + cargo;
    }
}
