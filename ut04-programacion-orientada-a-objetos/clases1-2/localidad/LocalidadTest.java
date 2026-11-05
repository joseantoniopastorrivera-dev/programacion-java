//Autor: JAPR
//Fecha: 03/02/26 

package localidad;

public class LocalidadTest {

    public static void main(String[] args) {

        // Crear objeto miPueblo(Alcalá de Henares)
        Localidad miPueblo = new Localidad("Alcalá de Henares", "Madrid", 203208, 29.35, 87.99, 31.186);

        // Creamos objeto guadalajara
        Localidad guadalajara = new Localidad("Guadalajara", "Guadalajara", 87000, 55.0, 235.5, 26000.0);

        // Mostramos datos usando los getters
        System.out.println("Localidad: " + miPueblo.getNombre());
        System.out.println("Provincia: " + miPueblo.getProvincia());
        System.out.println("Número de habitantes: " + miPueblo.getNumHabitantes());
        System.out.println("Distancia a la capital (en km): " + miPueblo.getDistanciaACapital());
        System.out.println("Superficie (en km2): " + miPueblo.getSuperficie());
        System.out.println("Renta per Cápita (en euros): " + miPueblo.getRentaPerCapita());

        // Usamos el método nuevo (Ejercicio 3)
        boolean esMasGrande = miPueblo.tieneMasPoblacion(guadalajara);
        System.out.println("¿Tiene mi pueblo más gente que Guadalajara?: " + esMasGrande);

        // Creamos un método nuevo aparte del ejercicio 3
        boolean estaMasLejos = miPueblo.estaMasLejos(guadalajara);
        System.out.println("¿Está mi pueblo mas lejos que Guadalajara de la capital?: " + estaMasLejos);

        // Prueba de densidad(Ejercicio 4)
        System.out.println("\n---PRUEBA DE DENSIDAD---");
        // Calculamos y guardamos el resultado en una variable
        double densidadMiPueblo = miPueblo.densidadDePoblacion();
        System.out.println("Densidad de " + miPueblo.getNombre() + ": " + densidadMiPueblo + " hab/km2");
        // Otra forma de imprimir usando printf
        System.out.printf("Densidad de %s: %.2f hab/km2", miPueblo.getNombre(), densidadMiPueblo);

        double densidadGuadalajara = guadalajara.densidadDePoblacion();
        System.out.println("\nDensidad de " + guadalajara.getNombre() + ": " + densidadGuadalajara + " hab/mk2");
        // otra forma de imprimir usando printf
        System.out.printf("Densidad de %s: %.2f hab/km2", guadalajara.getNombre(), densidadGuadalajara);

        // Prueba de renta potencial (Ejercicio 8)
        System.out.println("---PRUEBA DE RENTA POTENCIAL---");
        double rentaPotencial1 = miPueblo.rentaPotencial();
        System.out.println("La renta potencial de " + miPueblo.getNombre() + " es de: " + rentaPotencial1 + " euros.");

    }

}
