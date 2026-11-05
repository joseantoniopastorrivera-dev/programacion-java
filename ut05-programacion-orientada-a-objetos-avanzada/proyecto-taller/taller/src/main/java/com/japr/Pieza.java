//Autor: JAPR
//Fecha: 16/Feb/2026
//Clase Pieza.java

package com.japr;

public class Pieza {

    // Atributos
    private String nombre;
    private double precio;

    // Constructor
    public Pieza(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Métodos
    @Override
    public String toString() {
        return "Nombre de la pieza: " + nombre + " | Precio: " + precio;
    }

}
