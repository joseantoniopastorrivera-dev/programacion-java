//Autor: JAPR
//Fecha: 02/01/2026
//Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h.
//Nota: Se desprecia el rozamiento del aire. h = (1/2)*g*t^2
//Nota personal: t = ((2*h)/g)^(1/2)

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el Scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio6 {

    // Método main o puerta de entrada.
    public static void main(String[] args){

        //Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

//Declaramos las variables necesarias para nuestra ecuación.
double t, h;
final double g = 9.81;

//Pedimos datos.
System.out.println("Este programa le indica el tiempo que tarda en caer un objeto en base a la altura (en metros) desde la cual caiga.\n"+"Se deprecia el rozamiento por el aire. Introduzca la altura: ");
h = scanner.nextDouble();

//Caso en el que la altura es negativa.
if (h < 0){
    System.out.printf("Dado que el valor de la altura que usted ha indicado es negativo (%f), no es posible calcular con números reales el tiempo que tardará el objeto en caer.", h);
} else{
t = Math.sqrt((2*h)/g);
System.out.printf("Dada la altura h = %f y teniendo el cuenta el valor de la gravedad g = 9,81,\n" + "El tiempo que tardará el objeto en caer es de: %f", h,t);
}
        //Apagamos el scanner para liberar memoria.
        scanner.close();
    }
}
