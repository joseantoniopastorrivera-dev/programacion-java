//Autor: JAPR
//Fecha: 22/12/25
//Área de una circunferencia, se solicitarán al usuario los datos necesarios.

//Carpeta a la que pertenece
package Hoja0_EjerciciosBasicos;

//Imortamos el scanner.
import java.util.Scanner;

//El archivo se llama Ejercicio4.
public class Ejercicio4 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el Scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias usando double par que permita números
        // decimales.
        double radio;
        double area;

        // Pedimos el valor del radio de la circunferencia y lo asignamos a la variable
        // "radio" correspondiente.
        System.out.println("Este programa calcula el área de una circunferencia dado su radio. Defina el radio: ");
        radio = scanner.nextDouble();

        // Calculamos el área de la circunferencia importando el valor PI de la clase
        // Math de JAVA(no necesitamos importarlo arriba).
        area = radio * radio * Math.PI;

        // Imprimimos por pantalla el valor del área dado el radio de la circunferencia.
        System.out.println("El área de la circunferencia es: " + area);

        // Cerramos el Scanner.
        scanner.close();
    }

}
