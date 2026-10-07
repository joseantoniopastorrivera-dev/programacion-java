//Autor: JAPR
//Fecha: 06/01/26
//Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se muestra a continuación. 
//Muestra el contenido de todos los elementos del array. 
//¿Qué sucede con los valores de los elementos que no han sido inicializados?

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Nombre de la clase
public class Hoja5Ejercicio1 {
    
    //Método main o puerta de entrada
    public static void main(String[] args) {

        //Definimos el array
        int[] num = new int[12];
        //Damos valores
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        System.out.println("Índice\tValor");
        System.out.println("------\t-----");

        for (int i = 0; i < num.length; i++) {
            System.out.println(i + "\t" + num[i]);
        }

    }
}
