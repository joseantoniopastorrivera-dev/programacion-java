//Autor: JAPR
//Fecha: 10/Mar/2026
//Ejercicio3, países y capitales

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioPaises {
    public static void main(String[] args) {
        // 1. Crear el diccionario y añadir datos
        HashMap<String, String> paises = new HashMap<>();
        paises.put("España", "Madrid");
        paises.put("Francia", "París");
        paises.put("Italia", "Roma");

        // 2. Pedir país al usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un país: ");
        String paisBuscado = sc.nextLine();

        // 3. Comprobar si existe (Método clave de la UT7: containsKey)
        if (paises.containsKey(paisBuscado)) {
            System.out.println("La capital es " + paises.get(paisBuscado));
        } else {
            System.out.println("Error: El país no está en el diccionario");
        }

        sc.close();
    }
}