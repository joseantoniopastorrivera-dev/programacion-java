//Autor: JAPR
//Fecha: 01/01/26
//Escribe un programa que sume, reste, multiplique y divida dos números introducidos por teclado.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio4 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double numero1, numero2, suma, resta, multiplicacion, division, modulo;

        // Pedimos el primer número por teclado.
        System.out.println("Introduzca el primer número: ");
        numero1 = scanner.nextDouble();

        // Pedimos el segundo número.
        System.out.println("Introdudzca el segundo número: ");
        numero2 = scanner.nextDouble();

        // Realizamos las operaciones pertinentes.
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        modulo = numero1 % numero2;

        // Imprimimos el resultado por pantalla.
        System.out.printf("Dado %.3f como primer número y %.3f como segundo:\n" +
                "La suma es: %.3f.\n" +
                "La resta es: %.3f.\n" +
                "La multiplicación es: %.3f.\n" +
                "La división es: %.3f.\n" +
                "El módulo o resto es: %.3f.",numero1, numero2, suma, resta, multiplicacion, division, modulo);

        // Apagamos el scanner para liberar memoria.
        scanner.close();
    }
}
