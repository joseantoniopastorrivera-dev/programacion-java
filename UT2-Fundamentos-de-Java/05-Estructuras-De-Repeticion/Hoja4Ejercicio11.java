//Autor: JAPR
//Fecha: 04/01/26
//Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de 
//los 5 primeros números enteros a partir de uno que se introduce por teclado.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio11 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias
        int num;

        // Pedimos el número por pantalla
        System.out.println("Introduce el número deseado: ");
        num = scanner.nextInt();

        // Título bonito
        System.out.printf("%-12s %-12s %-12s\n", "Número", "Cuadrado", "Cubo");
        System.out.println("------       --------     ----");

        // Bucle for
        for (int i = num; i <= (num + 4); i++) {
            System.out.printf("%-12d %-12d %-12d\n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
        }

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
