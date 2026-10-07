//Autor: JAPR
//Fecha: 10/Mar/2026
//Uso de Iterador.java

package reto_iterador;

import java.util.ArrayList;
import java.util.Iterator;

public class PruebaIterator {
    public static void main(String[] args) {
        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("PHP");
        lenguajes.add("Python");
        lenguajes.add("C++");

        // Creamos el objeto iterador sobre la colección
        Iterator<String> it = lenguajes.iterator();

        System.out.println("Lista original: " + lenguajes);

        while (it.hasNext()) {
            String lenguaje = it.next(); // Obtenemos el siguiente
            if (lenguaje.equals("PHP")) {
                it.remove(); // Borra el elemento actual de la lista de forma segura
            }
        }

        System.out.println("Lista final (sin PHP): " + lenguajes);
    }
}
