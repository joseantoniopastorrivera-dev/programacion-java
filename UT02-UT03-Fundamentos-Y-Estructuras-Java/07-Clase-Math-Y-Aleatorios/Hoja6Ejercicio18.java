//Autor: JAPR
//Fecha: 29/01/26
//Juan y María van a pintar los tres dormitorios de su casa, quieren sustituir el color blanco por colores más alegres.
// Realiza un programa que genere de forma aleatoria una secuencia de tres colores aleatorios (uno para cada dormitorio) 
// de tal forma que no se repita ninguno. Los colores entre los que debe elegir el programa son los siguientes:
// rojo, azul, verde, amarillo, violeta y naranja.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio18 {

    public static void main(String[] args) {

        String colores[] = { "rojo", "azul", "verde", "amarillo", "violeta", "naranja" };
        String solucion[] = new String[3];

        for (int i = 0; i < 3; i++) {
            int indiceColor;
            boolean repetido;

            do {
                repetido = false; // Asumimos que no se ha repetido
                indiceColor = (int) (Math.random() * 6);// Generamos el número para el color random

                // Comprobamos los anteriores
                for (int j = 0; j < i; j++) {
                    if (colores[indiceColor].equals(solucion[j])) {
                        repetido = true;
                    }
                }
            } while (repetido);
            solucion[i] = colores[indiceColor];
        }
        //SOLUCIÓN
        for(int i = 0; i < 3; i++){
            System.out.println("Dormitorio: " + (i + 1) + ": " + solucion[i]);
        }
    }
}
