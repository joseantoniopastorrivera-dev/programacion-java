//Autor:JAPR
//Fecha: 28/01/26
//Escribe un programa que piense un número al azar entre 0 y 100.
// El usuario debe adivinarlo y tiene para ello 5 oportunidades.
// Después de cada intento fallido, el programa dirá cuántas oportunidades quedan y
//  si el número introducido es menor o mayor que el número secreto.

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Variables/Arrays
        int numero = (int) (Math.random() * 101);
        int intento;

        // Preguntamos cual es el número secreto

        for (int i = 5; i > 0; i--) {
            System.out.println("Diga un número al azar entre cero y cien: ");
            intento = scanner.nextInt();
            if (intento == numero) {
                System.out.println("¡MUY BIEN! El número random era " + numero + " y lo has adivinado a falta de "
                        + (i - 1) + " oportunidades restantes.");
                scanner.close();
                return;
            } else {
                System.out.println("ERROR, le quedan " + (i - 1) + " intentos restantes.");
                if (numero > intento) {
                    System.out.println("El número buscado es mayor que " + intento + ".");
                } else {
                    System.out.println("El número buscado es menor que " + intento + ".");
                }
            }
        }
        scanner.close();
    }
}
