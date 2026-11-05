//Autor: JAPR
//Fecha: 10/Mar/2026
//RegistroDNI.java

package reto_mapas_dni;

import java.util.HashMap;

public class RegistroDNI {
    public static void main(String[] args) {
        // HashMap<Clave, Valor>
        HashMap<String, String> registro = new HashMap<>();

        // Insertar datos con .put()
        registro.put("12345678A", "JAPR");
        registro.put("87654321B", "Ana");

        // Intentamos meter el mismo DNI con otro nombre
        // El PDF dice: "Si la clave ya existiera, sobrescribe el anterior valor"
        registro.put("12345678A", "JAPR_Actualizado");

        System.out.println("¿Está el DNI 12345678A? " + registro.containsKey("12345678A"));
        
        // Recorrer el mapa para ver las claves (DNI) y valores (Nombre)
        for (String dni : registro.keySet()) {
            System.out.println("DNI: " + dni + " -> Nombre: " + registro.get(dni));
        }
    }
}
