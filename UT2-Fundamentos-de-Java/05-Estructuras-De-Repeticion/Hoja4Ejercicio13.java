//Autor: JAPR
//Fecha: 04/01/26
//Escribe un programa que lea una lista de 10 números introducidos por teclado y 
//determine cuántos son positivos y cuántos son negativos.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio13 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        // Declaramos variables
        int positivos = 0, negativos = 0, neutro = 0;
        double num;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca el número " + (i + 1) + " de 10.");
            num = scanner.nextDouble();
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            } else if (num == 0) {
                neutro++;
            }
        }

        // Imprimimos el resultado
        if (neutro > 0) {
            System.out.printf("Hay %d números positivos, %d números negativos y se repite el cero %d veces.", positivos,
                    negativos, neutro);
        } else {
            System.out.printf("Hay %d números positivos, %d números negativos", positivos, negativos);
        }

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
