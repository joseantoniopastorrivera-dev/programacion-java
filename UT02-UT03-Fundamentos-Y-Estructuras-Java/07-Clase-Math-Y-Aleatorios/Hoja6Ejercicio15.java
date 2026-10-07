//Autor: JAPR
//Fecha: 29/01/26
//Realiza un generador de melodía con las siguientes condiciones:
//a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
//b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
//c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra vertical “|” (Alt + 1). 
//El final de la melodía se marcacon dos barras.
//d) La última nota de la melodía debe coincidir con la primera.
//Ejemplo 1:
//do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
//Ejemplo 2:
//la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio15 {

    public static void main(String[] args) {

        String notas[] = { "do", "re", "mi", "fa", "sol", "la", "si" };
        int contador = 1;
        int longitudRandom = (int) ((Math.random() * 7) + 1) * 4;
        int notaInicial = (int)(Math.random() * 7);

        System.out.print(notas[notaInicial] + " ");
        for (int i = 0; i < longitudRandom - 2; i++) {
            int notaRandom = (int) (Math.random() * 7);
            System.out.print(notas[notaRandom] + " ");
            contador++;
            if (contador == 4) {
                if(i < (longitudRandom - 1)){
                    System.out.print("| ");
                }
                contador = 0;
            } 
        }
        System.out.print(notas[notaInicial] + " ||");
    }
}
