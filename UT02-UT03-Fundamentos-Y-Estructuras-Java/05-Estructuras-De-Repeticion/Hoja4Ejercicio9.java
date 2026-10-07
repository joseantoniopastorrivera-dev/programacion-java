//Autor: JAPR
//Fecha: 04/01/26
//Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. 
//Hay que realizar el ejercicio utilizando bucles.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio9 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int i = 1;
        long num;//Usamos long para que llegue a números de 19 cifras, con int 'solo' llega a 10 cifras.

        // Pedimos el número
        System.out.println("Introduzca el número. El programa le indicará los dígitos del mismo: ");
        num = scanner.nextLong();//OJO el nextLong en vez de nextInt

        while ((num / 10) != 0) {
            i = i + 1;
            num = num / 10;
        } System.out.println("El número tiene " + i + " cifras.");

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
