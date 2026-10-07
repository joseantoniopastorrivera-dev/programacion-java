//Autor: JAPR
//Fecha: 28/12/25
//Crea las variables nombre, direccion y telefono y asígnales los valores correspondientes.
//Muestra los valores de esas variables por pantalla.

//Carpeta a la que pertenece
package Hoja1_Variables;

//Nombre de la clase
public class Hoja1Ejercicio3 {

    // Metodo main o puerta de entrada
    public static void main(String[] args) {

        // Declaramos las variables solicitadas.
        String nombre = "José Antonio Pastor Rivera";
        String direccion = "Calle Tercia 10, E";
        String telefono = "+34 622 684 708";
        String CP = "28801";
        String DNI = "09065893Y";

        // Imprimimos por pantalla las variables declaradas.
        System.out.printf("Mi nombre es: %s.\n" + 
        "Vivo en: %s.\n" + 
        "Mi teléfono es: %s.\n" + 
        "Mi código postal es: %s.\n" + 
        "Mi DNI es: %s.\n", nombre, direccion,telefono, CP, DNI);
    
    }
}
