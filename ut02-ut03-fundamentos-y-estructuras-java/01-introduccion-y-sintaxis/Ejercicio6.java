//Autor: JAPR
//Fecha: 26/12/25
//Algoritmo que convierta cm a pulgadas

//Carpeta a la que pertenece
package Hoja0_EjerciciosBasicos;

//Importamos el Scanner.
import java.util.Scanner;

//LLamamos a la clase Ejercicio6
public class Ejercicio6 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables con double para el algoritmo.
        double cm, pulgadas;

        // Pedimos el valor por pantalla.
        System.out.println("Este programa convierte centímetros en pulgadas. Introduzca el valor en cm a convertir: ");
        cm = scanner.nextDouble();

        // Convertimos los cm en pulgadas y los imprimimos por pantalla.
        pulgadas = cm / 2.54;
        System.out.printf("%.2f centímetro(s) corresponden a %.2f pulgadas.", cm, pulgadas);

        // Cerramos scanner para liberar memoria.
        scanner.close();
    }
}
