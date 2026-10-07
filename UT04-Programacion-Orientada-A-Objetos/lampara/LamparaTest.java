//Autor: JAPR
//Fecha: 05/Feb/2026
//Clase LamparaTest.java

package lampara;

public class LamparaTest {

    public static void main(String[] args) {

        // Creamos la lámpara
        System.out.println("---CREAMOS LA LÁMPARA---");
        Lampara lampara1 = new Lampara();

        // La imprimimos usando el toString. Debería estar apagada y con intensidad 0
        System.out.println(lampara1);

        // Encenderla y poner la intensidad de forma manual
        System.out.println("\n--PRUEBA MANUAL--");
        lampara1.setEncendida(true);
        lampara1.setIntensidad(50);
        System.out.println("\nLa ponemos en funcionamiento: ");
        System.out.println(lampara1);

        // Probamos el método del voltaje
        System.out.println("\n--PRUEBA DEL VOLTAJE--");
        lampara1.setIntensidad(1.0);
        System.out.println("Con 1.0V: " + lampara1);
        lampara1.setIntensidad(13.0);
        System.out.println("Con 13.0V: " + lampara1);
        lampara1.setIntensidad(7.0);
        System.out.println("Con 7.0V: " + lampara1);

    }
}
