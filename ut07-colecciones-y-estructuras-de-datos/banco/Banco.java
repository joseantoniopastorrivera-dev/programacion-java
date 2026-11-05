//Autor: JAPR
//Fecha: 10/Mar/2026
//Clase apoyo Banco.java

package banco;

public class Banco {
    private String nombre;
    private String id;
    private String localizacion;

    public Banco(String nombre, String id, String localizacion) {
        this.nombre = nombre;
        this.id = id;
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return nombre + " (ID: " + id + ") - " + localizacion;
    }
}