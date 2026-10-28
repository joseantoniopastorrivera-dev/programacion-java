# Programacion-Java (Programación, 1º DAM)

Ejercicios y proyectos de Java organizados por unidad. No es un único proyecto: cada carpeta se compila y ejecuta por separado.

## Estructura
- `UT01-Introduccion-a-la-Programacion/` — pseudocódigo (PSeInt).
- `UT02-UT03-Fundamentos-Y-Estructuras-Java/01..10-*` — sintaxis, tipos, Scanner, condicionales, bucles, arrays, Math, Strings, minijuegos, algoritmos de ordenación.
- `UT04-Programacion-Orientada-A-Objetos/` — clases básicas (lampara, intervalo, quiniela, empleados…).
- `UT05-Programacion-Orientada-A-Objetos-Avanzada/` — herencia, interfaces; proyectos Maven `Proyecto_Empleados/empleados`, `Proyecto_Interfaces/interfaces`, `Proyecto_Taller/taller`.
- `UT06-Manejo-De-Excepciones/excepciones/` — Maven.
- `UT07-Colecciones-Y-Estructuras-De-Datos/` — ArrayList, mapas, listas enlazadas, retos.
- `UT08-Interfaces-Graficas-Swing/`, `UT09-Entrada-Y-Salida-De-Datos/`, `UT10-Acceso-A-Bases-De-Datos-JDBC/` (MySQL, DAO).
- `UT11-Simulacros-De-Examen/` — casos integrales (alquiler de vehículos, pedidos).
- `Repaso-2026-2027/fase-1..5/` — repaso de cara a 2º.

## Compilar y ejecutar
- Ejercicios sueltos: `javac Archivo.java && java Archivo` desde su carpeta.
- Proyectos con `pom.xml`: `mvn compile exec:java` o desde el IDE. Java 17; JDBC usa `mysql-connector-j`.

## Notas
- `target/`, `bin/`, `out/` y `*.class` están en `.gitignore`: no los fuerces al commit.
- Paquetes de los proyectos Maven: `com.japr.*`.
