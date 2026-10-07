//Autor: JAPR
//Fecha: 28/12/25
//Realiza un programa que pida dos números y que luego muestre el resultado de su multiplicación.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio1 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double numero1;
        double numero2;
        double multiplicacion;

        //Pedimos los dos números por pantalla.
        System.out.println("Introduzca el valor del primer número que desea multiplicar: ");
        numero1 = scanner.nextDouble();

        //Pedimos el segundo número.
        System.out.println("Introduzca el valor del segundo número: ");
        numero2 = scanner.nextDouble();

        //Multiplicamos.
        multiplicacion = numero1 * numero2;

        //Imprimimos el resultado por pantalla.
        System.out.println("El resultado es: " + multiplicacion);

        // Cerramos el scanner para liberar memoria.
        scanner.close();

    }
}
