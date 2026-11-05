//Autor: JAPR
//Fecha: 01/01/26
//Realiza un conversor de Kb a Mb.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio11 {
    
    //Método main o puerta de entrada
    public static void main(String[] args){

        //Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables necesarias.
        double mb;
        double kb;
        final double TASA_CAMBIO = 1024;

        //Pedimos el número de Kb a convertir.
        System.out.println("Introduzca el número de kilobytes que desea convertir a megabytes: ");
        kb = scanner.nextDouble();

        //Convertimos los Megabytes en Kilobytes.
        mb = kb / TASA_CAMBIO;

        //Imprimimos el resultado por pantalla.
        System.out.printf("%.2f Kilobyte(s) corresponden a %.2f Megabyte(s) dada la tasa de conversión de 1 Megabyte igual a %.2f Kilobytes.", kb, mb, TASA_CAMBIO);

        //Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}