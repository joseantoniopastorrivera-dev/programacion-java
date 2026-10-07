//Autor: JAPR
//Fecha: 26/12/25
//Escribe un programa en el que se declaren las variables enteras x e y.
//Asígnales los valores 144 y 999 respectivamente.
//A continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación.

//Carpeta a la que pertenece
package Hoja1_Variables;

//LLamamos a la clase Hoja1Ejercicio1
public class Hoja1Ejercicio1 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Declaramos las variables necesarias enteras y les asignamos valores.
        int x, y, suma, resta, multiplicacion;
        x = 144;
        y = 999;
        suma = x + y;
        resta = x - y;
        multiplicacion = x * y;

        // Mostramos por pantalla sus valores y operaciones.
        System.out.printf("La variable 'x' corresponde a %d, la variable 'y' corresponde a %d.\n" +
                "Su suma es: %d.\n" +
                "Su resta es: %d.\n" +
                "Su división es: %.2f.\n" +
                "Su multiplicación es: %d.", x, y, suma, resta, (double) x / y, multiplicacion);

    }
}