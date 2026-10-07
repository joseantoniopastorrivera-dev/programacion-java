//Autor: JAPR
//Fecha: 03/01/26
//Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle do-while.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Nombre de la clase
public class Hoja4Ejercicio6 {

    //Método main o puerta de entrada
    public static void main(String[] args){

          //Declaramos las variables necesarias
          int i = 320;

          //Bucle do-while
          do {
            System.out.println(i);
            i = i - 20;
          } while (i >= 160);
    }
}
