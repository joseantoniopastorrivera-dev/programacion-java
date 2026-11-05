//Autor: JAPR
//Fecha: 16/Feb/2026
//Clase Vehiculo.java

package com.japr;

import java.util.ArrayList;

public class Vehiculo {

    // Atributos
    private String matricula;
    private String marca;
    private String modelo;

    // Declaramos el ArrayList
    private ArrayList<Pieza> piezasReparadas;

    // Constructor
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        // Inicializamos el array como una lista vacía para que no de null el programa
        // entero
        this.piezasReparadas = new ArrayList<>();
    }

    // Array list para meter piezas nuevas en la lista
    public void añadirPieza(Pieza pieza) {
        piezasReparadas.add(pieza);
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Pieza> getPiezasReparadas() {
        return piezasReparadas;
    }

    // Métodos
    @Override
    public String toString() {
        return "Vehículo: " + marca + " " + modelo + " | Matrícula: " + matricula;
    }

}
