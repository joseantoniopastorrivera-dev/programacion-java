//Autor: JAPR
//Fecha: 28/12/25
//Declare variables de tipo char y de tipo String. 
//Intenta mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia de Java.

//Carpeta a la que pertenece
package Hoja1_Variables;

//Nombre de la clase.
public class Hoja1Ejercicio7 {

    // Método main o puerta de entrada.
    public static void main(String[] args) {

        // Declaramos las variables tipo character y string.
        char inicial = 'J';
        String nombre1 = "osé";
        char inicial2 = 'A';
        String nombre2 = "ntonio";
        char inicial3 = 'P';
        String apellido = "astor";
        char inicial4 = 'R';
        String apellido2 = "ivera";

        // Imprimimos por pantalla el resultado con printf.
        System.out.printf("Nombre completo: %c%s %c%s.\n" + 
        "Apellidos: %c%s %c%s.\n", inicial, nombre1, inicial2, nombre2, inicial3, apellido, inicial4, apellido2);  

        //Imprimimos por pantalla el resultado con println.
        System.out.println("Nombre completo: "+inicial+nombre1 + " " + inicial2+nombre2 + "." + 
        "\nApellidos: "+inicial3+apellido + " " + inicial4+apellido2 + ".");
    }

}
