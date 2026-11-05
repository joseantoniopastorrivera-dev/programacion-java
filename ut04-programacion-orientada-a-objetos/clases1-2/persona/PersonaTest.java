//Autor: JAPR
//Fecha: 03/Feb/2026
//Test clase Persona 

package persona;

public class PersonaTest {

        public static void main(String[] args) {

                // Crear objeto persona1, 2, 3..
                Persona persona1 = new Persona("José Antonio", "Pastor", "Rivera", "09065893Y", "Teleoperador", 29);
                Persona persona2 = new Persona("Luis", "Pastor", "García", "12345678Z", "Estudiante", 25);
                Persona persona3 = new Persona("Antonio", "Pastor", "López", "87654321X", "Jubilado", 80);

                // Mostramos datos usando los getters
                System.out.println("Nombre: " + persona1.getNombre());
                System.out.println("Apellido 1: " + persona1.getApellido1());
                System.out.println("Apellido 2: " + persona1.getApellido2());
                System.out.println("DNI: " + persona1.getDni());
                System.out.println("Profesión: " + persona1.getProfesion());
                System.out.println("Edad: " + persona1.getEdad());

                // Usamos el nuevo método (Ejercicio 5)
                // Probamos quien es mayor que
                System.out.println("---PRUEBAS DE EDAD---");
                boolean esMayorQuePersona2 = persona1.esMayorQue(persona2);
                System.out.println(
                                "¿Es " + persona1.getNombre() + " mayor que " + persona2.getNombre() + "?: "
                                                + esMayorQuePersona2);
                boolean esMayorQuePersona3 = persona1.esMayorQue(persona3);
                System.out.println(
                                "¿Es " + persona1.getNombre() + " mayor que " + persona3.getNombre() + "?: "
                                                + esMayorQuePersona3);

                // Usamos el nuevo método (Ejercicio 6)
                // Probamos si es tocayo
                System.out.println("---PRUEBAS SOBRE SI ES TOCAYO");
                boolean esTocayoDe2 = persona1.esTocayoDe(persona2);
                System.out.println("¿Es " + persona1.getNombre() + " tocayo de " + persona2.getNombre() + "?: "
                                + esTocayoDe2);
                boolean esTocayoDe3 = persona1.esTocayoDe(persona3);
                System.out.println("¿Es " + persona1.getNombre() + " tocayo de " + persona3.getNombre() + "?: "
                                + esTocayoDe3);

                // Usamos el nuevo método (Ejercicio 7)
                // Probamos si es familiar
                System.out.println("---PRUEBA SOBRE SI SON FAMILIA (COMPARTEN APELLIDO)---");
                boolean esFamiliarDe2 = persona1.esFamiliarDe(persona2);
                System.out.println("¿Es " + persona1.getNombre() + " " + persona1.getApellido1() + " "
                                + persona1.getApellido2()
                                + " familiar de " + persona2.getNombre() + " " + persona2.getApellido1() + " "
                                + persona2.getApellido2()
                                + "?: " + esFamiliarDe2);
                boolean esFamiliarDe3 = persona1.esFamiliarDe(persona3);
                System.out.println("¿Es " + persona1.getNombre() + " " + persona1.getApellido1() + " "
                                + persona1.getApellido2()
                                + " familiar de " + persona3.getNombre() + " " + persona3.getApellido1() + " "
                                + persona3.getApellido2()
                                + "?: " + esFamiliarDe3);

                // Usamos el nuevo método(Hoja 2, Ejercicio 1)
                System.out.println("\n----PRUEBAS HOJA 2 - EJERCICIO 1(JUBILACIÓN) ----");
                // Imprimimos la profesión antes de utilizar el método esJubilado
                Persona abuela1 = new Persona("Antonia", "Perez", "Gómez", "12345678A", "Carpintero", 70);
                System.out.println("Profesión original: " + abuela1.getProfesion());
                // Ejecutamos el método, no devuelve nada, sólo actúa
                abuela1.esJubilado();
                // Imprimimos la profesión actualizada
                System.out.println("Profesión actualizada: " + abuela1.getProfesion());

                // Prueba con otro perfil
                Persona persona4 = new Persona("Laura", "Sanz", "Gil", "11223344L", "Ingeniera", 30);
                // Usamos el método a ver si modifica algo
                persona4.esJubilado();
                System.out.println("Profesión de persona joven(no debe cambiar): " + persona4.getProfesion());

                System.out.println("Probamos si el método esMenor: ");
                Persona persona5 = new Persona("Pepito", "Grillo", "Disney", "12341234A", "Estudiante", 17);
                System.out.println("¿Es " + persona1.getNombre() + " " + persona1.getApellido1() + " "
                                + persona1.getApellido2() + " menor de edad?: " + persona1.esMenor());
                System.out.println("¿Es " + persona2.getNombre() + " " + persona2.getApellido1() + " "
                                + persona2.getApellido2() + " menor de edad?: " + persona2.esMenor());
                System.out.println("¿Es " + persona5.getNombre() + " " + persona5.getApellido1() + " "
                                + persona5.getApellido2() + " menor de edad?: " + persona5.esMenor());

                // Usamos el nuevo método(Hoja 2, Ejercicio 3)
                System.out.println("Probamos si el método 'trabajaEnSector'.");
                String[] sectorTecnico = { "Informático", "Programador", "Teleoperador" };
                boolean esTecnico = persona1.trabajaEnSector(sectorTecnico);
                System.out.println("¿Es " + persona1.getNombre() + " " + persona1.getApellido1() + " "
                                + persona1.getApellido2() + " del sector técnico?: " + esTecnico);

                // Definimos la lista de profesiones educativas
                String[] sectorEducacion = { "Profesor", "Maestro", "Estudiante", "Conserje", "Director" };
                boolean esDeEducacion2 = persona2.trabajaEnSector(sectorEducacion);
                System.out.println("¿Es " + persona2.getNombre() + " " + persona2.getApellido1() +
                                " del sector educación?: " + esDeEducacion2);
                boolean esDeEducacion1 = persona1.trabajaEnSector(sectorEducacion);
                System.out.println("¿Es " + persona1.getNombre() + " " + persona1.getApellido1() + " "
                                + persona1.getApellido2() +
                                " del sector educación?: " + esDeEducacion1);

                // Usamos el nuevo método(Hoja 2, Ejercicio 4)
                System.out.println("Probamos el método 'tieneApellidoCompuesto'.");
                Persona persona6 = new Persona("Cayetano", "Martínez-Irujo", "Fitz-James", "10000000X", "Duque", 50);
                boolean esCompuesto1 = persona1.tieneApellidoCompuesto();
                boolean esCompuesto6 = persona6.tieneApellidoCompuesto();
                boolean esCompuesto2 = persona2.tieneApellidoCompuesto();
                System.out.println("¿Tiene " + persona6.getNombre() + " " + persona6.getApellido1() + " "
                                + persona6.getApellido2() + " apellido compuesto?: " + esCompuesto6);
                System.out.println("¿Tiene " + persona1.getNombre() + " " + persona1.getApellido1() + " "
                                + persona1.getApellido2() + " apellido compuesto?: " + esCompuesto1);
                System.out.println("¿Tiene " + persona2.getNombre() + " " + persona2.getApellido1() + " "
                                + persona2.getApellido2() + " apellido compuesto?: " + esCompuesto2);

        }
}