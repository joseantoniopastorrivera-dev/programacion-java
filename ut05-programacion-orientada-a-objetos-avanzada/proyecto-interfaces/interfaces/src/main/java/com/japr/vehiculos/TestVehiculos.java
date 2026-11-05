package com.japr.vehiculos;

public class TestVehiculos {

    public static void main(String[] args) {

        System.out.println("--PRUEBAS DE VEHÍCULOS--");
        Coche coche1 = new Coche("rapidamente");
        Bicicleta bicicleta1 = new Bicicleta("lentamente");

        System.out.println("Aceleración de bicicleta1: ");
        bicicleta1.acelerar();
        System.out.println("Aceleración de coche1: ");
        coche1.acelerar();
        System.out.println("Frenada de bicicleta1: ");
        bicicleta1.frenar();
        System.out.println("Freanada de coche1: ");
        coche1.frenar();
    }

}
