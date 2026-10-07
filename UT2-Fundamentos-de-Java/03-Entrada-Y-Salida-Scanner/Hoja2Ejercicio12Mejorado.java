//Autor: JAPR
//Fecha: 01/01/26
//Realiza un programa que calcule la nota que hace falta sacar en el segundo examen
//de la asignatura Programación para obtener la media deseada. 
//Hay que tener en cuenta que la nota del primer y segundo examen se piden por teclado también.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio12Mejorado {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Encendemos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double nota1, nota2, media, porcentaje1, porcentaje2;

        // Pedimos nota 1 por teclado.
        System.out.println("Introduzca la primera nota (ej: 7,5): ");
        nota1 = scanner.nextDouble();

        // Pedimos cuanto cuenta en porcentaje la nota 1 para la media.
        System.out.println(
                "Introduzca el porcentaje (en tanto por ciento) que cuenta la nota 1 para la media final (ej: 50): ");
        porcentaje1 = scanner.nextDouble();

        // Pedimos cuanto cuenta en porcentaje la nota 2 para la media.
        System.out.println(
                "Introduzca el porcentaje (en tanto por ciento) que cuenta la nota 2 para la media final (ej: 50): ");
        porcentaje2 = scanner.nextDouble();

        // Pedimos la media que se desea obtener.
        System.out.println("Introduza la media que desea obtener (ej: 6,6): ");
        media = scanner.nextDouble();

        // Calculamos la nota 2.
        nota2 = (media - (nota1 * porcentaje1 / 100)) / (porcentaje2 / 100);

        // Imprimimos el resultado por pantalla.
        System.out.printf("Dado %.2f como la primera nota y %.2f como media deseada\n" +
                "y teniendo en cuenta que la primera nota cuenta %.2f %% y la segunda %.2f %%\n" +
                "Debe obtener %.2f como segunda nota para lograr la media deseada.", nota1, media, porcentaje1,
                porcentaje2, nota2);

        // Apagamos el scanner.
        scanner.close();
    }
}