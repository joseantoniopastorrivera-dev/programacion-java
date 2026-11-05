//Ejercicio 7: Calcular el promedio de tres números
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        double promedio = (a + b + c) / 3;
        System.out.println("El promedio es: " + promedio);
        scanner.close();
    }
}
