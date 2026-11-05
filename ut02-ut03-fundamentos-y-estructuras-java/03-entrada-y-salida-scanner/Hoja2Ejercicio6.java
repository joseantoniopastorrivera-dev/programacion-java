//Autor: JAPR
//Fecha: 01/01/26
//Escribe un programa que calcule el área de un triángulo.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio6 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double base, altura, area;

        // Pedimos base por teclado.
        System.out.println("Introduzca la base del triángulo (hasta dos decimales):");
        base = scanner.nextDouble();

        // Pedimos la altura por teclado.
        System.out.println("Introduzca la altura por teclado (hasta dos decimales): ");
        altura = scanner.nextDouble();

        // Calculamos el área del rectángulo.
        area = base * altura / 2;

        // Imprimimos el resultado por pantalla.
        System.out.printf("Dado %.2f como base y %.2f como altura, el área de su triangulo es: %.2f.",base, altura, area);

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}