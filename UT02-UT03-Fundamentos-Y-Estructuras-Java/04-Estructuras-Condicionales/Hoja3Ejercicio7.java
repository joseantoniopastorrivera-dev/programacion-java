//Autor: JAPR
//Fecha: 03/01/26
//Media ponderada de tres notas.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio7 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double nota1, nota2, nota3, v1, v2, v3, media;

        // Pedimos datos por pantalla.
        System.out.println("Este programa calcula la media de tres notas.\n" +
                "Introduzca la primera nota(ej: 7): ");
        nota1 = scanner.nextDouble();
        System.out.println("Introduzca cuanto cuenta (en porcentaje) para la media la primera nota(ej: 30): ");
        v1 = scanner.nextDouble();
        System.out.println("Introduzca la segunda nota(ej: 6): ");
        nota2 = scanner.nextDouble();
        System.out.println("Introduzca cuanto cuenta (en porcentaje) para la media la segunda nota(ej: 20): ");
        v2 = scanner.nextDouble();
        System.out.println("Introduzca la tercera nota(ej: 8): ");
        nota3 = scanner.nextDouble();
        System.out.println("Introduzca cuanto cuenta (en porcentaje) para la media la tercera nota(ej: 40): ");
        v3 = scanner.nextDouble();

        // Calculamos la media.
        media = ((nota1 * v1) + (nota2 * v2) + (nota3 * v3)) / 100;

        // Imprimimos el resultado por pantalla.
        System.out.printf(
                "Primera nota: %.2f.\n" + "Porcentaje de la primera nota para la media: %.2f%%.\n"
                        + "Segunda nota: %.2f\n." + "Porcentaje de la segunda nota: %.2f%%.\n" + "Tercera nota: %.2f\n."
                        + "Porcentaje de la tercera nota: %.2f%%.\n" + "Media: %.2f",
                nota1, v1, nota2, v2, nota3, v3, media);

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
