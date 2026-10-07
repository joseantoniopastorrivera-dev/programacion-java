//Autor: JAPR
//Fecha: 03/01/26
//Muestra los números múltiplos de x de 0 a 100 utilizando un bucle for.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase.
public class Hoja4Ejercicio1 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Encendemos el Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos variable
        int j;

        // Preguntamos por teclado
        System.out.println("Este programa escribe los números del 0 al 100 divisibles entre un número cualquiera.\n"
                + "Introduzca el número: ");
        j = scanner.nextInt();

        for (int i = 0; i <= 100; i++) {
            if ((i % j) == 0) {
                System.out.printf("%d\n", i);
            }
        }
        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
