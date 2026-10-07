//Autor: JAPR
//Fecha: 05/01/26
//Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado.
//Se debe comprobar que el dato introducido es correcto (que es un número positivo).

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio17 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int num;
        long acumulado = 0;

        // Pedimos el número
        System.out.println("Introduzca el número deseado.");
        num = scanner.nextInt();

        // Comprobamos que es positivo
        if (num <= 0) {
            System.out.println("ERROR: Introduzca un número positivo.");
        } else {
            for (int i = (num + 1); i <= (num + 100); i++) {
                acumulado = acumulado + i;
            }
            System.out.printf("%d \n", acumulado);
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
