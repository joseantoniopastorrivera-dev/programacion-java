/**
 * Clase que representa un pedido realizado por un cliente.
 */
package modelo;
import java.time.LocalDate;
import java.util.ArrayList;


public class Pedido {
    private static int contadorPedidos = 1; // contador estático
    /*
     * Si creas 10 objetos Pedido, todos comparten el mismo contadorPedidos. Es único y común a toda la clase.
     * Se utiliza para generar un código único para cada pedido. PED001, PED002, PED003,...
     */
    private String codigoPedido;
    private Cliente cliente;
    private LocalDate fechaPedido;
    private ArrayList<DetallePedido> detalle;

  

    public Pedido(Cliente cliente, LocalDate fechaPedido) {
        this.cliente = cliente;
        this.fechaPedido = fechaPedido;
        this.codigoPedido = generarCodigoPedido();
        this.detalle = new ArrayList<>();
    }
    private String generarCodigoPedido() {
        String codigo = "PED" + String.format("%04d", contadorPedidos);
        contadorPedidos++;
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public ArrayList<DetallePedido> getDetalle() {
        return detalle;
    }

    public void addDetalle(DetallePedido d) {
        this.detalle.add(d);
    }

    /**
     * Elimina un detalle del pedido que tenga el mismo ID de producto.
     * @param p Producto que se desea eliminar del pedido.
     */

    public void removeDetalle(Producto p) {
        int i = 0;
        boolean eliminado = false;
    
        while (i < detalle.size() && !eliminado) {
            if (detalle.get(i).getProducto().getId() == p.getId()) {
                detalle.remove(i);
                eliminado = true;
            } else {
                i++;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\u001B[36m--- Pedido ").append(codigoPedido).append(" ---\u001B[0m\n");
        sb.append("Cliente: ").append(cliente.getNombre()).append("\n");
        sb.append("Fecha: ").append(fechaPedido).append("\n");
        sb.append("Detalles:\n");

        double total = 0;
        for (DetallePedido d : detalle) {
            sb.append(" - ").append(d).append("\n");
            total += d.getProducto().getPrecio() * d.getUnidades();
        }

        sb.append("TOTAL: ").append(String.format("%.2f EUR", total)).append("\n");
        return sb.toString();
    }
}