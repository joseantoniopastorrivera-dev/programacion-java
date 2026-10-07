/**
 * Clase que representa un producto en una tienda online.
 * Incluye validaciones y manejo de excepciones personalizadas.
 */
package modelo;

import excepciones.ValorNoValidoException;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private int id;

    /**
     * Constructor de la clase Producto.
     *
     * @param nombre Nombre del producto.
     * @param precio Precio del producto. No puede ser negativo.
     * @param stock  Cantidad disponible del producto. No puede ser negativa.
     * @param id     Identificador único del producto.
     * @throws ValorNoValidoException si el precio o el stock son negativos.
     */
    public Producto(String nombre, double precio, int stock, int id) throws ValorNoValidoException {
        if (precio < 0) {
            throw new ValorNoValidoException("El precio no puede ser negativo.");
        }
        if (stock < 0) {
            throw new ValorNoValidoException("El stock no puede ser negativo.");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.id = id;
    }

    /**
     * Devuelve el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre Nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return Precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio Precio a asignar.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el stock disponible del producto.
     *
     * @return Stock disponible.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock del producto.
     *
     * @param stock Stock a asignar.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Devuelve el identificador único del producto.
     *
     * @return ID del producto.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del producto.
     *
     * @param id ID a asignar.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Aumenta el stock del producto.
     *
     * @param cantidad Cantidad a añadir al stock.
     * @throws ValorNoValidoException si la cantidad es negativa.
     */
    public void reponerStock(int cantidad) throws ValorNoValidoException {
        if (cantidad < 0) {
            throw new ValorNoValidoException("No se puede reponer una cantidad negativa.");
        }
        this.stock += cantidad;
    }

    /**
     * Disminuye el stock del producto al realizar una venta.
     *
     * @param cantidad Cantidad a vender.
     * @throws ValorNoValidoException si la cantidad es negativa o supera el stock disponible.
     */
    public void vender(int cantidad) throws ValorNoValidoException {
        if (cantidad < 0) {
            throw new ValorNoValidoException("La cantidad a vender debe ser positiva.");
        }
        if (cantidad > stock) {
            throw new ValorNoValidoException("No hay suficiente stock para la venta.");
        }
        this.stock -= cantidad;
    }

    /**
     * Muestra la información del producto en formato tabulado con colores ANSI.
     */
    public void mostrarInformacionTabulada() {
        final String RESET = "\u001B[0m";
        final String AZUL = "\u001B[34m";
        final String VERDE = "\u001B[32m";

        System.out.printf(AZUL + "%-10s %-20s %-10s %-10s\n" + RESET, "Id", "Nombre", "Precio", "Stock");
        System.out.printf(VERDE + "%-10d %-20s %-10.2f %-10d\n" + RESET, id, nombre, precio, stock);
    }
}
