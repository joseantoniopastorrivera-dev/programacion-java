//Autor: JAPR
//Fecha: 05/01/26
//Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado 
//y validados como distintos. El programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio18 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int num1, num2;

        // Pedimos los dos números.
        System.out.println("Introduzca el primer número: ");
        num1 = scanner.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2 = scanner.nextInt();

        // Validamos que sean diferentes números
        if (num1 == num2) {
            System.out.println("ERROR: Introduzca dos números distintos.");
        } else if (num1 < num2) {
            for (int i = num1; i < num2; i += 7) {
                System.out.printf("%d ", i);
            }
        } else { // (num1 > num2)
            for (int i = num2; i < num1; i += 7) {
                System.out.printf("%d ", i);
            }
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
