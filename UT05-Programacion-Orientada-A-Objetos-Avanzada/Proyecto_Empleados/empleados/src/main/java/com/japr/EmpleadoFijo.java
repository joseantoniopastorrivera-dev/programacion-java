//Autor: JAPR
//Fecha: 15/Feb/2026
//Clase hija EmpleadoFijo.java

package com.japr;

public class EmpleadoFijo extends Empleado {

    // Atributos
    private double plus;

    // Constructor
    public EmpleadoFijo(String nombre, String dni, double salarioBase, double plus) {
        super(nombre, dni, salarioBase);
        this.plus = plus;
    }

    // Getters y Setters
    public double getPlus() {
        return plus;
    }

    public void setPlus(double plus) {
        this.plus = plus;
    }

    // Métodos
    @Override
    public double calcularSalario() {
        return getSalarioBase() + plus;
    }

    @Override
    public String toString() {
        return super.toString() + " | Plus:  " + plus + " | Salario Total: " + calcularSalario() + " euros.";
    }
}
