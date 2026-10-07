//Autor: JAPR
//Fecha: 01/01/26
//Conversor de pesetas a euros

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio3 {
    
    //Método main o puerta de entrada
    public static void main(String[] args){

        //Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables necesarias.
        double euros;
        double pesetas;
        final double TASA_CAMBIO = 166.386;

        //Pedimos el número de pesetas a convertir.
        System.out.println("Introduzca el número de pesetas que desea convertir a euros: ");
        pesetas = scanner.nextDouble();

        //Convertimos las pesetas en euros.
        euros = pesetas / TASA_CAMBIO;

        //Imprimimos el resultado por pantalla.
        System.out.printf("%.3f peseta(s) corresponden a %.2f euro(s) dada la tasa de cambio de 1 euro igual a %.3f pesetas.", pesetas, euros, TASA_CAMBIO);

        //Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
