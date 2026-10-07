//Autor: JAPR
//Fecha: 29/01/26
//Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. 
// El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @. 
// Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio10Mejorado {

    public static void main(String[] args) {

        char[] caracteres = { '*', '-', '=', '.', '|', '@' };

        for (int i = 0; i < 10; i++) {
            int numeroRandomCaracter = (int) (Math.random() * 6);
            int longitud = (int) (Math.random() * 40) + 1;
            for (int j = 0; j < longitud; j++) {
                System.out.print(caracteres[numeroRandomCaracter]);
            }
            System.out.println();
        }
    }
}
