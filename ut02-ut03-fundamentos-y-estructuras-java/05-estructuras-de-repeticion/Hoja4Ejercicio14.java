//Autor:JAPR
//Fecha: 04/01/26
//Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio14 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int base, exponente, resultado;

        // Pedimos la base y el exponente
        System.out.println("Introduzca la base deseada: ");
        base = scanner.nextInt();
        System.out.println("Introduzca el exponente deseado");
        exponente = scanner.nextInt();

        // Filtro seguridad
        if (exponente <= 0) {
            System.out.println("ERROR: Introduzca un exponente mayor que cero.");
        } else {
            // Calculamos
            resultado = (int) Math.pow(base, exponente);

            // Imprimimos el resultado
            System.out.printf("Dada la base %d y el exponente %d, el resultado es: %d.", base, exponente, resultado);
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
