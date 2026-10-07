//Autor: JAPR
//Fecha: 22/12/25
//Diseñar el algoritmo que pida por teclado dos números enteros y 
// muestre su suma, resta, multiplicación, división y el resto (módulo).

//Carpeta a la que pertenece
package Hoja0_EjerciciosBasicos;

//Importamos el Scanner.
import java.util.Scanner;

//El archivo se llama Ejercicio5.
public class Ejercicio5 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declararamos las variables necesarias, como el enunciado indica números
        // enteros necesitamos usar "int".
        int numero1, numero2, suma, resta, multiplicacion, division, resto;

        // Pedimos el valor de numero1.
        System.out.println("Este programa calcula la suma, resta, multiplicación, división y resto de dos números.\nIntroduzca el primer número: ");
        numero1 = scanner.nextInt();

        // Pedimos el valor de numero2.
        System.out.println("Introduzca ahora el valor del segundo número: ");
        numero2 = scanner.nextInt();

        //Calculamos las operaciones suma, resta, división, multiplicación y resto.
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;

        //Imprimimos los resultados por pantalla.
        System.out.printf("Teniendo en cuenta que el valor del primer número corresponde a: %d  y el del segundo número a: %d. \n" +
                        "Estos son los resultados: \n" +
                        "Suma: %d \n" +
                        "Resta: %d \n" +
                        "Multiplicación: %d \n" +
                        "División: %d \n" + 
                        "Resto: %d ", numero1, numero2, suma, resta, multiplicacion, division, resto);

        // Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
