//Autor: JAPR
//Fecha: 03/01/26
//Muestra los números múltiplos de j de 0 a 100 utilizando un bucle while.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio2Mejorado {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Declaramos variables
        int i = 0, j;

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Pedimos j
        System.out.println("Introduzca el valor deseado: ");
        j = scanner.nextInt();

        if (j <= 0) {
            System.out.println("ERROR: El número debe ser mayor que 0 para evitar bucles infinitos.");
        } else {
            // Bucle while
            while (i <= 100) {
                System.out.println(i);
                i = i + j;
            }
        }

        // Apagamos el scanner para liberar memoria.
        scanner.close();
    }
}
