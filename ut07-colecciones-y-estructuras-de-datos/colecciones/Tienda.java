//Autor: JAPR
//Fecha: 10/Mar/2026
//Ejercicio 3, Tienda de productos

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Tienda {
    public static void main(String[] args) {
        ArrayList<Map<String, Object>> productos = new ArrayList<>();

        // Añadir 4 productos
        productos.add(crearProducto("Raton", 15.0, 10));
        productos.add(crearProducto("Teclado", 25.0, 3));
        productos.add(crearProducto("Monitor", 150.0, 2));
        productos.add(crearProducto("Alfombrilla", 5.0, 20));

        // 5. Buscar productos con stock < 5
        System.out.println("Productos con stock bajo (<5):");
        double precioMax = -1;
        String nombreCaro = "";

        for (Map<String, Object> p : productos) {
            int stock = (int) p.get("stock");
            double precio = (double) p.get("precio");

            if (stock < 5) {
                System.out.println("- " + p.get("nombre") + " (Stock: " + stock + ")");
            }

            // Lógica para el más caro
            if (precio > precioMax) {
                precioMax = precio;
                nombreCaro = (String) p.get("nombre");
            }
        }

        // 6. Mostrar el más caro
        System.out.println("\nEl producto más caro es: " + nombreCaro + " (" + precioMax + "€)");
    }

    // Método auxiliar para no repetir código de creación
    private static Map<String, Object> crearProducto(String nombre, double precio, int stock) {
        Map<String, Object> p = new HashMap<>();
        p.put("nombre", nombre);
        p.put("precio", precio);
        p.put("stock", stock);
        return p;
    }
}