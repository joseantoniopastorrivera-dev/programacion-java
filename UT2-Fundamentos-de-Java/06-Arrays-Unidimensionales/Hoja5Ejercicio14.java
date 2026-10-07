// Autor: JAPR
// Fecha: 27/01/26
// Programa que pide 8 palabras y las ordena en un nuevo array: 
// primero los colores (verde, rojo, azul, amarillo, naranja, rosa, negro, 
// blanco, morado) y después el resto, manteniendo su orden original.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja5Ejercicio14 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activmamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables y arrays necesarios
        String palabras[] = new String[8];
        String colores[] = new String[8];
        String noColores[] = new String[8];
        String palabrasOrdenadas[] = new String[8];
        int contadorColores = 0;
        int contadorNoColores = 0;

        // Pedimos las ocho palabras
        for (int i = 0; i < 8; i++) {
            System.out.println("Introduzca la palabra " + (i + 1) + " de 8: ");
            palabras[i] = scanner.next().toLowerCase();

            boolean esColor = false;

            // Comprobamos si es color o no
            if (palabras[i].equals("verde") || palabras[i].equals("rojo") ||
                    palabras[i].equals("azul") || palabras[i].equals("amarillo") ||
                    palabras[i].equals("naranja") || palabras[i].equals("rosa") ||
                    palabras[i].equals("negro") || palabras[i].equals("blanco") ||
                    palabras[i].equals("morado")) {
                esColor = true;
            }

            if (esColor) {
                colores[contadorColores] = palabras[i];
                contadorColores++;
            } else {
                noColores[contadorNoColores] = palabras[i];
                contadorNoColores++;
            }
        }

        //Array ordenado
        //Introducimos los colores
        for (int i = 0; i < contadorColores; i++) {
            palabrasOrdenadas[i] = colores[i];
        }
        //Introducimos ahora los 'no-colores'
        for (int i = contadorColores; i < 8; i++) {
            palabrasOrdenadas[i] = noColores[i - contadorColores];
        }

        // Imprimimos el resultado
        System.out.println("----ARRAY ORIGINAL-----");
        for (int i = 0; i < 8; i++) {
            System.out.printf("ÍNDICE %d\tPalabra: %s\n", i, palabras[i]);
        }
        
        System.out.println("----ARRAY ORDENADO----");
        for (int i = 0; i < 8; i++) {
            System.out.printf("ÍNDICE %d\tPalabra: %s\n", i, palabrasOrdenadas[i]);
        }

        // Apagamos el scanner
        scanner.close();
    }
}