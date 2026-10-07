//Autor: JAPR
//Fecha: 03/01/26
//Realiza un programa que resuelva una ecuación de segundo grado (ax^2 + bx + c = 0).
//Nota personal: x = ((-b) + Math.sqrt((b*b) - (4*a*c))) / (2*a)

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio9 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el Scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double a, b, c, x1, x2;

        // Pedimos los datos por pantalla.
        System.out.println("Este programa soluciona ecuaciones de segundo grado (ax^2 + bx + c = 0).\n"
                + "Introduzca el valor de 'a': ");
        a = scanner.nextDouble();
        System.out.println("Introduzca el valor de b: ");
        b = scanner.nextDouble();
        System.out.println("Introduzca el valor de 'c': ");
        c = scanner.nextDouble();

        // Procedemos a solucionar la ecuación.
        if (a == 0) {
            System.out.println("ERROR: 'a' debe adoptar un valor distinto de cero.");
        } else if (((b * b) - (4 * a * c)) > 0) {
            x1 = ((-b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            x2 = ((-b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            System.out.printf("La ecuación tiene dos soluciones.\n" + "Solución 1: %f.\n" + "Solución 2: %f.", x1, x2);
        } else if (((b * b) - (4 * a * c)) == 0) {
            x1 = ((-b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            System.out.printf("La ecuación tiene una solución: %f", x1);
        } else {
            System.out.println("ERROR: No existen raíces cuadradas de números negativos.");
        }
        // Cerramos el Scanner para liberar memoria.
        scanner.close();
    }
}
