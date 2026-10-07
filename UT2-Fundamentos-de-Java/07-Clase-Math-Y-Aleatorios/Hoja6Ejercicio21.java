//Realiza un programa que genere una secuencia de cinco monedas de curso legal lanzadas al aire. 
// Las monedas disponibles son de 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros.
// Las dos posiciones posibles son cara y cruz.// //Ejemplo:
//2 céntimos - cara
//20 céntimos - cruz
//50 céntimos - cruz
//1 euro - cruz
//2 euros - cara

package Hoja6_NumerosAleatorios;

public class Hoja6Ejercicio21 {

    public static void main(String[] args) {

        String monedas[] = { "1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos",
                "1 euro", "2 euros" };
                String caraCruz[] = {"cara", "cruz"};

        for (int i = 0; i < 5; i++) {
            int monedaRandom = (int) (Math.random() * 8);
            int tiradaCaraCruz = (int) (Math.random() * 2);
            System.out.println("Tirada " + (i + 1) + ": " + monedas[monedaRandom] + " - " + caraCruz[tiradaCaraCruz]);

        }
    }
}