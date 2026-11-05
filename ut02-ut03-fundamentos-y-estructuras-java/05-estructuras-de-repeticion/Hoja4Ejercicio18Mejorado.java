//Autor: JAPR
//Fecha: 05/01/26
//Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado 
//y validados como distintos. El programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Importamos el scanner
import java.util.Scanner;

//Nombre de la clase
public class Hoja4Ejercicio18Mejorado {

    //Método main o puerta de entrada
    public static void main(String[] args){

        //Activamos el scanner
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables necesarias
        int num1, num2;

        //Pedimos las variables
        System.out.println("Introduzca el primer número: ");
        num1 = scanner.nextInt();
        System.out.println("Introduzca el segundo número: ");
        num2 = scanner.nextInt();

        //Verificamos q no son iguales
        if (num1 == num2){
            System.out.println("ERROR: Introduzca dos números distintos.");
        } else {
            int menor = Math.min(num1, num2);
            int mayor = Math.max(num1, num2);
            for(int i = menor; i < mayor; i += 7){
                System.out.printf("%d ", i);
            }
        }
        //Cerramos el scanner para liberar memoria
        scanner.close();
    }
    
}
