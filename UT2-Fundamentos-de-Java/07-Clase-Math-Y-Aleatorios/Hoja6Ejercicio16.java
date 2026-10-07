//Autor: JAPR
//Fecha: 29/01/26
//Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
//a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles:
// corazón, diamante, herradura, campana y limón.
//b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
//c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
//d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
//Ejemplo 1:
//diamante diamante limón
//Bien, ha recuperado su moneda
//Ejemplo 2:
//herradura campana diamante
//Lo siento, ha perdido
//Ejemplo 3:
//corazón corazón corazón
//Enhorabuena, ha ganado 10 monedas

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio16 {

    public static void main(String[] args) {

        String tirada[] = { "corazón", "diamante", "herradura", "campana", "limón" };
        int monedas = 1;
        int tiradasAux[] = new int[3];
        int contadorTiradas = 1;

        do {
            System.out.println("--TIRADA " + contadorTiradas + "--");
            contadorTiradas++;
            monedas--;
            for (int i = 0; i < 3; i++) {
                int numTirada = (int) (Math.random() * 5);
                System.out.print(tirada[numTirada] + " ");
                tiradasAux[i] = numTirada;
            }
             System.out.println();
            if (tiradasAux[0] == tiradasAux[1] && tiradasAux[1] == tiradasAux[2]) {
                monedas += 10;
                System.out.println(
                        "Enhorabuena, ha ganado 10 monedas y ahora tiene un total de: " + monedas + " monedas.");
            } else if (tiradasAux[0] == tiradasAux[1] || tiradasAux[0] == tiradasAux[2] || tiradasAux[1] == tiradasAux[2]) {
                monedas++;
                System.out.println("Bien, ha recuperado su moneda y ahora tiene un total de: " + monedas + " monedas.");
            } else {
                System.out.println("Lo siento, ha perdido y ahora tiene un total de: " + monedas + " monedas.");
            }
        } while (monedas > 0);
    }
}
