//Autor: JAPR
//Fecha: 02/01/26
//// Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que:
// Las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. 
// A partir de la hora 41, se pagan a 16 euros la hora.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el Scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio4Mejorado {

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

       if (horas < 1){
        System.out.println("El número de horas trabajadas en una semana debe ser al menos 1.");
       } else if (horas <= 40){
        salario = horas * 12;
       } else
       salario = (40 * 12) + ((horas - 40) * 16);

       //Imprimimos el resultado solo si las horas son validas.
       if (horas >= 1){
        System.out.printf("Esta semana ha trabajado %.2f horas y su salario es: %.2f euros.",horas, salario);
       }
        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
