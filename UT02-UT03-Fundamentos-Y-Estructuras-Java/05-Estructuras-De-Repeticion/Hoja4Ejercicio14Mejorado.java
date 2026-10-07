//Autor: JAPR
//Fecha:05/01/25
//Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio14Mejorado {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        int base, exponente, resultado = 1;

        // Pedimos las variables necesarias
        System.out.println("Introduzca la base deseada: ");
        base = scanner.nextInt();
        System.out.println("Introduzca el exponente deseado: ");
        exponente = scanner.nextInt();

//Comprobamos si el exponente es positivo.
if (exponente <= 0){
    System.out.println("ERROR: Introduzca un exponente positivo.");
} else {
    //Hacemos la cuenta con un bucle FOR
    for (int i = 1; i <= exponente; i++){
        resultado = resultado * base;
    } System.out.println("El resultado es: " + resultado);
}

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }

}
