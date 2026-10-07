//Autor: JAPR
//Fecha: 06/01/26
//Define un array de 10 caracteres con nombre símbolo y asigna valores a los elementos según la tabla que se muestra a continuación.
//Muestra el contenido de todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Nombre de la clase
public class Hoja5Ejercicio2 {

    //Método main o puerta de entrada
    public static void main(String[] args) {

        //Definimos el array
        char[] array = new char[10];

        array[0] = 'a';
        array[1] = 'x';
        array[4] = '@';
        array[6] = ' ';
        array[7] = '+';
        array[8] ='Q';

        //Imprimimos el resultado
        for (int i = 0; i < array.length; i++){
            System.out.println(i + " " + array[i]);
        }
    }
    
}
