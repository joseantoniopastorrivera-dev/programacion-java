//Autor: JAPR
//Fecha: 01/01/26
//Escribe un programa que calcule el total de una factura a partir de la base imponible (precio sin IVA). 
//La base imponible estará almacenada en una variable.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase. Ejercicio parecido a Hoja1Ejercicio6.
public class Hoja2Ejercicio7 {

    //Método main o puerta de entrada.
    public static void main(String[] args){

        //Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables necesarias.
        double factura;
        final double IVA = 1.21;
        double facturaIVA;

        //Pedimos por pantalla el precio de la factura sin IVA.
        System.out.println("Indique el valor de la factura sin IVA: ");
        factura = scanner.nextDouble();

        //Añadimos el IVA al precio de la factura.
        facturaIVA = factura * IVA;

        //Imprimimos el resultado por pantalla.
        System.out.printf("Dado el valor de la factura %.2f euros (sin IVA) y tras haber hecho la operación pertinente...\n" + 
        "El valor total a pagar es: %.2f euros (IVA incluido)." ,factura, facturaIVA);

        //Cerramos el scanner para ahorrar memoria.
        scanner.close();
    }
    
}