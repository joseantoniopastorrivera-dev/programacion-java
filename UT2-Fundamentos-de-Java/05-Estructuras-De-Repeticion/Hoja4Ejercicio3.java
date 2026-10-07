//Autor: JAPR
//Fecha: 03/01/26
//Muestra los números múltiplos de j de 0 a 100 utilizando un bucle while.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio3 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int i = 0, j;

        // Preguntamos por el valor de i
        System.out.println("Introduzca el valor deseado: ");
        j = scanner.nextInt();

        // Seguridad en caso de j = 0
        if (j <= 0) {
            System.out.println("ERROR: El valor debe ser mayor que cero.");
        } else {
            do {
                System.out.println(i);
                i = i + j;
            } while (i <= 100);
        }

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
