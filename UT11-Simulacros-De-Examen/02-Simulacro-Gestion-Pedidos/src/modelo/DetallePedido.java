package modelo;

/**
 * Clase que representa un detalle de un pedido.
 * Contiene la información del producto y la cantidad solicitada.
 */
public class DetallePedido {
    private Producto producto;
    private int unidades;

    /**
     * Constructor vacío.
     * Requerido por algunas herramientas o frameworks para inicialización por defecto.
     */
    public DetallePedido() {}

    /**
     * Constructor que permite crear un detalle de pedido con producto y unidades.
     *
     * @param producto Producto incluido en el detalle.
     * @param unidades Cantidad de unidades del producto.
     */
    public DetallePedido(Producto producto, int unidades) {
        this.producto = producto;
        this.unidades = unidades;
    }

    /**
     * Obtiene el producto del detalle del pedido.
     *
     * @return Producto incluido en el detalle.
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Establece el producto del detalle del pedido.
     *
     * @param producto Producto a establecer.
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * Obtiene la cantidad de unidades del producto.
     *
     * @return Unidades solicitadas del producto.
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * Establece la cantidad de unidades del producto.
     *
     * @param unidades Número de unidades a establecer.
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * Devuelve una representación en texto del detalle del pedido,
     * indicando nombre del producto, unidades y total en euros.
     *
     * @return Cadena con la descripción del detalle del pedido.
     */
    @Override
    public String toString() {
        return producto.getNombre() + " x" + unidades + " = " + (producto.getPrecio() * unidades) + " EUR";
    }
}
