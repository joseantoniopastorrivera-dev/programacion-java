//Autor: JAPR
//Fecha: 04/01/26
//Escribe un programa que pida un número entero y calcule su factorial.
//El factorial de un número n (se escribe n!) es el producto de todos los números enteros desde 1 hasta n.
// Ejemplo: 5! = 5 * 4 * 3 * 2 * 1 = 120

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el Scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio28 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int num;
        long acumulado = 1;

        // Pedimos el valor del número
        System.out.println("Introduzca el valor del número del cual desea saber su factorial.");
        num = scanner.nextInt();

        // Bucle
        for (int i = num; i > 0; i--) {
            acumulado = acumulado * i;
        }

        // Imprimimos el resultado
        System.out.printf("El factorial de %d es: %d.", num, acumulado);

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
