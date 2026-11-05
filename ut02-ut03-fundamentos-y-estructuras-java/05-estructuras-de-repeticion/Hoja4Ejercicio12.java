//Autor: JAPR
//Fecha: 04/01/26
//Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. 
//La serie empieza con 0 y 1, y el siguiente número es siempre la suma de los dos anteriores.
//Serie: 0, 1, 1, 2, 3, 5, 8, 13, 21...

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio12 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int num;
        long f1 = 0, f2 = 1, aux;

        // Pedimos la cantidad de números por pantalla
        System.out.println("Introduce cuantos números de la serie de Fibonacci quiere ver por pantalla: ");
        num = scanner.nextInt();

        // Bucle
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ",f1);
            aux = f1 + f2;
            f1 = f2;
            f2 = aux;
        }

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
