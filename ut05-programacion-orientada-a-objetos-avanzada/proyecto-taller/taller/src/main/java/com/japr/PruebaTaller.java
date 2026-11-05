//Autor: JAPR
//Fecha: 16/Feb/2026
//Clase PruebaTaller.java

package com.japr;

public class PruebaTaller {
    public static void main(String[] args) {

        System.out.println("---INICIANDO SIMULACIÓN DE TALLER---");

        Taller miTaller = new Taller("Taller1", "0123456789", 45);

        Vehiculo mivehiculo = new Vehiculo("0000bbb", "Renault", "Captur");

        Pieza bujia = new Pieza("Bujía tipo 1", 20);
        Pieza neumatico = new Pieza("Neumáticos tipo 2", 200);
        Pieza compresor = new Pieza("Compresor tipo 3", 275);

        // Metemos las piezas en el vehículo
        mivehiculo.añadirPieza(bujia);
        mivehiculo.añadirPieza(neumatico);
        mivehiculo.añadirPieza(neumatico);
        mivehiculo.añadirPieza(compresor);

        miTaller.repararVehiculo(mivehiculo, 20);

        Vehiculo vehiculoRevision = new Vehiculo("1111ccc", "Mercedes Benz", "GLS");

        miTaller.repararVehiculo(vehiculoRevision, 1);

    }
}