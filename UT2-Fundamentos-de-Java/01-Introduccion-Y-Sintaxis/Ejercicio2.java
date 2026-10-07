//Autor: JAPR
//Fecha: 18/12/25
//Este programa calcula la media de cuatro notas. Todas las notas ponderan lo mismo.

//Carpeta a la que pertenece
package Hoja0_EjerciciosBasicos;

//Importamos scanner.
import java.util.Scanner;

//El archivo se llama Ejercicio2.
public class Ejercicio2 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        // Declaramos las variables necesarias con double para que admita decimales.
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double mediaNota;

        // Pedimos la primera nota y la guardamos en su variable correspondiente con
        // scanner.
        System.out.println(
                "Este programa calcula la media entre cuatro notas dadas por el usuario. Introduzca la primera nota: ");
        nota1 = scanner.nextDouble();

        // Pedimos segunda nota y la guardamos en su variable correspondiente con
        // scanner.
        System.out.println("Introduzca la segunda nota: ");
        nota2 = scanner.nextDouble();

        // Pedimos la tercera nota y la guardamos en su variable correspondiente con
        // scanner.
        System.out.println("Introduzca la tercera nota: ");
        nota3 = scanner.nextDouble();

        // Pedimos la cuarta nota y la guardamos en su variable correspondiente con
        // scanner.
        System.out.println("Introduzca la cuarta nota: ");
        nota4 = scanner.nextDouble();

        // Calculamos la media de las cuatro notas.
        mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;

        // Imprimimos el resultado por pantalla.
        System.out.println("La media de las cuatro notas es: " + mediaNota);

        // Apagamos el scanner para liberar memoria.
        scanner.close();

    }
}
