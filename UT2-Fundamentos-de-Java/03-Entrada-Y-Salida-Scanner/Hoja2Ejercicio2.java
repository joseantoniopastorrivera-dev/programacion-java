//Autor: JAPR
//Fecha: 28/12/25
//Realiza un conversor de euros a pesetas. 
//La cantidad de euros que se quiere convertir debe ser introducida por teclado.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio2 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Encendemos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double euros;
        double pesetas;
        final double TASA_CAMBIO = 166.386;

        // Pedimos por pantalla la cantidad de euros.
        System.out.println("Introduzca la cantidad de euro(s) que desea convertir a pesetas: ");
        euros = scanner.nextDouble();

        //Convertimos.
        pesetas = euros * TASA_CAMBIO;

        //Mostramos resultado por pantalla.
        System.out.printf("%.2f euros corresponden a %.3f pesetas dada su tasa de conversión 1 euro igual a %.3f pesetas." , euros, pesetas, TASA_CAMBIO);

        // Apagamos el scanner para ahorrar memoria.
        scanner.close();
    }
}
