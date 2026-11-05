//Autor: JAPR
//Fecha: 26/12/25
//Dado un tiempo expresado en segundos, convertirlo a horas, minutos y segundos.

//Carpeta a la que pertenece
package Hoja0_EjerciciosBasicos;

//Importamos el Scanner.
import java.util.Scanner;

//LLamamos a la clase Ejercicio7
public class Ejercicio7 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias usando int.
        int seg, min, hora, totalSeg;

        // Pedimos por pantalla el número total de segundos a convertir y lo asociamos a
        // la variable correspondiente.
        System.out.println(
                "Introduzca el número de segundos deseado y este programa lo convertirá a formato hora(s), minuto(s) y segundo(s).");
        totalSeg = scanner.nextInt();

        // Convertimos el número de segundos en horas + minutos + segundos y mostramos
        // por pantalla el resultado.
        hora = totalSeg / 3600;
        seg = totalSeg % 3600;
        min = seg / 60;
        seg = seg % 60;
        System.out.printf("%d segundos corresponden a:\n%d hora(s), %d minuto(s) y %d segundo(s).", totalSeg, hora, min,
                seg);

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }

}
