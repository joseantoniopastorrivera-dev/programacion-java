//Autor: JAPR
//Fecha: 27/01/26
//1. Genera 10 números aleatorios (0-200).
// 2. Muestra el array original con sus índices.
// 3. Ordena en un nuevo array alternando: [Menor de 100, Mayor de 100, Menor, Mayor...].
// 4. Si faltan de un tipo, completa con los que queden del otro.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Nombre de la clase
public class Hoja5Ejercicio18 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Declaramos las variables y arrays necesarios
        int numeros[] = new int[10];
        int menores[] = new int[10];
        int mayores[] = new int[10];
        int numerosOrdenados[] = new int[10];
        int contadorMenores = 0;
        int contadorMayores = 0;
        int indiceMenor = 0;
        int indiceMayor = 0;

        // Rellenamos el array
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 201);
        }

        // Mostramos el array original y sus índices
        System.out.print("--ARRAY ORIGINAL--");
        System.out.print("\nÍNDICE: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("\t %3d", i);
        }
        System.out.println();
        System.out.print("VALOR: \t");
        for (int i = 0; i < 10; i++) {
            System.out.printf("\t %3d", numeros[i]);
        }

        // Clasificamos los mayores y menores en los dos arrays correspondientes
        for (int i = 0; i < 10; i++) {
            if (numeros[i] <= 100) {
                menores[contadorMenores] = numeros[i];
                contadorMenores++;
            } else {
                mayores[contadorMayores] = numeros[i];
                contadorMayores++;
            }
        }

        // Colocamos
        for (int i = 0; i < 10; i++) {
            boolean quedanMenores = indiceMenor < contadorMenores;
            boolean quedanMayores = indiceMayor < contadorMayores;

            if (quedanMenores && quedanMayores) {// Suponemos que quedan tanto mayores como menores entonces alternamos
                if (i % 2 == 0) {// Toca menor
                    numerosOrdenados[i] = menores[indiceMenor];
                    indiceMenor++;
                } else {// Toca mayor
                    numerosOrdenados[i] = mayores[indiceMayor];
                    indiceMayor++;
                }
            } else if (quedanMenores) {// Quedan menores y se han acabado los mayores
                numerosOrdenados[i] = menores[indiceMenor];
                indiceMenor++;
            } else if (quedanMayores) {// Quedan mayores y se han acabado los menores
                numerosOrdenados[i] = mayores[indiceMayor];
                indiceMayor++;
            }
        }

        // Salto de línea estético
        System.out.println();

        // Mostramos el resultado final
        System.out.print("\n--ARRAY MEZCLADO--");
        System.out.print("\nÍNDICE: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("\t %3d", i);
        }
        System.out.println();
        System.out.print("VALOR: \t");
        for (int i = 0; i < 10; i++) {
            System.out.printf("\t %3d", numerosOrdenados[i]);
        }
    }
}
