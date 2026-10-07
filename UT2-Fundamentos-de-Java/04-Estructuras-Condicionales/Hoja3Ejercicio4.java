//Autor: JAPR
//Fecha: 02/01/26
// Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que:
// Las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
// A partir de la hora 41, se pagan a 16 euros la hora.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el Scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio4 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos la variable horas de trabajo.
        double horas;
        double salario = 0;

        // Pedimos por pantalla la cantidad de horas trabajadas por semana.
        System.out.println("Introduzca la cantidad de horas trabajadas en la semana(ej: 42): ");
        horas = scanner.nextDouble();

        if (horas < 1) {
            System.out.println("El número de horas trabajadas en una semana debe ser al menos 1.");
        } else if (horas >= 1 && horas <= 40) {
            horas = horas * 12;
            System.out.printf("Como la cantidad de horas trabajadas esta semana es igual o menor a 40,\n" +
                    "se paga a 12e por hora. Su salario de esta semana será: %.2fe.", horas);
        } else {
            salario = (40 * 12) + ((horas - 40) * 16);
            System.out.printf("Como la cantidad de horas trabajadas esta semana es mayor a 40,\n" +
                    "se paga a 12e la hora (hasta las 40) y por encima a 16e la hora. Su salario esta semana será: %.2fe.",
                    salario);
        }

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
