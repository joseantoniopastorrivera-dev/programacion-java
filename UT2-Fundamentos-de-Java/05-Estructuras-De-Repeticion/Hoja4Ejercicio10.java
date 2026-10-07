//Autor: JAPR
//Fecha: 04/01/26
//Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. 
//A priori, el programa no sabe cuántos números se introducirán. 
//El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio10 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        double num, suma = 0, media = 0;
        int i = 0;

        // Pedimos el primer número
        System.out.println("Introduzca un número positivo: ");
        num = scanner.nextDouble();

        // Bucle while
        while (num >= 0) {
            suma = suma + num;
            i++;
            System.out.println("Introduzca el siguiente número: ");
            num = scanner.nextDouble();
        }

        // Añadimos seguridad
        if (i == 0) {
            System.out.println("ERROR: Introduzca al menos un número positivo.");
        } else {
            media = suma / i;
            System.out.println("La media de los " + i + " números es: " + media);
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
