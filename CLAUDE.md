# Programacion-Java (Programación, 1º DAM)

## Cómo trabajar conmigo
Reglas comunes a todos mis repos (copia de mi `C:\dev\CLAUDE.md`, para que también las lean las sesiones en la nube). Soy estudiante de DAM en el IES Isidra de Guzmán.
- En prácticas evaluables, resuélvelas completas (sin modo de pistas). Al terminar, crea junto a la entrega (en `docs/` si existe) un `guia-defensa-<practica>.md` para defenderla en clase, al estilo de la guía de DataStock. No se añade a Git salvo que lo pida.
- Estructura de la guía de defensa: cómo usarla; cómo arrancar, ejecutar y ensayar sin estropear la entrega; qué pide el enunciado y dónde se cumple cada requisito; visión general (capas, flujo, decisiones de diseño a justificar); y por cada requisito: qué pide, dónde está, explicación línea a línea, cómo demostrarlo, errores típicos, preguntas de la profesora con su respuesta y 🔧 modificaciones en directo (el cambio que podrían pedir, con el código exacto y dónde va). Al final: casos prácticos «¿qué pasaría si…?», «corrige este error» (síntoma → causa → arreglo) y chuleta con plan de ensayo.
- Si la tarea es grande, antes de tocar nada dime cómo lo harías (plan por pasos) y espera a que lo apruebe o lo corrija.
- Cuando escribas código, explícalo línea por línea y di por qué elegiste esa forma y no otra.
- Si ves un error de concepto o algo que no entiendo bien, dímelo aunque no te lo pregunte.
- Responde en español.
- No hagas commit ni push sin que te lo pida. Commits sin `Co-Authored-By` ni líneas de atribución.
- No subas binarios generados (`target/`, `*.class`, `__pycache__/`, `*.pyc`, `bin/`, `obj/`, `Library/` de Unity).
- Nunca leas, muestres ni subas ficheros `.env`, tokens ni credenciales.
- PDFs, .docx, .odt y .pptx son apuntes o enunciados: léelos solo si hacen falta para la tarea.

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
