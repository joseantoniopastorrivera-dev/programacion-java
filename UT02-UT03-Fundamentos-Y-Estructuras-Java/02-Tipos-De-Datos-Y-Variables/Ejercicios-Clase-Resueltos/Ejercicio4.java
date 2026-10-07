//Ejercicio 4: Leer datos con Scanner
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Escriba su altura (en metros): ");
        double altura = scanner.nextDouble();

        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();

        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Es estudiante: " + esEstudiante);
        scanner.close();
    }
}
