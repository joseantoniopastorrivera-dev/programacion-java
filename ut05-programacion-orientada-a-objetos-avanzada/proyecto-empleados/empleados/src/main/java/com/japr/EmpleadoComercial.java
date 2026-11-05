//Autor: JAPR
//Fecha: 15/Feb/2026
//Clase hija de EmpleadoComercial.java

package com.japr;

public class EmpleadoComercial extends Empleado {

    // Atributos
    private int ventas;
    private double porcentaje;

    // Constructor
    public EmpleadoComercial(String nombre, String dni, double salarioBase, int ventas, double porcentaje) {
        super(nombre, dni, salarioBase);
        this.ventas = ventas;
        this.porcentaje = porcentaje;
    }

    // Getters y Setters
    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    // Métodos
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (porcentaje * ventas / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " | Ventas: " + ventas + " | Porcentaje: " + porcentaje + " | Salario Total: "
                + calcularSalario()+" euros.";
    }
}
