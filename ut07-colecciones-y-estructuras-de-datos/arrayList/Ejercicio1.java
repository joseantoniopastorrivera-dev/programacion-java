//Autor: JAPR
//Fecha: 10/Mar/2026
//Crear y mostrar un ArrayList de palabras

package arrayList;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creamos el ArrayList de tipo String
        ArrayList<String> palabras = new ArrayList<>();
        
        // Añadimos elementos
        palabras.add("Java");
        palabras.add("Examen");
        palabras.add("ArrayList");
        
        // Mostramos el contenido
        System.out.println("Lista de palabras: " + palabras);
    }
}