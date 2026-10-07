//Autor: JAPR
//Fecha: 01/01/26
//Realiza un conversor de Mb a Kb.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio10 {
    
    //Método main o puerta de entrada
    public static void main(String[] args){

        //Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables necesarias.
        double mb;
        double kb;
        final double TASA_CAMBIO = 1024;

        //Pedimos el número de Mb a convertir.
        System.out.println("Introduzca el número de megabytes que desea convertir a kilobytes: ");
        mb = scanner.nextDouble();

        //Convertimos los Megabytes en Kilobytes.
        kb = mb * TASA_CAMBIO;

        //Imprimimos el resultado por pantalla.
        System.out.printf("%.2f Megabyte(s) corresponden a %.2f Kilobyte(s) dada la tasa de conversión de 1 Megabyte igual a %.2f Kilobytes.", mb, kb, TASA_CAMBIO);

        //Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}