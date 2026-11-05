//Autor: JAPR
//Fecha: 15/Feb/2026
//Clase hija EmpleadoHoras.java

package com.japr;

public class EmpleadoHoras extends Empleado {

    // Atributos
    private double numHoras;
    private double precioHora;

    // Constructor
    public EmpleadoHoras(String nombre, String dni, double salarioBase, double numHoras, double precioHora) {
        super(nombre, dni, salarioBase);
        this.precioHora = precioHora;
        this.numHoras = numHoras;
    }

    // Getters y Setters
    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    // Métodos
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (numHoras * precioHora);
    }

    @Override
    public String toString() {
        return super.toString() + " | Horas Trabajadas: " + numHoras + " | Precio por Hora: " + precioHora
                + " | Salario Total: "+calcularSalario()+" euros";
    }

}
