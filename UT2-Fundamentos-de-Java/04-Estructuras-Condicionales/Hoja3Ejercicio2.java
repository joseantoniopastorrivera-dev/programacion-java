//Autor: JAPR
//Fecha: 02/01/2026
//Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora. 
//Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente.
//Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el Scanner.
import java.util.Scanner;

//Nombre de la clase.
public class Hoja3Ejercicio2 {

    //Método main o puerta de entrada.
    public static void main(String[] args){

        //Activamos el scanner.
        Scanner scanner = new Scanner(System.in);

        //Declaramos la variable hora necesaria.
        int hora;

        //Preguntamos por pantalla la hora que es y la guardamos en hora.
        System.out.println("Indique que hora es(en número), sin minutos ni segundos(ej: 10): ");
        hora = scanner.nextInt();

        //Filtro de seguridad..
        if (hora < 0 || hora > 23){
            System.out.println("Introduzca una hora válida. El rango aceptado es 0 a 23.");
        }
        
        //Es por la mañana.
       else if (hora >= 6 && hora <= 12){
            System.out.println("¡Buenos días por la mañana!");
        }

        //Es por la tarde.
        else if(hora >= 13 && hora <= 20){
            System.out.println("¡Buenas tardes por la tarde!");
        }

        //Es por la noche.
        else {
            System.out.println("¡Buenas noches por la noche!");
        }
        
        //Cerammos el scanner para liberar memoria.
        scanner.close();
    }
}

