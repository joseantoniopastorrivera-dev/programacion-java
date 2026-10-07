//Autor: JAPR
//Fecha: 27/01/26
//Carta aleatoria de la baraja francesa (Picas, Corazones, Diamantes, Tréboles)

//Carpeta a la que pertenece
package Hoja6_NumerosAleatorios;

//Nombre de la clase
public class Hoja6Ejercicio2 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Generamos un palo aleatorio del 1 al 4
        System.out.println("--CARTA DE LA BARAJA FRANCESA--");

        int numeroPalo = (int) (Math.random() * 4) + 1;
        String palo = "";

        switch (numeroPalo) {
            case 1:
                palo = "Picas";
                break;
            case 2:
                palo = "Corazones";
                break;
            case 3:
                palo = "Diamantes";
                break;
            case 4:
                palo = "Tréboles";
                break;
        }

        // Generamos una carta del 1 al 13
        int numeroCarta = (int) (Math.random() * 13) + 1;
        String carta = "";

        switch (numeroCarta) {
            case 1:
                carta = "A";
                break;
            case 11:
                carta = "J";
                break;
            case 12:
                carta = "Q";
                break;
            case 13:
                carta = "K";
                break;
            default:
                carta = String.valueOf(numeroCarta);
                break;
        }

        //Mostramos el resultado final
        System.out.println("La carta generada aleatoriamente es " + carta + " de " + palo);
    }
}
