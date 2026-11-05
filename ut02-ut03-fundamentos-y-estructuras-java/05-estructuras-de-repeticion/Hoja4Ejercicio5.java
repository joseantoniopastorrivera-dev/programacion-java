//Autor: JAPR
//Fecha: 03/01/26
//Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.

//Carpeta a la que pertenece
package Hoja4_Bucles;

//Nombre de la clase
public class Hoja4Ejercicio5 {
    
    //Método main o puerta de entrada
    public static void main(String[] args){

        //Declaramos variable
        int i = 320;

        //Bucle while
        while (i >= 160){
            System.out.println(i);
            i = i -20;
        }
    }
}
