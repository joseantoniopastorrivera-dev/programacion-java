//Autor: JAPR
//Fecha: 01/01/26
//Escribe un programa que calcule el volumen de un cono.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio9 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double radio, altura, volumen;

        // Pedimos el radio por teclado.
        System.out.println("Introduzca el radio del cono (hasta dos decimales):");
        radio = scanner.nextDouble();

        // Pedimos la altura por teclado.
        System.out.println("Introduzca la altura por teclado (hasta dos decimales): ");
        altura = scanner.nextDouble();

        // Calculamos el volumen del cono.
        volumen = Math.pow(radio, 2) * altura * Math.PI / 3;

        // Imprimimos el resultado por pantalla.
        System.out.printf("Dado %.2f como radio y %.2f como altura, el volumen de su cono es: %.2f.",radio, altura, volumen);

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}