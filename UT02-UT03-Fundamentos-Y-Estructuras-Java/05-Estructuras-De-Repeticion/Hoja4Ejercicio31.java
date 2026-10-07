//Autor: JAPR
//Fecha: 06/01/26
//Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la altura.
//El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio31 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);


        // Pedimos la altura
        System.out.println("Introduzca la altura de su 'L': ");
        int altura = scanner.nextInt();

        // Espacio en blanco visual
        System.out.println();

        for (int i = 1; i < altura; i++) {
            System.out.println("*");
        }
        for (int j = 1; j <= ((altura / 2) + 1);j++) {
            System.out.print("*");
        }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
