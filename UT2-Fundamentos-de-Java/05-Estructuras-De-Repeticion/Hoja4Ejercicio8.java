//Autor: JAPR
//Fecha: 04/01/26
//Muestra la tabla de multiplicar de un número introducido por teclado.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio8 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Encendemos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        int num;

        // Pedimos por teclado el número
        System.out.println("Introduzca el número deseado: ");
        num = scanner.nextInt();

        // Bucle for
        for (int i = 0; i <= 10; i++) {
            System.out.println("" + num + " x " + i + " = " + (i * num));
        }

        // Apagamos el scanner para liberar memoria.
        scanner.close();
    }
}
