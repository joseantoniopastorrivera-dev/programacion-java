//Autor: JAPR
//Fecha: 29/01/26
//Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii entre el 32 y el 126.
//Puedes hacer casting con (char) para convertir un entero en un carácter.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio12 {

    public static void main(String[] args) {

        String verde = "\033[32m";

        while (true) {
            int numeroRandom = (int) (Math.random() * 95) + 32;
            char letra = (char) numeroRandom;
            System.out.print(verde + letra);
        }
    }
}
