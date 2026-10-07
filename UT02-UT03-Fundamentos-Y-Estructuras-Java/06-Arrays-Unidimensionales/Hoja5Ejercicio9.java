// Autor: JAPR
// Fecha: 25/01/26
// Pedir 8 números y decir cuál es par y cuál impar.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clas
public class Hoja5Ejercicio9 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Encendemos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos el Array
        int numeros[] = new int[8];

        // Pedimos los datos y los guardamos en el array
        System.out.println("Este programa pedirá 8 números por teclado e indicará si son pares o impares.");
        for (int i = 0; i < 8; i++) {
            System.out.println("Introduzca el número " + (i + 1) + " (ej: -3, 2, 14, 27...): ");
            numeros[i] = scanner.nextInt();
        }

        // Comprobamos si son par o impar
        for (int i = 0; i < 8; i++) {

            // Verificamos que el número no sea cero
            if (numeros[i] == 0) {
                System.out.println("El número introducido en la posición " + (i + 1) + " es cero.");
            } else {
                if (numeros[i] % 2 == 0) {
                    System.out.println(
                            "El número introducido en la posición " + (i + 1) + " corresponde a " + numeros[i]
                                    + " y es par.");
                } else {
                    System.out.println(
                            "El número introducido en la posición " + (i + 1) + " corresponde a " + numeros[i]
                                    + " y es impar.");
                }
            }
        }

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
