//Ejercicio 14: Declarar variables y constantes siguiendo buenas prácticas

public class Ejercicio14 {
    public static void main(String[] args) {
        String nombreProducto = "Ordenador";
        final int VALOR_MAXIMO = 100;
        double precioProducto = 999.99;
        int stockDisponible = 20;

        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Valor máximo permitido: " + VALOR_MAXIMO);
        System.out.println("Precio del producto: " + precioProducto);
        System.out.println("Stock disponible: " + stockDisponible);
    }
}