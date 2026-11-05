//Autor: JAPR
//Fecha: 28/12/25
//Realiza un conversor de euros a pesetas.
//La cantidad en euros que se quiere convertir deberá estar almacenada en una variable

//Carpeta a la que pertenece
package Hoja1_Variables;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja1Ejercicio4Mejorado {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables necesarias.
        double euros;
        double pesetas;
        final double TASA_CAMBIO = 166.386;

        //Pedimos por pantalla la cantidad de euros.
        System.out.println("Introduzca la cantidad de euros que desea convertir a pesetas: ");
        euros = scanner.nextDouble();

        //Convertimos los euros en pesetas.
        pesetas = euros * TASA_CAMBIO;

        //Imprimimos por pantalla el resultado.
        System.out.printf("%.2f euros corresponden a %.3f pesetas dada la tasa de cambio de 1 euro igual a %.3f pesetas.",euros, pesetas, TASA_CAMBIO);

        //Cerramos el scanner para liberar memoria.
        scanner.close();
    }

}
