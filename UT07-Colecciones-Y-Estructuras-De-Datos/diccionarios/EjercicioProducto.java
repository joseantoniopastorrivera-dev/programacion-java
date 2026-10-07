//Autor: JAPR
//Fecha: 10/Mar/2026
//Ejercicio2, añadir y modificar

import java.util.HashMap;

public class EjercicioProducto {
    public static void main(String[] args) {
        HashMap<String, Object> producto = new HashMap<>();
        
        // 1. Datos iniciales
        producto.put("nombre", "Ratón");
        producto.put("precio", 15.5);
        producto.put("stock", 10);
        System.out.println("Diccionario inicial: " + producto);

        // 2. Añadir nueva clave "marca"
        producto.put("marca", "Logitech");

        // 3. Modificar el precio (Simplemente volvemos a hacer .put con la misma clave)
        producto.put("precio", 18.0);

        // 4. Mostrar final
        System.out.println("Diccionario final: " + producto);
    }
}