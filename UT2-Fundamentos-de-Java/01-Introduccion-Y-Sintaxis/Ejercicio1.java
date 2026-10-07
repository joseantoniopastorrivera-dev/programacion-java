//Autor: JAPR
//Fecha: 18/12/25
//Primer ejercicio real con Scanner, suma de dos números.

//Carpeta a la que pertenece
package Hoja0_EjerciciosBasicos;

//Importamos el scanner
import java.util.Scanner;

//El archivo se llama Ejercicio1
public class Ejercicio1 {
    //Método main o puerta de entrada
    public static void  main(String[] args) {

        //Activamos el Scanner. System.in significa "Entrada del sistema(teclado)"
Scanner scanner = new Scanner(System.in);

//Declaramos las variables para guardar los datos de entrada y el resultado tipo "double" para que admita decimales.
double numero1;
double numero2;
double resultado;

//Pedimos el primer número.
System.out.println("Este programa suma dos números dados por el usuario. Introduce el primer número.");
//Capturamos el dato en "numero1".
numero1 = scanner.nextDouble();

//Pedimos el segundo número.
System.out.println("Introduce el segundo número.");
//Capturamos el dato en "numero2".
numero2 = scanner.nextDouble();

//Hacemos la suma.
resultado = numero1 + numero2;

//Mostramos el resultado por pantalla. El signo "+" sirve para pegar el texto con valor de la variable.
System.out.println("El resultado es: " + resultado);

//Apagamos el scanner para liberar memoria.
scanner.close();

    }
}
