package examen;

import examen.controlador.AppController;
import examen.utils.Ansi;

/** 
 * Clase principal que arranca el sistema de rentacar 
 */
public class AppRentacar {

    public static void main(String[] args){

        System.out.println(Ansi.GREEN+"Iniciando Rentacar.."+Ansi.RESET);

        //Instanciamos el controlador
        AppController app = new AppController();

        app.iniciar();
    }
}
