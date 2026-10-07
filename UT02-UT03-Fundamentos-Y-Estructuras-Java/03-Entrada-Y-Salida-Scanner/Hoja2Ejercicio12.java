//Autor: JAPR
//Fecha: 01/01/26
//Realiza un programa que calcule la nota que hace falta sacar en el segundo examen
//de la asignatura Programación para obtener la media deseada. 
//Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio12 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Encendemos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double nota1, nota2, media;

        // Pedimos nota 1 por teclado.
        System.out.println("Introduzca la primera nota: ");
        nota1 = scanner.nextDouble();

        // Pedimos la media que se desea obtener.
        System.out.println("Introduza la media que desea obtener: ");
        media = scanner.nextDouble();

        // Calculamos la nota 2.
        nota2 = (media - (nota1 * 0.4)) / 0.6;

        // Imprimimos el resultado por pantalla.
        System.out.printf("Dado %.2f como la primera nota y %.2f como media deseada...\n" +
                "Debe obtener %.2f como segunda nota para lograr la media deseada.", nota1, media, nota2);

        // Apagamos el scanner.
        scanner.close();
    }
}
