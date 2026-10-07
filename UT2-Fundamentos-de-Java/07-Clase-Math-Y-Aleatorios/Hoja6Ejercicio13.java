//Autor: JAPR
//Fecha: 29/01/26
//Escribe un programa que simule la tirada de dos dados. 
//El programa deberá continuar tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio13 {

    public static void main(String[] args) {

        int tirada1;
        int tirada2;
        int contador = 1;

        do {
           tirada1 = (int) (Math.random() * 6) + 1;
           tirada2 = (int) (Math.random() * 6) + 1;
            System.out.println("Tirada " + contador + "\tDado 1: " + tirada1 + "\tDado 2: " + tirada2);
            contador++;
        } while (tirada1 != tirada2);
        System.out.println("Han hecho falta " + (contador - 1) + " intentos para que salgan dos dados aleatorios iguales.");
    }
}
