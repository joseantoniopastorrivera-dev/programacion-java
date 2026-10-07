//Autor:JAPR
//Fecha:22/12/25
//Área de una circunferencia mejorado.

//Carpeta a la que pertenece
package Hoja0_EjerciciosBasicos;

//Importamos el Scanner.
import java.util.Scanner;

//El archivo se llama Ejercicio4Mejorado.
public class Ejercicio4Mejorado {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el Scanner.
        Scanner scanner = new Scanner(System.in);

        // Definimos las variables necesarias para calcular el área con double para que
        // admitan decimales.
        double radio;
        double area;

        // Pedimos el radio de la circunferencia y lo asignamos a la variable
        // correspondiente.
        System.out.println("Este programa calcula el área de una circunferencia. Defina el radio de la misma: ");
        radio = scanner.nextDouble();

        // Calculamos el área de la circunferencia.
        // AQUÍ LA "MEJORA1".
        area = Math.pow(radio, 2) * Math.PI;

        // Imprimimos el resultado por pantalla.
        // AQUÍ LA "MEJORA2".
        System.out.printf("El área de la circunferencia corresponde a:  %.2f", area);

        // Cerramos el Scanner para liberar memoria.
        scanner.close();
    }
}
