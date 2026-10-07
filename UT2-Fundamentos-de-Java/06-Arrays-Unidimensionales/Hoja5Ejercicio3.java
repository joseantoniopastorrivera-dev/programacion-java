//Autor: JAPR
//Fecha: 06/01/26
//Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso,
//es decir, el primero que se introduce es el último en mostrarse y viceversa.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

// Nombre de la clase
public class Hoja5Ejercicio3 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos el array
        int array[] = new int[10];

        //Pedimos los números 
        for(int i = 0; i < 10; i++) {
            System.out.printf("Introduzca el número %d de los 10 totales: ", (i + 1));
            array[i] = scanner.nextInt();
        }

        //Imprimimos los números al reves
        System.out.println("\nLos números introducidos en orden inverso son: ");
        for(int j = (array.length - 1); j>= 0; j--) {
            System.out.println("Posición " + (j + 1) + ": " + array[j]);
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
