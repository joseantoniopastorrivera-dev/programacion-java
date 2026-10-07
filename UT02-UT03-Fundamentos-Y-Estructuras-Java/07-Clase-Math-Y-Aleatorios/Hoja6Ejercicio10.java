//Autor: JAPR
//Fecha: 29/01/26
//Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. 
// El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @. 
// Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio10 {

    public static void main(String[] args) {

        String caracter = "";

        for (int i = 0; i < 10; i++) {
            int numeroRandomCaracter = (int) (Math.random() * 6) + 1;
            int longitudLinea = (int) (Math.random() * 40) + 1;
            switch (numeroRandomCaracter) {
                case 1:
                    caracter = "*";
                    break;
                case 2:
                    caracter = "-";
                    break;
                case 3:
                    caracter = "=";
                    break;
                case 4:
                    caracter = ".";
                    break;
                case 5:
                    caracter = "|";
                    break;
                case 6:
                    caracter = "@";
                    break;
            }
            for (int j = 0; j < longitudLinea; j++) {
                System.out.printf("%s", caracter);
            }
            System.out.println();
        }
    }
}
