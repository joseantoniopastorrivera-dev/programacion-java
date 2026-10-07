//Autor: JAPR
//Fecha: 06/01/26
//Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su suma no supere el valor 10000.
//Cuando esto ocurra (se pase de 10.000), se debe mostrar:
//El total acumulado.
//El contador de números.
//La media.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio23 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        double total = 0;
        double num = 0;
        int contador = 0;
        double media;

        // Pedimos por primera vez número. Esta parte sobra y es irrelevante
        System.out.println("Introduzca el primer número: ");
        num = scanner.nextDouble();
        total = total + num;
        contador++;

        // Bucle
        while (total <= 10000) {
            System.out.println("Introduzca un número: ");
            num = scanner.nextDouble();
            total = total + num;
            contador++;
        }

        // Calculamos la media
        media = total / contador;

        // Imprimimos resultado
        System.out.printf("Total acumulado: %.2f.\n" +
                "Contador de números: %d.\n" +
                "Media: %.2f.", total, contador, media);

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
