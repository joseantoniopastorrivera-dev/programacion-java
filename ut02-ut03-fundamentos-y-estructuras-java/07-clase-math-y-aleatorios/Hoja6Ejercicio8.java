//Autor: JAPR
//Fecha: 29/01/26  
//Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2,
//  la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio8 {

    public static void main(String[] args) {

        System.out.println("--3 APUESTAS DE LA QUINIELA (porcentajes cambiados)--");
        for (int i = 0; i < 15; i++) {
            if (i < 14) {
                System.out.printf("Partido %d ", (i + 1));
            } else {
                System.out.printf("Pleno %4d", (i + 1));
            }
            for (int j = 0; j < 3; j++) {
                String resultado[] = new String[3];
                int numeroRandom = (int) (Math.random() * 6) + 1;
                if (numeroRandom <= 3) {
                    resultado[j] = "1";
                } else if (numeroRandom > 5) {
                    resultado[j] = "2";
                } else {
                    resultado[j] = "x";
                }
                System.out.printf("\t%s ", resultado[j]);
            }
            System.out.println();
        }
    }
}
