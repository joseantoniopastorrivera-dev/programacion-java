//Autor: JAPR
//Fecha: 03/Feb/2026
//Clase Persona 

package persona;

public class Persona {

    // 1.Atributos
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String profesion;
    private int edad;

    // 2.Constructor
    public Persona(String nombre, String apellido1, String apellido2, String dni, String profesion, int edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.profesion = profesion;
        this.edad = edad;
    }

    // 3.Getters y Setters(Métodos para asignar y obtener valor)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // 4. Métodos de los ejercicios
    // EJERCICIO 5
    public boolean esMayorQue(Persona otraPersona) {
        // Comparamos mi edad con la suya
        if (this.edad > otraPersona.getEdad()) {
            return true;
        } else {
            return false;
        }
    }

    // EJERCICIO 6
    public boolean esTocayoDe(Persona otraPersona) {
        // Comparamos si los nombres son iguales
        if (this.nombre.equals(otraPersona.getNombre())) {
            return true;
        } else {
            return false;
        }
    }

    // EJERCICIO 7
    public boolean esFamiliarDe(Persona otraPersona) {
        // Comprobamos si los apellidos son iguales
        if (this.apellido1.equals(otraPersona.getApellido1()) || this.apellido1.equals(otraPersona.getApellido2())
                || this.apellido2.equals(otraPersona.getApellido1())
                || this.apellido2.equals(otraPersona.getApellido2())) {
            return true;
        } else {
            return false;
        }
    }

    // HOJA 2
    // EJERCICIO 1: Modificar profesión si es jubilado
    public void esJubilado() {
        if (this.edad > 67) {
            this.profesion = this.profesion + " jubilado";
        }
    }

    // EJERCICIO 2: Comprobar si es menor
    public boolean esMenor() {
        if (this.edad < 18) {
            return true;
        } else {
            return false;
        }
    }

    // EJERCICIO 3: Comprobar si trabaja en el sector
    public boolean trabajaEnSector(String[] listadoProfesiones) {
        for (int i = 0; i < listadoProfesiones.length; i++) {
            if (this.profesion.equals(listadoProfesiones[i])) {
                return true;
            }
        }
        return false;
    }

    // EJERCICIO 4: Detectar apellidos compuestos
    public boolean tieneApellidoCompuesto() {
        if (this.apellido1.contains("-") || this.apellido2.contains("-")) {
            return true;
        } else {
            return false;
        }
    }

    
}
