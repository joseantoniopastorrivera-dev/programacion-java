// Autor: JAPR
// Fecha: 27/01/26
// Objetivo: Simular la tirada de tres dados y sumar sus puntos.

//Carpeta a la que corresponde
package Hoja6_NumerosAleatorios;

//Nombre de la clase
public class Hoja6Ejercicio1 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Generamos aleatoriamente las tiradas de dados
        System.out.println("--TIRADA DE DADOS--");
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int dado3 = (int) (Math.random() * 6) + 1;

        //Mostramos el resultado de las tiradas
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Dado 3: " + dado3);

        //Calculamos el valor de la suma y lo mostramos por pantalla
        int suma = dado1 + dado2 +dado3;
        System.out.println("Suma: " + suma);
    }
}
