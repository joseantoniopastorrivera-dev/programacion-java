//Autor: JAPR
//Fecha: 16/Feb/2026
//Clase Taller.java

package com.japr;

public class Taller {

    // Atributos
    private String nombre;
    private String telefono;
    private double precioHora;

    // Constructor
    public Taller(String nombre, String telefono, double precioHora) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.precioHora = precioHora;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    // Métodos
    public double repararVehiculo(Vehiculo vehiculo, double horas) {
        System.out.println("\n---FACTURA DE REPARACIÓN---");
        System.out.println("Taller: " + this.nombre + " | Teléfono: " + getTelefono() + " | ");
        System.out.println(vehiculo.toString());

        // Calculamos la mano de obra
        double costeManoObra = horas * this.precioHora;
        System.out.println("Coste mano de obra: " + costeManoObra + " | Número de horas: " + horas
                + " | Precio por hora: " + this.precioHora);
        // calculamos el coste de las piezas recorriendo el ArrayList
        double costePieza = 0;
        System.out.println("Piezas sustituidas: ");
        // Recorremos el ArrayList
        for (int i = 0; i < vehiculo.getPiezasReparadas().size(); i++) {
            Pieza piezaActual = vehiculo.getPiezasReparadas().get(i);
            System.out.println("-" + piezaActual.getNombre() + " | Precio: " + piezaActual.getPrecio());
            costePieza = costePieza + piezaActual.getPrecio();
        }

        if (vehiculo.getPiezasReparadas().size() == 0) {
            System.out.println("-Ninguna pieza(Solo revisión o mano de obra.");
        }

        // Sumamos coste de mano de obra y precio de las piezas y damos el resultado
        double totalFactura = costeManoObra + costePieza;
        System.out.println("---TOTAL FACTURA: " + totalFactura + "euros.");
        return totalFactura;
    }

}
