//Autor: JAPR
//Fecha: 06/01/26
//Realiza un programa que pida primero un número y a continuación un dígito. 
//El programa debe decir la posición (de izquierda a derecha) donde aparece ese dígito.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio26 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Encendemos el scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        int numReves = 0;
        int posicion = 1;

        // Pedimos el número
        System.out.println("Introduzca un número: ");
        int numero = scanner.nextInt();

        // Pedimos un dígito
        System.out.println("Introduzca un dígito: ");
        int digito = scanner.nextInt();

        // Le damos la vuelta
        while (numero > 0) {
            int x = (numero % 10);
            numReves = (numReves * 10) + x;
            numero = numero / 10;
        }

        // Bucle para recorrer
        int aux = numReves;
        while (aux > 0) {
            int cifraActual = ( aux % 10);
            if(cifraActual == digito){
                System.out.println("El dígito " + digito + " está en la posición: " + posicion);
            }
            aux = aux / 10;
            posicion++;
        }

        // Apagamos el scanner para liberar memoria
        scanner.close();
    }
}
