//Autor: JAPR
//Fecha: 01/02/27
//Realiza un programa que muestre la previsión del tiempo para mañana en Málaga.
//  Las temperaturas máxima y mínima se deben generar de forma aleatoria entre los intervalos máximos y mínimos absolutos
//  medidos en las últimas décadas para cada estación. 
// La probabilidad de que esté soleado o nublado en cada estación se proporciona a continuación. 
// Obviamente, la temperatura mínima deberá ser menor o igual que la temperatura máxima

package Hoja6_NumerosAleatorios;

import java.util.Scanner;

public class Hoja6Ejercicio29 {

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
                if (temperaturaPrimavera1 < temperaturaPrimavera2) {
                    min = temperaturaPrimavera1;
                    max = temperaturaPrimavera2;
                } else {
                    min = temperaturaPrimavera2;
                    max = temperaturaPrimavera1;
                }
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
                if (temperaturaVerano1 < temperaturaVerano2) {
                    min = temperaturaVerano1;
                    max = temperaturaVerano2;
                } else {
                    min = temperaturaVerano2;
                    max = temperaturaVerano1;
                }
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
                if (temperaturaOtoño1 < temperaturaOtoño2) {
                    min = temperaturaOtoño1;
                    max = temperaturaOtoño2;
                } else {
                    min = temperaturaOtoño2;
                    max = temperaturaOtoño1;
                }
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
                if (temperaturaInvierno1 < temperaturaInvierno2) {
                    min = temperaturaInvierno1;
                    max = temperaturaInvierno2;
                } else {
                    min = temperaturaInvierno2;
                    max = temperaturaInvierno1;
                }
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