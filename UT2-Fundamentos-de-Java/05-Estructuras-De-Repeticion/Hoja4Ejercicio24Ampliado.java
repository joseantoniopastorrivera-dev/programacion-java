//Autor: JAPR
//Fecha: 06/01/25
//Escribe un programa que lea un número n e imprima una pirámide de números con n filas.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio24Ampliado {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables
        int altura;
        char c;

        // Pedimos datos
        System.out.println("Introduzca la altura de la pirámide deseada: ");
        altura = scanner.nextInt();
        System.out.println("Introuzca el caracter deseado: ");
        String palabra = scanner.next();

        // Nos quedamos con la primera letra
        c = palabra.charAt(0);

        // Aseguramos de que no sea un número negativo
        if (altura < 0) {
            System.out.println("ERROR: Introduzca un valor mayor que cero.");
        } else {
            // Pirámide normal
            System.out.println("Pirámide normal: ");
            for (int i = 1; i <= altura; i++) {// Bucle principal

                // Bucle de espacios en blanco usando asteriscos
                for (int j = 1; j <= (altura - i); j++) {
                    System.out.print("*");
                }

                // Pirámide imprimiendo caracter
                for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print(c);
                }

                // Segundo lado de la pirámide
                for (int l = 1; l <= (altura - i); l++) {
                    System.out.print("$");
                }

                // Linea normal vertical
                System.out.print("/");

                // Empezamos la pirámide con números
                // Espacios en blanco
                for (int m = 1; m <= (altura - i); m++) {
                    System.out.print(" ");
                }

                // Pirámide de números normales
                for (int n = 1; n <= (2 * i) - 1; n++) {
                    System.out.printf("%d", i);
                }

                // Espacios en blanco pirámide de números(por el otro lado)
                for (int o = 1; o <= altura - i; o++) {
                    System.out.print("#");
                }

                // Separador para la pirámide de verdad
                System.out.print("&");

                // Espacios en blanco pirámide de verdad
                for (int p = 1; p <= (altura - i); p++) {
                    System.out.print("+");
                }

                // PIRAMIDE DE VERDAD
                for (int q = 1; q <= i; q++) {
                    System.out.print(q);
                }

                // Bajada de la piramide de verdad
                for (int r = (i - 1); r >= 1; r--) {
                    System.out.print(r);
                }

                // Salto de linea después de todos los caracteres
                System.out.println();

            }
        }
        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
