//Autor: JAPR
//Fecha: 06/01/26
//Escribe un programa que muestre por pantalla todos los números enteros positivos menores a uno
// leído por teclado que no sean divisibles entre otro también leído de igual forma.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio29 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int numeroLimite, numero;
        int contador = 0;

        // Pedimos por pantalla el número límite
        System.out.println("Introduzca el número límite: ");
        numeroLimite = scanner.nextInt();

        // Pedimos el número entre el que no queremos que se pueda dividir nuestro
        // número límite
        System.out.println("Introduzca el número entre el que desea que no se dividan los números: ");
        numero = scanner.nextInt();

        // Bucle para recorrer todos los números menores que el número limite
        for (int i = (numeroLimite - 1); i > 0; i--) {
            // Bucle juez
            if ((i % numero) != 0) {
                System.out.printf("%d ", i);
                contador++;
            }
        }

        // EXTRA NO NECESARIO
        System.out.printf("\nLa cantidad de números que no son divisibles por %d y menores que %d son: %d.", numero,
                numeroLimite, contador);

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
