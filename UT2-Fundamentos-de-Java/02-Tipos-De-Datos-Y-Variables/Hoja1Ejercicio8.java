//Autor: JAPR
//Fecha: 28/12/25
//Escribe un programa que declare 5 variables de tipo char. 
//A continuación, crea otra variable como cadena de caracteres y 
//asígnale como valor la concatenación de las anteriores 5 variables. 
//Por último, muestra la cadena de caracteres por pantalla.

//Carpeta a la que pertenece
package Hoja1_Variables;

//Nombre de la clase
public class Hoja1Ejercicio8 {

    //Método main o puerta de entrada.
    public static void main(String[] args){

        //Declaramos 5 variables tipo char.
        char l1 = 's';
        char l2 = 'a';
        char l3 = 'l';
        char l4 = 'u';
        char l5 = 'd';
        String palabra = "" + l1 +l2 +l3 + l4 + l5;

        //Imprimimos el resultado por pantalla con println.
        System.out.println("" + palabra);

        //Imprimimos ahora por pantalla usando printf.
        System.out.printf("%s",palabra);
    }
    
}
