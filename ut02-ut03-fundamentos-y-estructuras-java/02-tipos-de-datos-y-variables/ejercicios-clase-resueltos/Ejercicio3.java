//Ejercicio 3: Leer datos con BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Escriba su edad: ");
        int edad = Integer.parseInt(reader.readLine());

        System.out.print("Escriba su altura (en metros): ");
        double altura = Double.parseDouble(reader.readLine());

        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = Boolean.parseBoolean(reader.readLine());

        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Es estudiante: " + esEstudiante);
    }
}
