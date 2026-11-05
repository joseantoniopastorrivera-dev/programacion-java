//Autor: JAPR
//Fecha: 28/12/25
//Realiza un conversor de euros a pesetas.
//La cantidad en euros que se quiere convertir deberá estar almacenada en una variable

//Carpeta a la que pertenece
package Hoja1_Variables;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja1Ejercicio4 {
    
    //Método main o puerta de entrada.
    public static void main(String[] args){

        //Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables que vamos a necesitar.
        double euros;
        double pesetas;

        //Pedimos que nos indiquen la cantidad de euros a convertir a pesetas.
        System.out.println("Introduzca la cantidad de euros que desea convertir a pesetas: ");
        euros = scanner.nextDouble();

        //Convertimos los euros en pesetas.
        pesetas = euros * 166.386;

        //Imprimimos por pantalla el resultado.
        System.out.printf("La cantidad de %.2f euros indicada por el usuario corresponde a %.3f pesetas.",euros, pesetas);
        //Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
