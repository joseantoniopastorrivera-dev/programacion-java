//Autor: JAPR
//Fecha: 10/Mar/2026
//Ejercicio1, Lista de Alumnos

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaAlumnos {
    public static void main(String[] args) {
        // 1. Crear el ArrayList que almacenará Mapas (alumnos)
        ArrayList<Map<String, Object>> listaAlumnos = new ArrayList<>();

        // 2. Añadir 3 alumnos (cada uno es un Map)
        Map<String, Object> alumno1 = new HashMap<>();
        alumno1.put("nombre", "Juan");
        alumno1.put("edad", 20);
        alumno1.put("curso", "1DAM");
        listaAlumnos.add(alumno1);

        Map<String, Object> alumno2 = new HashMap<>();
        alumno2.put("nombre", "Maria");
        alumno2.put("edad", 22);
        alumno2.put("curso", "2DAM");
        listaAlumnos.add(alumno2);

        Map<String, Object> alumno3 = new HashMap<>();
        alumno3.put("nombre", "Pedro");
        alumno3.put("edad", 19);
        alumno3.put("curso", "1DAM");
        listaAlumnos.add(alumno3);

        // 3. Mostrar todos los alumnos completos
        System.out.println("Todos los alumnos: " + listaAlumnos);

        // 4. Mostrar solo nombre y curso de cada uno
        System.out.println("\nListado resumido:");
        for (Map<String, Object> al : listaAlumnos) {
            System.out.println("Nombre: " + al.get("nombre") + " | Curso: " + al.get("curso"));
        }
    }
}