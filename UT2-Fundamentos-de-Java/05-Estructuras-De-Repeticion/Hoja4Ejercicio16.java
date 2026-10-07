//Autor: JAPR
//Fecha: 04/01/26
//Escribe un programa que pida un número entero y diga si es primo o no. 
//(Un número primo es aquel que solo es divisible por 1 y por sí mismo)

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la sala
public class Hoja4Ejercicio16 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int num;
        boolean esPrimo = true; // Asumimos que es primo hasta que se demuestre lo contrario.

        // Pedimos el número
        System.out.println("Introduzca el número: ");
        num = scanner.nextInt();

        // Caso especial: 0, 1 y negativos no son primos
        if (num <= 1) {
            esPrimo = false;
        } else {
            // Bucle for
            for (int i = 2; i <= (num - 1); i++) {
                if ((num % i) == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        // Veredicto final
        if (esPrimo) {
            System.out.printf("El número %d SÍ es primo.", num);
        } else {
            System.out.printf("El número %d NO es primo.", num);
        }

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}