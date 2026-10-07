/**
 * Clase que gestiona la creación de pedidos en la aplicación.
 * @author Ruth Lospitao
 * @version 1.0
 */
package servicios;

import java.util.Map;
import java.util.ArrayList;
import java.time.LocalDate;
import modelo.*;
import utilidades.Utilidades;

public class GestorPedidos {

    /**
     * Crea un nuevo pedido seleccionando un cliente por su CIF y productos por ID,
     * asegurando disponibilidad de stock y actualizándolo.
     *
     * @param productos Mapa de productos con ID como clave
     * @param clientes  Mapa de clientes con CIF como clave
     * @param pedidos   Lista donde se almacenan todos los pedidos creados
     */
    public static void crearPedido(Map<Integer, Producto> productos, Map<String, Cliente> clientes,
            ArrayList<Pedido> pedidos) {
        if (clientes.isEmpty() || productos.isEmpty()) {
            System.out.println("Debe haber al menos un cliente y un producto para crear un pedido.");
            return;
        }

        mostrarClientes(clientes);
        Cliente cliente = seleccionarCliente(clientes);
        Pedido pedido = new Pedido(cliente, LocalDate.now());

        String seguir;
        do {
            mostrarProductos(productos);
            Producto producto = seleccionarProducto(productos);
            int unidades = pedirUnidades(producto);

            pedido.addDetalle(new DetallePedido(producto, unidades));
            producto.setStock(producto.getStock() - unidades);

            seguir = Utilidades.pedirString("¿Desea añadir otro producto? (s/n)");
        } while (seguir.equalsIgnoreCase("s"));

        pedidos.add(pedido);
        System.out.println("\u001B[32mPedido creado correctamente.\u001B[0m");
    }

    /**
     * Muestra todos los clientes registrados en el sistema con su nombre y CIF.
     *
     * @param clientes Mapa de clientes con CIF como clave
     */
    private static void mostrarClientes(Map<String, Cliente> clientes) {
        System.out.println("\n\u001B[34m--- CLIENTES DISPONIBLES ---\u001B[0m");
        for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
            System.out.println(" - " + entry.getValue().getNombre() + " (CIF: " + entry.getKey() + ")");
        }
    }

    /**
     * Solicita al usuario un CIF válido y devuelve el cliente correspondiente.
     *
     * @param clientes Mapa de clientes con CIF como clave
     * @return Cliente seleccionado
     */
    private static Cliente seleccionarCliente(Map<String, Cliente> clientes) {
        Cliente cliente = null;
        do {
            String cif = Utilidades.pedirString("Introduce el CIF del cliente").toUpperCase();
            cliente = clientes.get(cif);
            if (cliente == null) {
                System.out.println("\u001B[31m CIF no encontrado. Intenta de nuevo.\u001B[0m");
            }
        } while (cliente == null);
        return cliente;
    }

    /**
     * Muestra los productos disponibles en formato tabular, destacando en rojo los
     * productos sin stock.
     *
     * @param productos Mapa de productos con ID como clave
     */
    private static void mostrarProductos(Map<Integer, Producto> productos) {
        System.out.println("\n\u001B[34m--- PRODUCTOS DISPONIBLES ---\u001B[0m");
        System.out.printf("\u001B[1m%-10s %-25s %-10s %-10s\u001B[0m\n", "ID", "Nombre", "Precio", "Stock");
        System.out.println("----------------------------------------------------------");

        for (Map.Entry<Integer, Producto> entry : productos.entrySet()) {
            Producto p = entry.getValue();
            String color = p.getStock() == 0 ? "\u001B[31m" : "";
            String reset = "\u001B[0m";
            System.out.printf(color + "%-10d %-25s %-10.2f %-10d" + reset + "\n",
                    p.getId(),
                    p.getNombre(),
                    p.getPrecio(),
                    p.getStock());
        }
    }

    /**
     * Solicita al usuario un ID de producto válido que tenga stock.
     *
     * @param productos Mapa de productos con ID como clave
     * @return Producto seleccionado
     */
    private static Producto seleccionarProducto(Map<Integer, Producto> productos) {
        Producto producto = null;
        do {
            int id = Utilidades.pedirNumeroEntero("Introduce el ID del producto");
            producto = productos.get(id);
            if (producto == null) {
                System.out.println("\u001B[31m No existe un producto con ese ID.\u001B[0m");
            } else if (producto.getStock() == 0) {
                System.out.println("\u001B[31m Este producto no tiene stock disponible. Selecciona otro.\u001B[0m");
                producto = null;
            }
        } while (producto == null);
        return producto;
    }

    /**
     * Solicita al usuario un número de unidades no superior al stock disponible.
     *
     * @param producto Producto del cual se quieren añadir unidades al pedido
     * @return Número de unidades válidas
     */
    private static int pedirUnidades(Producto producto) {
        int unidades;
        do {
            unidades = Utilidades
                    .pedirNumeroEntero("Unidades del producto (stock disponible: " + producto.getStock() + ")");
            if (unidades > producto.getStock()) {
                System.out.println("\u001B[31m No hay suficiente stock. Intenta con un número menor o igual a "
                        + producto.getStock() + ".\u001B[0m");
            }
        } while (unidades > producto.getStock());
        return unidades;
    }

    /**
     * Muestra todos los pedidos registrados en la aplicación.
     *
     * @param pedidos Lista de pedidos realizados
     */
    public static void mostrarPedidos(ArrayList<Pedido> pedidos) {
        if (pedidos.isEmpty()) {
            System.out.println("\u001B[31mNo hay pedidos registrados.\u001B[0m");
        } else {
            System.out.println("\n\u001B[34m--- LISTADO DE PEDIDOS ---\u001B[0m");
            for (Pedido p : pedidos) {
                System.out.println(p);
            }
        }
    }

}
