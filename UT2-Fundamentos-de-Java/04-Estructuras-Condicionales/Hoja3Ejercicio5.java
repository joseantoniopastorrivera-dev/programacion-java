//Autor: JAPR
//Fecha: 02/01/26
//Realiza un programa que resuelva una ecuación de primer grado (ax + b = 0)

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el Scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio5 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Encendemos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Definimos las variables necesarias para el ejercicio.
        double a, b, x;

        // Pedimos el valor de a y b.
        System.out.println("Este programa calcula el valor de 'x' en la ecuacion ax + b = 0.\n"
                + "Introduce el valor de la variable 'a'(ej: 2): ");
        a = scanner.nextDouble();
        System.out.println("Introduce el valor de la variable 'b'(ej: 1): ");
        b = scanner.nextDouble();

        // Caso límite en el cuál a = 0.
        if (a == 0) {
            System.out.println("Esta ecuación no tiene solución real.");
        } else {
            x = (-b) / a;
            System.out.printf("Dados los valores:\n" +
                    "a = %f y b = %f, la solución a la ecuacion ax + b = 0 es x = %f", a, b, x);
        }
        // Apagamos el scanner para liberar memoria.
        scanner.close();
    }
}
