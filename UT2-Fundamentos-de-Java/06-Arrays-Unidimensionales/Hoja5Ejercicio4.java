//Autor: JAPR
//Fecha: 06/01/26
//Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo. Carga el array numero con valores aleatorios
//entre 0 y 100. En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero. 
//En el array cubo se deben almacenar los cubos de los valores que hay en numero. 
//A continuación, muestra el contenido de los tres arrays dispuesto en tres columnas.

//Carpeta a la que pertenece
package Hoja5_Arrays;

//Nombre de la clase
public class Hoja5Ejercicio4 {

    // Método main o puerta de entrada
    public static void main(String[] args) {

        //Definimos los arrays
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];

        //Bucle de carga y calculo
        for(int i = 0; i < 20; i++) {

            //Generamos los números aleatorios entre 0 y 100
            numero[i] = (int)(Math.random() * 101);
            
            //Calculamos el cuadrado
            cuadrado[i] = numero[i] * numero[i];

            //Calculamos el cubo
            cubo[i] = numero[i] * numero[i] * numero[i];

        }

        //Mostramos el resultado
            System.out.println("Número\tCuadrado\tCubo");
            System.out.println("------\t--------\t----");

            for (int i = 0; i < 20; i++) {
                System.out.print(numero[i] + "\t");
                System.out.print(cuadrado[i] + "\t");
                System.out.println(cubo[i]);
            }
    }
}
