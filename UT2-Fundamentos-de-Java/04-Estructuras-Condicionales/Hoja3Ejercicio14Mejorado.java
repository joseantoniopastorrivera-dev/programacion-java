//Autor: JAPR
//Fecha: 03/01/26
//Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio14Mejorado {
    
    //Método main o puerta de entrada.
    public static void main(String[] args){

        //Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        //Declaramos la variable necesaria.
        int numero;

        //Pedimos la variable.
        System.out.println("Introduzca la variable: ");
        numero = scanner.nextInt();

        if ((numero % 2) ==  0){
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        if ((numero % 5) == 0){
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible entre 5.");
        }

        //Cerramos el scanner para liberar memoria.
        scanner.close();
    }
}
