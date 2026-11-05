//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase abstracta Empleado.java

package com.japr;

public abstract class Empleado {

    // Atributos

    private String nombre;
    private String dni;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    // Métodos
    @Override
    public String toString() {
        return "\nEmpleado '" + nombre + "' | DNI '" + dni + "' Salario Base: " + salarioBase;
    }
}