//Autor: JAPR
//Fecha: 03/01/26
//Escribe un programa que ordene tres números enteros introducidos por teclado.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el Scaner
import java.util.Scanner;

//Nombre de la clase
public class Hoja3Ejercicio13 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        int n1, n2, n3;

        // Pedimos las variables por teclado.
        System.out.println("Este programa ordena tres números previamente pedidos por teclado.\n"
                + "Introduzca el primer número: ");
        n1 = scanner.nextInt();
        System.out.println("Introduzca el segundo número.");
        n2 = scanner.nextInt();
        System.out.println("Introuduzca el tercer número: ");
        n3 = scanner.nextInt();

        // Enumeramos los casos
        if (n1 <= n2 && n2 <= n3) {
            System.out.printf("%d < %d < %d", n1, n2, n3);
        } else if (n1 <= n3 && n3 <= n2) {
            System.out.printf("%d < %d < %d", n1, n3, n2);
        } else if (n2 <= n1 && n1 <= n3) {
            System.out.printf("%d < %d < %d", n2, n1, n3);
        } else if (n2 <= n3 && n3 <= n1) {
            System.out.printf("%d < %d < %d", n2, n3, n1);
        } else if (n3 <= n1 && n1 <= n2) {
            System.out.printf("%d < %d < %d", n3, n1, n2);
        } else//(n3 <= n2 <= n1)
            System.out.printf("%d < %d < %d", n3, n2, n1);

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
