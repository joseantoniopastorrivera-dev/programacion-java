//Autor: JAPR
//Fecha: 03/01/26
////Muestra los números múltiplos de x de 0 a 100 utilizando un bucle for.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio1Mejorado {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables.
        int j;

        // Pedimos el valor de j por teclado.
        System.out.println("Este programa imprime por pantalla todos los números divisibles (de 0 a 100) entre un valor.\n"
                + "Introduzca dicho valor: ");
        j = scanner.nextInt();

        // Bucle
        for (int i = 0; i <= 100; i++)
            if ((i % j) == 0){
                System.out.println(i);
            }

        // Cerramos el scanner para liberar memoria
        scanner.close();
    }
}
