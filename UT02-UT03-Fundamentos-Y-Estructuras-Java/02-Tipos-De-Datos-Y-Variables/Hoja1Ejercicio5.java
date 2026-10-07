//Autor: JAPR
//Fecha: 28/12/25
//Conversor pesetas a euros.

//Carpeta a la que pertenece
package Hoja1_Variables;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja1Ejercicio5 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias para el ejercicio.
        double euros;
        double pesetas;
        final double TASA_CAMBIO = 166.386;

        //Pedimos la cantidad de pesetas por pantalla.
        System.out.println("Indique la cantidad de pesetas que desea convertir a euros.");
        pesetas = scanner.nextDouble();

        //Convertimos las pesetas a euros.
        euros = pesetas / TASA_CAMBIO;

        //Mostramos el resultado por pantalla.
        System.out.printf("%.3f pesetas corresponden a %.2f euros dada la tasa de cambio 1 euro igual a %.3f pesetas.",pesetas ,euros, TASA_CAMBIO);

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
