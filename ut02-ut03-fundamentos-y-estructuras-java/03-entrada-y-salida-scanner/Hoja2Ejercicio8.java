//Autor: JAPR
//Fecha: 01/01/26
//Escribe un programa que calcule el salario semanal de un empleado en base a
//las horas trabajadas, a razón de 12 euros la hora.

//Carpeta a la que pertenece
package Hoja2_LecturaDatos;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja2Ejercicio8 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias.
        double horas;
        final double SALARIO_HORA = 12;
        double salario;

        // Pedimos la cantidad de horas por teclado.
        System.out.println("Introduzca la cantidad de horas que ha trabajado esta semana: ");
        horas = scanner.nextDouble();

        // Calculamos el salario de la semana.
        salario = horas * SALARIO_HORA;

        // Imprimimos el resultado por pantalla.
        System.out.printf("El salario semanal de esta semana corresponde a: %.2f euros.\n" +
                "Ha trabajado %.2f horas y cada hora se paga a %.2f euros", salario, horas, SALARIO_HORA);

        // Apagamos el scanner para liberar memoria.
        scanner.close();
    }
}
