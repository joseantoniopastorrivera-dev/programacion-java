// Autor: JAPR
// Fecha: 16/01/26
// Ejercicio: Gestión de Centro Educativo (POO)

package centrosEducativos; //Indica que está en la carpeta CentrosEducativos

public class CentroEducativo {

    // 1. ATRIBUTOS (Privados para encapsulamiento)
    private String nombre;
    private String localizacion;
    private int numAlumnos;
    private int numProfesores;
    private double superficie; // En metros cuadrados
    private double presupuesto; // Anual en euros
    private String caracteristicas; // Descripción general (ej: "Bilingüe", "TIC")

    // 2. CONSTRUCTOR (Pide el ejercicio permitir crear indicando todos los datos)
    public CentroEducativo(String nombre, String localizacion, int numAlumnos, int numProfesores, 
                           double superficie, double presupuesto, String caracteristicas) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.numAlumnos = numAlumnos;
        this.numProfesores = numProfesores;
        this.superficie = superficie;
        this.presupuesto = presupuesto;
        this.caracteristicas = caracteristicas;
    }

    // 3. GETTERS Y SETTERS (Acceso y modificación controlada)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getLocalizacion() { return localizacion; }
    public void setLocalizacion(String localizacion) { this.localizacion = localizacion; }

    public int getNumAlumnos() { return numAlumnos; }
    public void setNumAlumnos(int numAlumnos) { this.numAlumnos = numAlumnos; }

    public int getNumProfesores() { return numProfesores; }
    public void setNumProfesores(int numProfesores) { this.numProfesores = numProfesores; }

    public double getSuperficie() { return superficie; }
    public void setSuperficie(double superficie) { this.superficie = superficie; }

    public double getPresupuesto() { return presupuesto; }
    public void setPresupuesto(double presupuesto) { this.presupuesto = presupuesto; }

    public String getCaracteristicas() { return caracteristicas; }
    public void setCaracteristicas(String caracteristicas) { this.caracteristicas = caracteristicas; }

    // 4. MÉTODOS DE CÁLCULO (Parte 2 del ejercicio)

    // A. Comparar volumen de alumnado con otro centro
    // Devuelve true si "este" centro tiene más alumnos que el "otro"
    public boolean tieneMasAlumnosQue(CentroEducativo otroCentro) {
        return this.numAlumnos > otroCentro.getNumAlumnos();
    }

    // B. Ratio Alumnos/Profesor
    // Devuelve cuántos alumnos tocan por cada profesor
    public double alumnosPorProfesor() {
        if (numProfesores == 0) return 0; // Evitar división por cero
        return (double) numAlumnos / numProfesores;
    }

    // C. Presupuesto por Alumno
    // Devuelve cuánto dinero se invierte en cada alumno
    public double presupuestoPorAlumno() {
        if (numAlumnos == 0) return 0; // Evitar división por cero
        return presupuesto / numAlumnos;
    }

    // 5. MOSTRAR INFORMACIÓN (toString)
    @Override
    public String toString() {
        return "CENTRO: " + nombre + "\n" +
               " - Localización: " + localizacion + "\n" +
               " - Alumnos: " + numAlumnos + " | Profesores: " + numProfesores + "\n" +
               " - Superficie: " + superficie + " m2\n" +
               " - Presupuesto: " + String.format("%,.2f", presupuesto) + " €\n" +
               " - Info: " + caracteristicas;
    }
}