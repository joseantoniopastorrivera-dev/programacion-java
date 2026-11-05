//Autor: JAPR
//Fecha: 05/01/26
//Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga 
//cuantos números se han introducido, la media de los impares y el mayor de los pares. 
//El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio21 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        double num = 1, par = 0, sumaImpar = 0, media;
        int i = 0, contador = 0;

        // Pedimos el número
        System.out.println("Introduzca un número(negativo para salir): ");
        num = scanner.nextDouble();

        // Bucle del número siendo 0 o más.
        while (num >= 0) {
            contador++;
            if ((num % 2) == 0) {
                if (num > par) {
                    par = num;
                }
            } else {
                sumaImpar = sumaImpar + num;
                i++;
            }
            System.out.println("Introduce otro número (negativo para salir): ");
            num = scanner.nextDouble();
        }

        // Calculamos
        if(i == 0){
            media = 0;
        } else media = sumaImpar / i;
        
        // Imprimimos resultados
        System.out.printf("Ha introducido %d números positivos (el cero también cuenta como positivo).\n", contador);
        System.out.printf("La media de los números %d números impares introducidos es: %.2f.\n",i ,media);
        System.out.printf("El número par mayor de todos los introducidos es: %.2f.", par);

        // Cerramos el scanner
        scanner.close();
    }
}
