//Autor: JAPR
//Fecha: 03/01/26
//Escribe un programa que dada una hora determinada (horas y minutos), 
//calcule los segundos que faltan para llegar a la medianoche.

//Carpeta a la que pertenece
package Hoja3_EstructurasSelectivas;

//Importamos el scanner.
import java.util.Scanner;

//Nombre de la clase
public class Hoja3Ejercicio11 {
    
    //Método main o puerta de entrada.
    public static void main(String[] args){

//Activamos el scanner
Scanner scanner = new Scanner(System.in);

//Declaramos las variables necesarias.
int hora, min, seg;

//Preguntamos por la hora.
System.out.println("Introduzca la hora(0 - 23): ");
hora = scanner.nextInt();

//Preguntamos los minutos.
System.out.println("Introduzca los minutos(0 - 60):");
min = scanner.nextInt();

//Verificamos que el rango de hora y minutos es válido.
if(hora < 0 || hora > 23 || min < 0 || min > 59){
    System.out.println("ERROR: Introduzca un valor de hora y minutos válido.");
}else{
seg = ((23 - hora) * 3600) + ((60 - min) * 60);
System.out.printf("Faltan %d segundos para la medianoche.", seg);
    }

//Cerramos el scanner para liberar memoria.
scanner.close();

    }
}
