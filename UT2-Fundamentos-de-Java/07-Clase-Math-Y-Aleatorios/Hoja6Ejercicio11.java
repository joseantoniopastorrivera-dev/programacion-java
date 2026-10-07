//Autor: JAPR
//Fecha: 29/01/26
//Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma:
// suspenso, suficiente, bien, notable o sobresaliente. 
// Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio11 {

    public static void main(String[] args) {

        String[] notas = { "suspenso", "suficiente", "bien", "notable", "sobresaliente" };
        int contador[] = new int[5];

        for (int i = 0; i < 20; i++) {
            int notaRandom = (int) (Math.random() * notas.length);// En vez de notas.lenght podíamos haber puesto 5 y ya
            contador[notaRandom]++;
            System.out.println("Nota " + (i + 1) + " " + notas[notaRandom]);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantidad de " + notas[i] + "(s): " + contador[i]);
        }

    }
}
