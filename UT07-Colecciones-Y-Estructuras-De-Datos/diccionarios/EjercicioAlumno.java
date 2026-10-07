//Autor: JAPR
//Fecha: 10/Mar/2026
//Ejercicio1, información de un alumno

import java.util.HashMap;

public class EjercicioAlumno {
    public static void main(String[] args) {
        // En Java, el diccionario es un HashMap
        // Usamos <String, Object> para que el valor pueda ser texto o número
        HashMap<String, Object> alumno = new HashMap<>();

        // Guardamos los datos (.put)
        alumno.put("nombre", "Lucía");
        alumno.put("edad", 17);
        alumno.put("curso", "1DAM");

        // Mostramos el diccionario completo
        System.out.println("Diccionario completo: " + alumno);

        // Mostramos datos específicos (.get)
        System.out.println("Nombre: " + alumno.get("nombre"));
        System.out.println("Edad: " + alumno.get("edad"));
    }
}