//Autor: JAPR
//Fecha: 06/01/26
//Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El programa pedirá la altura. 
//Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio33 {

    // Método main o puerta de entrad
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int altura;

        // Pedimos la altura por teclado
        System.out.println("Introduzca la altura deseada para su 'U': ");
        altura = scanner.nextInt();

        // Bucle para recorrer el horizontal
        for (int i = 1; i < altura; i++) {
            System.out.print("*");
            for (int k = 1; k <= (altura - 2); k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        // Espacio en blanco para que la 'U' parezca centrada
        System.out.print(" ");

        // Base de la 'U'
        for (int k = 1; k <= (altura - 2); k++) {
            System.out.print("*");
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}