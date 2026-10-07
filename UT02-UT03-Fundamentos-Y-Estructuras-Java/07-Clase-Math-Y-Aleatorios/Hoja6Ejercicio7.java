//Autor: JAPR
//Fecha: 29/01/26
//Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
// para los 14 partidos y el pleno al quince (15 filas).

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio7 {

    public static void main(String[] args) {

        System.out.println("--3 APUESTAS DE LA QUINIELA--");
        for (int i = 0; i < 15; i++) {
            if (i < 14) {
                System.out.printf("Partido %d ", (i + 1));
            } else {
                System.out.printf("Pleno %4d", (i + 1));
            }
            for (int j = 0; j < 3; j++) {
                String resultado[] = new String[3];
                int numeroRandom = (int) (Math.random() * 101) + 1;
                if (numeroRandom <= 33) {
                    resultado[j] = "1";
                } else if (numeroRandom > 66) {
                    resultado[j] = "2";
                } else {
                    resultado[j] = "x";
                }
                System.out.printf("\t%s ",resultado[j]);
            }
            System.out.println();
        }
    }
}
