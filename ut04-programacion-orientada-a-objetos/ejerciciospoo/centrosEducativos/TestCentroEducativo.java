package centrosEducativos; //Indica que está en la carpeta CentrosEducativos

public class TestCentroEducativo {
    public static void main(String[] args) {
        
        // 1. Crear dos centros educativos
        CentroEducativo iesAlcala = new CentroEducativo(
            "IES Complutense", "Alcalá de Henares", 
            850, 60, 
            2500.0, 150000.0, 
            "Bilingüe y TIC"
        );

        CentroEducativo colegioMadrid = new CentroEducativo(
            "Colegio El Retiro", "Madrid Centro", 
            1200, 95, 
            4000.0, 300000.0, 
            "Privado, Instalaciones deportivas"
        );

        // 2. Mostrar información básica
        System.out.println("--- INFORMACIÓN DE LOS CENTROS ---");
        System.out.println(iesAlcala.toString());
        System.out.println("\n" + colegioMadrid.toString());

        // 3. Probar Comparación de Alumnos
        System.out.println("\n--- COMPARACIÓN DE TAMAÑO ---");
        if (iesAlcala.tieneMasAlumnosQue(colegioMadrid)) {
            System.out.println(iesAlcala.getNombre() + " es más grande.");
        } else {
            System.out.println(colegioMadrid.getNombre() + " es más grande.");
        }

        // 4. Probar Indicadores Económicos y Académicos
        System.out.println("\n--- ESTADÍSTICAS DEL IES COMPLUTENSE ---");
        System.out.printf("Ratio: %.2f alumnos por cada profesor.\n", iesAlcala.alumnosPorProfesor());
        System.out.printf("Inversión: %.2f € por alumno.\n", iesAlcala.presupuestoPorAlumno());

        System.out.println("\n--- ESTADÍSTICAS DEL COLEGIO EL RETIRO ---");
        System.out.printf("Ratio: %.2f alumnos por cada profesor.\n", colegioMadrid.alumnosPorProfesor());
        System.out.printf("Inversión: %.2f € por alumno.\n", colegioMadrid.presupuestoPorAlumno());
    }
}