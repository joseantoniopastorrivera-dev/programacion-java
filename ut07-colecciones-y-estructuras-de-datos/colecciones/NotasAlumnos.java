//Autor: JAPR
//Fecha: 10/Mar/2026
//Ejercicio 2, asignaturas y notas

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class NotasAlumnos {
    public static void main(String[] args) {
        // Diccionario: Nombre (String) -> Lista de notas (ArrayList<Integer>)
        HashMap<String, ArrayList<Integer>> registroNotas = new HashMap<>();

        // Añadir alumnos y sus notas
        ArrayList<Integer> notasJuan = new ArrayList<>();
        notasJuan.add(8); notasJuan.add(7); notasJuan.add(9);
        registroNotas.put("Juan", notasJuan);

        ArrayList<Integer> notasAna = new ArrayList<>();
        notasAna.add(5); notasAna.add(6); notasAna.add(4);
        registroNotas.put("Ana", notasAna);

        ArrayList<Integer> notasLuis = new ArrayList<>();
        notasLuis.add(10); notasLuis.add(9); notasLuis.add(10);
        registroNotas.put("Luis", notasLuis);

        // Mostrar resultados y media
        for (String nombre : registroNotas.keySet()) {
            ArrayList<Integer> notas = registroNotas.get(nombre);
            double suma = 0;
            for (int n : notas) suma += n;
            double media = suma / notas.size();

            System.out.println("Alumno: " + nombre);
            System.out.println("- Notas: " + notas);
            System.out.printf("- Media: %.2f\n\n", media);
        }
    }
}