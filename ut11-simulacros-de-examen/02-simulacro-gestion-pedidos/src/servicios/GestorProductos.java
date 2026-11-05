/**
 * Clase de utilidad para gestionar productos.
 * Permite añadir productos y mostrar el listado de productos registrados.
 * @author Ruth Lospitao
 * @version 1.0
 */
package servicios;

import excepciones.ValorNoValidoException;
import modelo.Producto;
import utilidades.Utilidades;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Map;

/**
 * Clase de utilidad para gestionar productos: alta, listado,
 * exportación a archivo e importación desde archivo a base de datos MySQL.
 */
public class GestorProductos {

    /**
     * Añade un nuevo producto a la colección si el ID no existe.
     *
     * @param productos Mapa de productos con ID como clave
     */
    public static void anadirProducto(Map<Integer, Producto> productos) {
        int id = Utilidades.pedirNumeroEntero("ID del producto");

        if (productos.containsKey(id)) {
            System.out.println("\u001B[31m Ya existe un producto con ese ID.\u001B[0m");
            return;
        }

        Producto nuevoProducto = crearProductoDesdeConsola(id);
        if (nuevoProducto != null) {
            productos.put(id, nuevoProducto);
            System.out.println("\u001B[32m Producto añadido correctamente.\u001B[0m");
        }
    }

    /**
     * Solicita los datos del producto por consola y crea un nuevo objeto Producto.
     *
     * @param id Identificador único del producto
     * @return Producto creado, o null si hubo un error de validación
     */
    private static Producto crearProductoDesdeConsola(int id) {
        String nombre = Utilidades.pedirString("Nombre");
        double precio = Utilidades.pedirFloat("Precio");
        int stock = Utilidades.pedirNumeroEntero("Stock");

        try {
            return new Producto(nombre, precio, stock, id);
        } catch (ValorNoValidoException e) {
            System.out.println("\u001B[31m Error al crear el producto: " + e.getMessage() + "\u001B[0m");
            return null;
        }
    }

    /**
     * Muestra el listado de productos en consola con formato tabulado.
     *
     * @param productos Mapa de productos con ID como clave
     */
    public static void mostrarProductos(Map<Integer, Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("\u001B[31mNo hay productos registrados.\u001B[0m");
        } else {
            System.out.println("\n\u001B[34m--- LISTADO DE PRODUCTOS ---\u001B[0m");
            System.out.printf("\u001B[1m%-6s %-30s %-10s %-10s\u001B[0m\n", "ID", "Nombre", "Precio", "Stock");
            System.out.println("------------------------------------------------------------------");

            for (Producto p : productos.values()) {
                System.out.printf("%-6d %-30s %-10.2f %-10d\n",
                        p.getId(),
                        p.getNombre(),
                        p.getPrecio(),
                        p.getStock());
            }
        }
    }

    /**
     * Exporta todos los productos a un archivo de texto usando punto y coma como
     * separador.
     *
     * @param productos Mapa de productos a exportar
     */
    public static void exportarProductos(Map<Integer, Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("\u001B[31mNo hay productos para exportar.\u001B[0m");
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter("files\\productos_exportados.txt"))) {
            writer.println("ID;Nombre;Precio;Stock");

            for (Producto p : productos.values()) {
                writer.printf("%d;%s;%.2f;%d\n",
                        p.getId(),
                        p.getNombre(),
                        p.getPrecio(),
                        p.getStock());
            }

            System.out.println("\u001B[32m Productos exportados correctamente a 'files\\productos_exportados.txt'\u001B[0m");

        } catch (IOException e) {
            System.out.println("\u001B[31m Error al escribir el archivo: " + e.getMessage() + "\u001B[0m");
        }
    }

    /**
     * Importa los productos desde un archivo exportado a la base de datos MySQL.
     * Verifica que el archivo exista antes de leerlo.
     *
     * @param archivo Nombre del archivo a importar (debe tener formato con ; como
     *                separador)
     */
    public static void importarProductosABaseDeDatos(String archivo) {
        File file = new File(archivo);

        if (!file.exists()) {
            System.out.println(
                    "\u001B[31m El archivo '" + archivo + "' no existe. Debes exportar productos primero.\u001B[0m");
            return;
        }

        String url = "jdbc:mysql://localhost:3306/tiendaonline";
        String usuario = "root";
        String password = "Password1234";

        String insertSQL = "INSERT INTO productos (id, nombre, precio, stock) " +
                "VALUES (?, ?, ?, ?) " +
                "ON DUPLICATE KEY UPDATE nombre = VALUES(nombre), precio = VALUES(precio), stock = VALUES(stock)";

        try (
                Connection conn = DriverManager.getConnection(url, usuario, password);
                PreparedStatement pstmt = conn.prepareStatement(insertSQL);
                BufferedReader br = new BufferedReader(new FileReader(file));) {
            String linea;
            br.readLine(); // Saltar cabecera

            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty())
                    continue;

                String[] partes = linea.split(";");
                if (partes.length < 4)
                    continue;

                int id = Integer.parseInt(partes[0].trim());
                
                String nombre = partes[1].trim();
                double precio = Double.parseDouble(partes[2].trim().replace(",", "."));
                int stock = Integer.parseInt(partes[3].trim());

                pstmt.setInt(1, id);
                pstmt.setString(2, nombre);
                pstmt.setDouble(3, precio);
                pstmt.setInt(4, stock);
                pstmt.executeUpdate();
            }

            System.out.println("\u001B[32m Productos importados correctamente a la base de datos.\u001B[0m");

        } catch (Exception e) {
            System.out.println("\u001B[31m Error durante la importación: " + e.getMessage() + "\u001B[0m");
        }
    }

}
