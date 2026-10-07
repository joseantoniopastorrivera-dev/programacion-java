//Autor: JAPR
//Fecha: 30/01/26
//Realiza un programa que muestre la previsión del tiempo para mañana en Málaga.
//  Las temperaturas máxima y mínima se deben generar de forma aleatoria entre los intervalos máximos y mínimos absolutos
//  medidos en las últimas décadas para cada estación. 
// La probabilidad de que esté soleado o nublado en cada estación se proporciona a continuación. 
// Obviamente, la temperatura mínima deberá ser menor o igual que la temperatura máxima

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio29Mejorado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String soleadoNublado[] = new String[10];
        int indiceSoleadoNublado = (int) (Math.random() * 10);
        int estacion;
        int max = 0;
        int min = 0;

        do {
            System.out.println("Seleccione la estación del año: ");
            System.out.print("1.Primavera.\n2.Verano.\n3.Otoño.\n4.Invierno.\n");
            estacion = scanner.nextInt();
        } while (estacion != 1 && estacion != 2 && estacion != 3 && estacion != 4);

        switch (estacion) {

            case 1:
                int temperaturaPrimavera1 = (int) (Math.random() * (30 - 15 + 1) + 15);
                int temperaturaPrimavera2 = (int) (Math.random() * (30 - 15 + 1) + 15);
               min = Math.min(temperaturaPrimavera1, temperaturaPrimavera2);
               max = Math.max(temperaturaPrimavera1, temperaturaPrimavera2);
                for (int i = 0; i < 6; i++) {
                    soleadoNublado[i] = "Soleado";
                }
                for (int i = 6; i < 10; i++) {
                    soleadoNublado[i] = "Nublado";
                }
                break;

            case 2:
                int temperaturaVerano1 = (int) (Math.random() * (45 - 25 + 1) + 25);
                int temperaturaVerano2 = (int) (Math.random() * (45 - 25 + 1) + 25);
                min = Math.min(temperaturaVerano1, temperaturaVerano2);
                max = Math.max(temperaturaVerano1, temperaturaVerano2);
                for (int i = 0; i < 8; i++) {
                    soleadoNublado[i] = "Soleado";
                }
                for (int i = 8; i < 10; i++) {
                    soleadoNublado[i] = "Nublado";
                }
                break;
            case 3:
                int temperaturaOtoño1 = (int) (Math.random() * (30 - 20 + 1) + 20);
                int temperaturaOtoño2 = (int) (Math.random() * (30 - 20 + 1) + 20);
                min = Math.min(temperaturaOtoño1, temperaturaOtoño2);
                max = Math.max(temperaturaOtoño1, temperaturaOtoño2);
                for (int i = 0; i < 4; i++) {
                    soleadoNublado[i] = "Soleado";
                }
                for (int i = 4; i < 10; i++) {
                    soleadoNublado[i] = "Nublado";
                }
                break;
            case 4:
                int temperaturaInvierno1 = (int) (Math.random() * (25 - 0 + 1));
                int temperaturaInvierno2 = (int) (Math.random() * (25 - 0 + 1));
                min = Math.min(temperaturaInvierno1, temperaturaInvierno2);
                max = Math.max(temperaturaInvierno1, temperaturaInvierno2);
                for (int i = 0; i < 2; i++) {
                    soleadoNublado[i] = "Soleado";
                }
                for (int i = 2; i < 10; i++) {
                    soleadoNublado[i] = "Nublado";
                }
                break;

        }
        System.out.println("Previsión del tiempo para mañana\n--------------------------------");
        System.out.println("Temperatura mínima: " + min + " ºC");
        System.out.println("Temperatura máxima: " + max + " ºC");
        System.out.println(soleadoNublado[indiceSoleadoNublado]);

        scanner.close();
    }
}