//Autor: JAPR
//Fecha: 18/12/25
//Este programa calcula el área de un rectángulo.

//Carpeta a la que pertenece
package Hoja0_EjerciciosBasicos;

//Importamos el scanner.
import java.util.Scanner;

//El archivo se llama Ejercicio3.
public class Ejercicio3 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables que necesitamos con double para que admita
        // decimales.
        double base;
        double altura;
        double area;

        // Pedimos el la base del rectángulo y la asignamos a la variable
        // correspondiente.
        System.out.println("Este programa calcula el área de un rectángulo. Introduzca la base del mismo: ");
        base = scanner.nextDouble();

        // Pedimos la altura del rectángulo y la asignamos a la variable
        // correspondiente.
        System.out.println("Introduzca la altura del rectángulo: ");
        altura = scanner.nextDouble();

        // Calculamos el área del rectángulo.
        area = base * altura;

        // Imprimimos por pantalla el área del rectángulo.
        System.out.println("El área del rectángulo es: " + area);
        
        // Cerramos scanner para liberar memoria.
        scanner.close();
    }
}
