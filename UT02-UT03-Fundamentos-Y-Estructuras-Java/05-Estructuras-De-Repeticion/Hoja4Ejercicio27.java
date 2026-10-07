//Autor: JAPR
//Fecha: 06/01/26
//Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio27 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Encendemos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables
        int numero;
        int contador = 0;
        int numeroAcumulado = 0;

        // Pedimos el número por pantalla
        System.out.println("Introudzca un número: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            if ((i % 3) == 0) {
                contador++;
                numeroAcumulado = numeroAcumulado + i;
                System.out.printf("%d ", i);
            }
        }

         //Mostramos por pantalla la suma total de los multiplos de 3 y el contador de números
         System.out.printf("Número total de números: %d.\n", contador);
         System.out.printf("Suma total de los números: %d", numeroAcumulado);

        // Apagamos el scanner
        scanner.close();
    }
}
