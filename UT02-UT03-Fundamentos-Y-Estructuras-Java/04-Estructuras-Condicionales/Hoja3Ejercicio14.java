//Autor: JAPR
//Fecha:03/01/26
//Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase
public class Hoja3Ejercicio14 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double numero;

        // Preguntamos el número.
        System.out.println(
                "Este programa le indica si un número es par y divisible entre .\n" + "Introduzca el número: ");
        numero = scanner.nextDouble();

        if ((numero % 2) == 0 && (numero % 5) != 0) {
            System.out.println("El número es par pero no es divisible entre 5.");
        } else if ((numero % 2) == 0 && (numero % 5) == 0) {
            System.out.println("El número es par y divisible entre 5.");
        } else if ((numero % 2) != 0 && (numero % 5) == 0) {
            System.out.println("El número no es par aunque es divisible entre 5.");
        } else { // (numero % 2) != 0 && (numero % 2) == 0)
            System.out.println("El número no es par y tampoco divisible entre 5.");
        }

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
