//Autor: JAPR
//Fecha: 27/01/26
//Genera una carta aleatoria de la baraja española

//Carpeta a la que pertenece
package Hoja6_NumerosAleatorios;

//Nombre de la clase
public class Hoja6Ejercicio3 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        // Generamos un palo aleatorio entre 1 al 4
        int numeroPalo = (int) (Math.random() * 4) + 1;
        String palo = "";

        switch (numeroPalo) {
            case 1:
                palo = "Oros";
                break;
            case 2:
                palo = "Bastos";
                break;
            case 3:
                palo = "Espadas";
                break;
            case 4:
                palo = "Copas";
                break;
        }

        // Generamos una carta aleatoria entre 1 a 10
        int numeroCarta = (int) (Math.random() * 10) + 1;
        String carta = "";

        switch (numeroCarta) {
            case 1:
                carta = "As";
                break;
            case 8:
                carta = "Sota";
                break;
            case 9:
                carta = "Caballo";
                break;
            case 10:
                carta = "Rey";
                break;
            default:
                carta = String.valueOf(numeroCarta);
                break;
        }

        //Mostramos el resultado por pantalla
        System.out.println(carta + " de " + palo);
    }
}
