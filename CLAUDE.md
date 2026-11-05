# Programacion-Java (Programación, 1º DAM)

Ejercicios y proyectos de Java organizados por unidad. No es un único proyecto: cada carpeta se compila y ejecuta por separado.

## Estructura
- `ut01-introduccion-a-la-programacion/` — pseudocódigo (PSeInt).
- `ut02-ut03-fundamentos-y-estructuras-java/01..10-*` — sintaxis, tipos, Scanner, condicionales, bucles, arrays, Math, Strings, minijuegos, algoritmos de ordenación.
- `ut04-programacion-orientada-a-objetos/` — clases básicas (lampara, intervalo, quiniela, empleados…).
- `ut05-programacion-orientada-a-objetos-avanzada/` — herencia, interfaces; proyectos Maven `proyecto-empleados/empleados`, `proyecto-interfaces/interfaces`, `proyecto-taller/taller`.
- `ut06-manejo-de-excepciones/excepciones/` — Maven.
- `ut07-colecciones-y-estructuras-de-datos/` — ArrayList, mapas, listas enlazadas, retos.
- `ut08-interfaces-graficas-swing/`, `ut09-entrada-y-salida-de-datos/`, `ut10-acceso-a-bases-de-datos-jdbc/` (MySQL, DAO).
- `ut11-simulacros-de-examen/` — casos integrales (alquiler de vehículos, pedidos).
- `repaso-2026-2027/fase-1..5/` — repaso de cara a 2º.

## Compilar y ejecutar
- Ejercicios sueltos: `javac Archivo.java && java Archivo` desde su carpeta.
- Proyectos con `pom.xml`: `mvn compile exec:java` o desde el IDE. Java 17; JDBC usa `mysql-connector-j`.

## Notas
- `target/`, `bin/`, `out/` y `*.class` están en `.gitignore`: no los fuerces al commit.
- Paquetes de los proyectos Maven: `com.japr.*`.
