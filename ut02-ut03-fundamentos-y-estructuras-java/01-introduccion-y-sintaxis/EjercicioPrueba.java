//Autor: JAPR
//Fecha: 18/12/25
//Este ejercicio es una prueba para ver si funciona el entorno de desarrollo creado para JAVA


//Carpeta a la que pertenece
package Hoja0_EjerciciosBasicos;

import java.util.Scanner; 

public class EjercicioPrueba { 

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;

        System.out.println("Introduce el primer número:");
        numero1 = scanner.nextDouble(); 

        System.out.println("Introduce el segundo número:");
        numero2 = scanner.nextDouble();

        resultado = numero1 + numero2;

        System.out.println("La suma es: " + resultado);
        
        scanner.close();
    }
}