//Autor: JAPR
//Fecha: 05/01/26
//Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio22 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Encendemos el scanner
        Scanner scanner = new Scanner(System.in);

        // Enunciado
        System.out.println("Números primos entre 2 y 100: ");

        // Bucle general
        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;// Reiciamos la bandera de es primo
            for (int j = 2; j < i; j++) {// Bucle juez
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            // Imprimimos el resultado
            if (esPrimo == true) {
                System.out.printf("%d ", i);
            }
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
