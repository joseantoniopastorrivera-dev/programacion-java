//Autor: JAPR
//Fecha: 30/01/26
//Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8. 
// Escribe un programa que genere de forma aleatoria la tirada de cinco dados.

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio23 {

    public static void main(String[] args) {

        String dado[] = { "As", "K", "Q", "J", "7", "8" };
        
        for(int i = 0; i < 5; i++){
            int indiceDado = (int) (Math.random() * 6);
            System.out.print(dado[indiceDado] + " ");
        }
    }
}
