//Autor: JAPR
//Fecha: 29/01/26
//Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar números
//  hasta que no saque el 24. El programa deberá decir al final cuántos números se han generado.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio9 {

    public static void main(String[] args) {

        int contador = 1;
        int numero = 0;
        do {
            numero = ((int) (Math.random() * 51) * 2);
            System.out.println("Intento: " + contador + "\tNúmero: " + numero);
            contador++;
        } while (numero != 24);
    }
}
