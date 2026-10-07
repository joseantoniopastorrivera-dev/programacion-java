//Autor: JAPR
//Fecha: 30/01/26
//Implementa el juego piedra, papel y tijera. 
// Primero, el usuario introduce su jugada y luego el ordenador genera al azar una de las opciones. 
// Si el usuario introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.
//Ejemplo 1:
//Turno del jugador (introduzca piedra, papel o tijera): papel
//Turno del ordenador: papel
//Empate
//Ejemplo 2:
//Turno del jugador (introduzca piedra, papel o tijera): papel
//Turno del ordenador: tijera
//Gana el ordenador
//Ejemplo 3:
//Turno del jugador (introduzca piedra, papel o tijera): piedra
//Turno del ordenador: tijera
//Gana el jugador

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String jugada;

        // Turno ser humano
        do {
            System.out.println("Turno del jugador (introduzca piedra, papel o tijera):");
            jugada = scanner.next();
            if (!"piedra".equalsIgnoreCase(jugada) && !"papel".equalsIgnoreCase(jugada)
                    && !"tijera".equalsIgnoreCase(jugada)) {
                System.out.println("ERROR, introduzca dato correcto.");
            }
        } while (!"piedra".equalsIgnoreCase(jugada) && !"papel".equalsIgnoreCase(jugada)
                && !"tijera".equalsIgnoreCase(jugada));

        // Turno ordenador
        String opciones[] = { "piedra", "papel", "tijera" };
        int indice = (int) (Math.random() * 3);
        System.out.println("Turno del ordenador:\n" + opciones[indice]);

        // Elegimos piedra
        if (jugada.equalsIgnoreCase("piedra")) {
            if (indice == 0) {
                System.out.println("Empate.");
            } else if (indice == 1) {
                System.out.println("Gana el ordenador.");
            } else {
                System.out.println("Gana el jugador.");
            }
            //Elegimos papel
        } else if (jugada.equalsIgnoreCase("papel")) {
            if (indice == 0) {
                System.out.println("Gana el jugador.");
            } else if (indice == 1) {
                System.out.println("Empate.");
            } else {
                System.out.println("Gana el ordenador.");
            }
            //Elegimos tijera
        } else if (jugada.equalsIgnoreCase("tijera")){
             if (indice == 0) {
                System.out.println("Gana el ordenador.");
            } else if (indice == 1) {
                System.out.println("Gana el jugador.");
            } else {
                System.out.println("Empate.");
            }
        }
        scanner.close();
    }
}
