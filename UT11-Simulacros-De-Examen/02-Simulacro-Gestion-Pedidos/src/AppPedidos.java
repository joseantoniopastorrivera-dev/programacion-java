
/**
 * Clase principal que contiene el menú para gestionar productos, clientes y pedidos.
 * Utiliza colecciones Map para evitar duplicidades y simplificar búsquedas por clave.
 * @author Ruth Lospitao
 * @version 1.0
 */
import modelo.*;
import servicios.*;
import utilidades.Utilidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase principal que contiene el menú para gestionar productos, clientes y
 * pedidos.
 */
public class AppPedidos {
    /**
     * Opción del menú que indica la salida del programa.
     */
    public final static int OPCION_SALIR = 8;

    /**
     * Método principal del programa. Muestra el menú y ejecuta las acciones
     * seleccionadas.
     *
     * @param args Argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {

       
        /*
         * Mapa de productos, usando el ID del producto como clave.
         * Permite evitar duplicados y acceder rápidamente a un producto por su ID.
         */
        Map<Integer, Producto> productos = new HashMap<>();
        /*
         * Mapa de clientes, usando el CIF del cliente como clave.
         * Permite evitar duplicados y acceder rápidamente a un cliente por su CIF.
         */
        Map<String, Cliente> clientes = new HashMap<>();

        ArrayList<Pedido> pedidos = new ArrayList<>(); //acceso a los pedidos se hace de forma secuencial y no se requiere una clave para acceder directamente a un pedido concreto
        
        int opcion;

        do {
            mostrarMenu();
            opcion = Utilidades.leerNumeroEntero(1, OPCION_SALIR);
            switch (opcion) {
                case 1:
                    GestorProductos.anadirProducto(productos);
                    break;
                case 2:
                    GestorClientes.anadirCliente(clientes);
                    break;
                case 3:
                    GestorPedidos.crearPedido(productos, clientes, pedidos);
                    break;
                case 4:
                    GestorPedidos.mostrarPedidos(pedidos);
                    break;
                case 5:
                    GestorProductos.mostrarProductos(productos);
                    break;
                case 6:
                    GestorProductos.exportarProductos(productos);
                    break;
                case 7:
                    GestorProductos.importarProductosABaseDeDatos("files\\productos_exportados.txt");
                    break;
                case OPCION_SALIR:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != OPCION_SALIR);
    }

    private static void mostrarMenu() {
        System.out.println("\n--- MENÚ GESTIÓN PEDIDOS ---");
        System.out.println("1. Añadir producto");
        System.out.println("2. Añadir cliente");
        System.out.println("3. Crear pedido");
        System.out.println("4. Mostrar pedidos");
        System.out.println("5. Mostrar productos");
        System.out.println("6. Exportar productos a fichero txt");
        System.out.println("7. Cargar inventario de productos en la base de datos");
        System.out.println("8. Salir");
        System.out.print("Escriba opción (1 a " + OPCION_SALIR + " ): ");
    }
}
