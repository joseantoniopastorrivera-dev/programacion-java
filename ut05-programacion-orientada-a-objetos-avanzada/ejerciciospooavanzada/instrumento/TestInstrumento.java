//Autor: JAPR
//Fecha: 14/Feb/2026
//Clase para probar Instrumento.java

import java.util.Scanner;

public class TestInstrumento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---TIENDA DE MÚSICA---");
        Instrumento[] banda = new Instrumento[3];

        banda[0] = new Guitarra("Guitarra1");
        banda[1] = new Flauta("Flauta1");
        banda[2] = new Bateria("Batería1");

        for (int i = 0; i < banda.length; i++) {
            System.out.println("\nTrack " + (i + 1));

            System.out.println(banda[i].toString());

            banda[i].tocar();
        }

        scanner.close();
    }

}
