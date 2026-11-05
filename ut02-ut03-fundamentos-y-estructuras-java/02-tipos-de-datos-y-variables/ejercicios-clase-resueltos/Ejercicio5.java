import java.util.Scanner;


//Ejercicio 5: Calcular el precio con IVA
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double IVA = 0.21;

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        double precioFinal = precio + (precio * IVA);
        System.out.printf("El precio final con IVA es: %.2f%n", precioFinal);
        scanner.close();
    }
}
