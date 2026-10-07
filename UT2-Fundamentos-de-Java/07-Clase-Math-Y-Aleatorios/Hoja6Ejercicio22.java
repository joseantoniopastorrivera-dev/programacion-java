//Autor: JAPR
//Fecha: 30/01/26
//Realiza un programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio.
// La cabeza se representará con el carácter @ y se debe colocar exactamente en la posición 13 (con 12 espacios delante). 
// A partir de ahí, el cuerpo irá serpenteando de la siguiente manera: 
// se generará de forma aleatoria un valor entre tres posibles que hará que el siguiente carácter 
// se coloque una posición a la izquierda del anterior, alineado con el anterior o una posición a la derecha del anterior.
// La longitud de la serpiente se pedirá por teclado y se supone que el usuario introducirá un dato correcto.

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la longitud deseada para la serpiente: ");
        int longitud = scanner.nextInt();
        // Posición 13 significa 12 espacios delante (del 1 al 12 son espacios, el 13 es
        // la letra)
        int posicion = 13;

        for (int i = 0; i < longitud; i++) {
            // Solo movemos el cuerpo, la cabeza empieza quieta
            if (i > 0) {
                // Para tener {-1, 0, 1}
                int movimiento = (int) (Math.random() * 3) - 1;
                // Siguiente movimiento
                posicion += movimiento;
            }
            // Pintamos los espacios (Indentación)
            // Si posicion es 13, pintamos 12 espacios.
            for (int j = 0; j < posicion - 1; j++) {
                System.out.print(" ");
            }

            // Pintamos Cabeza o Cuerpo
            if (i == 0) {
                System.out.println("@");
            } else {
                System.out.println("*");
            }
        }
        scanner.close();
    }
}
