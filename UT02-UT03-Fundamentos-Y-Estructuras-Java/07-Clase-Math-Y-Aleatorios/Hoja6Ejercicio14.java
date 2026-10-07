//Autor: JAPR
//Fecha: 29/01/26
//Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
// El programa intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades. 
// En cada intento fallido, el programa debe preguntar si el número que estás pensando es mayor o menor que el que te acaba de decir.

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número del 0 al 100 y el programa lo intentará adivinar en 5 intentos: ");
        int numero = scanner.nextInt();
        int intento;
        int max = 100;
        int min = 0;
        boolean acertado = false;

        for (int i = 5; i > 0; i--) {
            intento = (int) (Math.random() * (max - min + 1) + min);

            if (intento == numero) {
                System.out
                        .println("El número es: " + intento + ". Lo he adivinado a falta de " + i + " oportunidades.");
                acertado = true;
                break;
            } else {
                if (intento < numero) {
                    System.out.println("Mi intento es: " + intento + " Me he quedado corto. Buscaré mas arriba.");
                    min = intento + 1;
                } else {
                    System.out.println("Mi intento es: " + intento + " Me he pasado. Buscaré mas abajo.");
                    max = intento - 1;

                }
            }
        }

        if (!acertado) {
            System.out.println("Vaya he fallado, el número buscado era: " + numero);
        }
        scanner.close();

    }
}
