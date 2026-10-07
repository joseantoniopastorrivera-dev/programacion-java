//Autor: JAPR
//Fecha: 06/01/26
//Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares.
//Los dígitos pares se deben mostrar en orden, de izquierda a derecha. 
//Usa long en lugar de int donde sea necesario para admitir números largos.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio32 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        long numero, cifraActual, numeroReves = 0;
        int longitud = 0;
        long sumaPares = 0;

        // Pedimos el número por teclado
        System.out.println("Introduzca un número entero positivo: ");
        numero = scanner.nextLong();

        // Comprobamos que el número no sea negativo
        if (numero <= 0) {
            System.out.println("ERROR: Introduce un número válido.");
        } else {
            // Le damos la vuelta al número
            while (numero > 0) {
                cifraActual = (numero % 10);
                numeroReves = (numeroReves * 10) + cifraActual;
                numero = numero / 10;
                longitud++;
            }

            // Dígitos pares
            System.out.println("Dígitos pares: ");
            // Recorremos el número volteado
            for (int j = 0; j < longitud; j++) {
                long digito = (numeroReves % 10);
                //Comprobamos si es par
                if((digito % 2) == 0){
                    System.out.print( digito + " ");
                    sumaPares = sumaPares + digito;
                }
                numeroReves = numeroReves / 10;
            }

            //Mostramos la suma de pares
            System.out.println();//Salto de línea estético
            System.out.println("La suma de los dígitos pares es : " + sumaPares);

            // Cerramos el scanner para ahorrar memoria
            scanner.close();
        }

    }
}
