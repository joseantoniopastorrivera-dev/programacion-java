//Autor: JAPR
//Fecha: 30/01/26
//Escribe un programa que, dado un número introducido por teclado, elija al azar uno de sus dígitos.
//Ejemplo 1:
//Por favor, introduzca un número entero positivo: 406783
//7
//Ejemplo 2:
//Por favor, introduzca un número entero positivo: 406783
//3
//Ejemplo 3:
//Por favor, introduzca un número entero positivo: 406783
//0

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String numeroString;

        // Pedimos el número y lo guardamos como String para poder contar su longitud
        System.out.println(
                "Introduzca un número por teclado positivo y el programa seleccionará al azar uno de sus dígitos: ");
        numeroString = scanner.next();

        // Obtenemos su longitud
        int longitud = numeroString.length();

        // Generamos un índice aleatorio entre 0 y longitud -1
        int indiceAleatorio = (int) (Math.random() * longitud);

        // Extraemos el carárter(dígito) en esa posición
        char digitoElegido = numeroString.charAt(indiceAleatorio);

        // Mostramos el resultado por pantalla
        System.out.println("RESULTADO: " + digitoElegido);

        scanner.close();
    }
}
