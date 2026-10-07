//Autor: JAPR
//Fecha: 01/02/26
//Ejercicios Hoja7 + menú

package Hoja7_Strings;

import java.util.Scanner;

public class Hoja7Ejercicios1_20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n----EJERCICIOS 1-20 Hoja 7----");
            System.out.println("1. Contar vocales.");
            System.out.println("2. Contar letras mayúsculas y minúsculas.");
            System.out.println("3. Invertir una palabra.");
            System.out.println("4. Contar las veces que aparece un caracter en una frase.");
            System.out.println("5. Reemplazar todas las vocales por '*'.");
            System.out.println("6. Mostrar iniciales de un nombre completo.");
            System.out.println("7. Comprobar si una palabra es palíndroma.");
            System.out.println("8. Contar las palabras de una frase.");
            System.out.println("9. Convertir una frase en formato título.");
            System.out.println("10. Mostrar los caracteres de una palabra.");
            System.out.println("11. Eliminar los espacios de una frase.");
            System.out.println("12. Sustituir dígitos por guiones'-'.");
            System.out.println("13. Mostrar una frase o palabra al invertida(sólo letras).");
            System.out.println("14. Duplicar cada carácter de una palabra.");
            System.out.println("15. Insertar guiones entre caracteres.");
            System.out.println("16. Mostrar cuántas letras, números y otros símbolos hay.");
            System.out.println("17. Normalizar espacios de una frase.");
            System.out.println("18. Alterna mayúsculas/minúsculas de una frase.");
            System.out.println("19. Pedir una frase y generar su acrónimo.");
            System.out.println("20. Eliminar todas las vocales de una cadena.");
            System.out.println("0. Salir.");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            // Limpiamos el buffer del intro
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Pide al usuario una frase y cuenta cuántas vocales contiene (a, e, i, o, u).
                    // Debes ignorar mayúsculas/minúsculas usando Character.toLowerCase().
                    System.out.println("Introduzca una frase: ");
                    String frase1 = scanner.nextLine();
                    int contadorVocales = 0;
                    for (int i = 0; i < frase1.length(); i++) {
                        char c = Character.toLowerCase(frase1.charAt(i));
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                            contadorVocales++;
                        }
                    }
                    System.out.println("La frase tiene " + contadorVocales + " vocales.");
                    // Hay que poner break para no ejecutar el default
                    break;

                case 2:
                    // Pide una palabra o frase y contabiliza:
                    // Nº de letras mayúsculas
                    // Nº de letras minúsculas
                    // Ignora caracteres que no sean letras (usa Character.isLetter()).
                    System.out.println("Introduzca una frase: ");
                    String frase2 = scanner.nextLine();
                    int contadorMayusculas = 0;
                    int contadorMinusculas = 0;
                    for (int i = 0; i < frase2.length(); i++) {
                        char c = frase2.charAt(i);
                        if (Character.isLetter(c)) {
                            if (Character.isUpperCase(c)) {
                                contadorMayusculas++;
                            } else {
                                contadorMinusculas++;
                            }
                        }
                    }
                    System.out.println("Nº de letras mayúsculas: " + contadorMayusculas);
                    System.out.println("Nº de letras minúsculas: " + contadorMinusculas);
                    // Hay que poner break para no ejecutar el default
                    break;

                case 3:
                    // Pide una palabra y muéstrala invertida utilizando exclusivamente:
                    // StringBuilder sb = new StringBuilder(palabra);
                    // sb.reverse();
                    System.out.println("Introduce una palabra: ");
                    String palabra = scanner.next();
                    StringBuilder sb = new StringBuilder(palabra);
                    sb.reverse();
                    System.out.println("Palabra original: " + palabra);
                    System.out.println("Palabra invertida: " + sb);
                    // Limpiamos el buffer ANTES de salir del case
                    scanner.nextLine();
                    // Hay que poner break para no ejecutar el default
                    break;

                case 4:
                    // Pide una frase y un carácter.
                    // Usando un bucle y charAt(), indica cuántas veces aparece.
                    System.out.println("Introduce una frase: ");
                    String frase3 = scanner.nextLine();
                    System.out.println("Introduce un caracter para saber cuantas veces aparece en la frase: ");
                    char c = Character.toLowerCase(scanner.next().charAt(0));
                    int contador = 0;
                    for (int i = 0; i < frase3.length(); i++) {
                        char aux = Character.toLowerCase(frase3.charAt(i));
                        if (c == aux) {
                            contador++;
                        }
                    }
                    System.out.println("El caracter '" + c + "' aparece " + contador + " veces.");
                    // Limpiamos el buffer ANTES de salir del case
                    scanner.nextLine();
                    // Hay que poner break para no ejecutar el default
                    break;

                case 5:
                    // Reemplazar todas las vocales por '*'
                    // Pide un texto y reemplaza todas las vocales por *
                    System.out.println("Introduzca una palabra, frase o texto: ");
                    String frase4 = scanner.nextLine();
                    for (int i = 0; i < frase4.length(); i++) {
                        char letra = Character.toLowerCase(frase4.charAt(i));
                        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                            System.out.print("*");
                        } else {
                            System.out.print(frase4.charAt(i));
                        }
                    }
                    System.out.println();
                    // Hay que poner break para no ejecutar el default
                    break;

                case 6:
                    // Pide un nombre completo, por ejemplo:
                    // "María López García"
                    // Debes mostrar "M. L. G."
                    System.out.println("Introduzca un nombre completo(ej: José Antonio Pastor Rivera): ");
                    String nombreCompleto = scanner.nextLine();

                    System.out.println("--INICIALES--");
                    String[] palabras = nombreCompleto.split(" ");

                    for (int i = 0; i < palabras.length; i++) {
                        if (palabras[i].length() > 0) {
                            System.out.print(palabras[i].charAt(0) + ". ");
                        }
                    }
                    System.out.println();
                    // Hay que poner break para no ejecutar el default
                    break;

                case 7:
                    // Comprobar si una palabra es palíndroma
                    // Pide una palabra y determina si es igual al mismo texto invertido. Hazlo sin
                    // usar StringBuilder.
                    System.out.println("Introduzca una palabra para comprobar que es palíndroma: ");
                    String palabra7 = scanner.next();
                    boolean esPalindromo = true;
                    int longitud = palabra7.length();

                    for (int i = 0; i < longitud / 2; i++) {
                        char letraIzquierda = Character.toLowerCase(palabra7.charAt(i));
                        char letraDerecha = Character.toLowerCase(palabra7.charAt(longitud - 1 - i));
                        if (letraIzquierda != letraDerecha) {
                            esPalindromo = false;
                            // Si una sola letra no coincide, ya no es palíndromo.Salimos
                            break;
                        }
                    }
                    if (esPalindromo) {
                        System.out.println("La palabra " + palabra7 + " SÍ es un palíndromo.");
                    } else {
                        System.out.println("La palabra " + palabra7 + " NO es un palíndromo.");
                    }
                    // Limpiamos el buffer ANTES de salir del case
                    scanner.nextLine();
                    // Hay que poner break para no ejecutar el default
                    break;

                case 8:
                    // Contar palabras en una frase
                    // Pide una frase y cuenta cuántas palabras tiene.
                    // Se considera palabra a un grupo de caracteres separados por uno o más
                    // espacios.
                    System.out.println("Introduzca una frase: ");
                    // anterior y hay que limpiar el buffer
                    String frase8 = scanner.nextLine();
                    if (frase8.trim().isEmpty()) {
                        System.out.println("No has escrito nada.");
                    } else {
                        // split("\\s+") corta por "uno o más espacios".
                        // Es mejor que split(" ") por si el usuario pone doble espacio sin querer.
                        String[] palabras8 = frase8.trim().split("\\s+");
                        System.out.println("La frase tiene " + palabras8.length + " palabras.");
                    }
                    // Hay que poner break para no ejecutar el default
                    break;

                case 9:
                    // Convertir frase a “Formato Título”
                    // Convierte la frase:
                    // "bienvenidos a madrid"
                    // en
                    // "Bienvenidos A Madrid"
                    System.out.println("Introuduce una frase: ");
                    String frase9 = scanner.nextLine();
                    char[] caracteres = frase9.toCharArray();

                    // El primero siempre va en mayúscula (si hay texto)
                    if (caracteres.length > 0) {
                        caracteres[0] = Character.toUpperCase(caracteres[0]);
                    }
                    // Recorremos el resto
                    for (int i = 1; i < caracteres.length; i++) {
                        if (caracteres[i - 1] == ' ') {
                            caracteres[i] = Character.toUpperCase(caracteres[i]);
                        } else {
                            // El resto en minúscula
                            caracteres[i] = Character.toLowerCase(caracteres[i]);
                        }
                    }
                    // Reconstruimos el String y mostramos
                    System.out.println("Formato Título: " + new String(caracteres));
                    // Hay que poner break para no ejecutar el default
                    break;

                case 10:
                    // Pide una palabra y muestra cada carácter junto con su índice:
                    // 0 → H
                    // 1 → o
                    // 2 → l
                    // 3 → a
                    System.out.println("Introduzca una palabra: ");
                    String palabra10 = scanner.next();
                    char palabras10[] = palabra10.toCharArray();
                    for (int i = 0; i < palabra10.length(); i++) {
                        System.out.printf("%d \t%c\n", i, palabras10[i]);
                    }
                    // Liberamos el buffer del scanner
                    scanner.nextLine();
                    // Hay que poner break para no ejecutar el default
                    break;

                case 11:
                    // Eliminar todos los espacios
                    // Pide una frase y elimina todos los espacios
                    System.out.println("Introduzca una frase: ");
                    String frase11 = scanner.nextLine();
                    char palabras11[] = frase11.toCharArray();
                    System.out.print("Frase sin espacios: ");
                    for (int i = 0; i < palabras11.length; i++) {
                        if (palabras11[i] != ' ') {
                            System.out.print(palabras11[i]);
                        }
                    }
                    // Salto de línea estético
                    System.out.println();
                    System.out.println("Esto es otra forma de imprimir la frase sin espacios: ");
                    System.out.println(frase11.replace(" ", ""));

                    // Hay que poner break para no ejecutar el default
                    break;

                case 12:
                    // Sustituir dígitos por guiones
                    // Pide un texto que contenga letras y números. Todo dígito debe sustituirse por
                    // el carácter -.
                    System.out.println("Introuduzca una frase o palabra con números: ");
                    String frase12 = scanner.nextLine();
                    System.out.println("Frase modificada: " + frase12.replaceAll("[0-9]", "-"));
                    // Otra forma de resolverlo
                    System.out.println("Otra forma de resolverlo: ");
                    char palabras12[] = frase12.toCharArray();
                    for (int i = 0; i < palabras12.length; i++) {
                        if (Character.isDigit(palabras12[i])) {
                            System.out.print('-');
                        } else {
                            System.out.print(palabras12[i]);
                        }
                    }
                    // Hay que poner break para no ejecutar el default
                    break;

                case 13:
                    // 13. Crear una cadena al revés pero solo con letras
                    // Pide un texto y construye una nueva cadena que solo incluya letras pero en
                    // orden inverso.
                    // Ejemplo:
                    // Entrada: "Hola 2025!"
                    // Salida: "aloH".
                    System.out.println("Introduzca una palabra o una frase: ");
                    String frase13 = scanner.nextLine();
                    char palabras13[] = frase13.toCharArray();
                    char aux13[] = new char[palabras13.length];
                    for (int i = 0; i < palabras13.length; i++) {
                        aux13[i] = palabras13[palabras13.length - 1 - i];
                        if (Character.isLetter(aux13[i])) {
                            System.out.print(aux13[i]);
                        }
                    }
                    System.out.println("\nEsto es otra solución del ejercicio: ");
                    int contador13 = 0;
                    for (int i = 0; i < palabras13.length; i++) {
                        if (contador13 == 2) {
                            if (Character.isLetter(aux13[i])) {
                                System.out.print(" " + aux13[i]);
                                contador13 = 1;
                            } else if (Character.isDigit(aux13[i])) {
                                System.out.print(" ");
                                contador13 = 0;
                            } else if (Character.isSpaceChar(aux13[i])) {
                                System.out.print(" ");
                                contador13 = 0;
                            }
                        } else {
                            aux13[i] = palabras13[palabras13.length - 1 - i];
                            if (Character.isLetter(aux13[i])) {
                                System.out.print(aux13[i]);
                                contador13++;
                            }
                        }
                    }
                    // Hay que poner break para no ejecutar el default
                    break;

                case 14:
                    // Duplicar cada carácter de una palabra
                    // Ejemplo:
                    // Entrada: "sol"
                    // Salida: "ssooll"
                    System.out.println("Introduzca una palabra: ");
                    String palabra14 = scanner.next();
                    char palabras14[] = palabra14.toCharArray();
                    for (int i = 0; i < palabras14.length; i++) {
                        // Suponemos que se omiten los números, si no se omiten quitamos el if y ya
                        if (Character.isLetter(palabras14[i])) {
                            System.out.printf("%c%c", palabras14[i], palabras14[i]);
                        }
                    }
                    System.out.println();
                    // Liberamos el buffer del scanner
                    scanner.nextLine();
                    // Hay que poner break para no ejecutar el default
                    break;

                case 15:
                    // Insertar guiones entre caracteres
                    // Entrada: "hola"
                    // Salida: "h-o-l-a"
                    System.out.println("Introduzca una palabra o una frase: ");
                    String palabra15 = scanner.nextLine();
                    char palabras15[] = palabra15.toCharArray();
                    for (int i = 0; i < palabra15.length(); i++) {
                        System.out.print(palabras15[i]);
                        if (i < palabras15.length - 1) {
                            System.out.print("-");
                        }
                    }
                    // Salto de línea estético
                    System.out.println();
                    // Hay que poner break para no ejecutar el default
                    break;

                case 16:
                    // Mostrar cuántas letras, números y otros símbolos hay
                    // Pide una frase y clasifica sus caracteres usando:
                    // Character.isLetter()
                    // Character.isDigit()
                    // else → otros
                    // Muestra el total de cada tipo.
                    System.out.println("Introduzca una palabra o una frase: ");
                    String palabra16 = scanner.nextLine();
                    char palabras16[] = palabra16.toCharArray();
                    int contadorLetras16 = 0;
                    int contadorNumeros16 = 0;
                    int contadorOtros16 = 0;
                    int contadorEspacios16 = 0;
                    for (int i = 0; i < palabras16.length; i++) {
                        if (Character.isLetter(palabras16[i])) {
                            contadorLetras16++;
                        } else if (Character.isDigit(palabras16[i])) {
                            contadorNumeros16++;
                        } else if (palabras16[i] == ' ') {
                            contadorEspacios16++;
                        } else {
                            contadorOtros16++;
                        }
                    }
                    System.out.println("---CONTADORES---");
                    System.out.println("Contador de letras: " + contadorLetras16);
                    System.out.println("Contador de dígitos: " + contadorNumeros16);
                    System.out.println("Contador de espacios en blanco: " + contadorEspacios16);
                    System.out.println("Contador de símbolos: " + contadorOtros16);
                    // Hay que poner break para no ejecutar el default
                    break;

                case 17:
                    // Normalizar espacios
                    // Pide una frase con espacios extra:
                    // Ejemplo: "Hola que tal"
                    // Debes reducirla a:
                    // "Hola que tal"
                    System.out.println("Introduzca una frase: ");
                    String frase17 = scanner.nextLine();
                    // El trim() quita los espacios de los lados
                    System.out.println(frase17.trim().replaceAll("\\s+", " "));
                    // Hay que poner break para no ejecutar el default
                    break;

                case 18:
                    // Convertir una frase a “alternativa”
                    // Ejemplo:
                    // Entrada: "programar en java"
                    // Salida: "PrOgRaMaR En JaVa"
                    // Alterna mayúsculas/minúsculas según posición.
                    System.out.println("Introduzca una frase: ");
                    String frase18 = scanner.nextLine();
                    for (int i = 0; i < frase18.length(); i++) {
                        char c18 = frase18.charAt(i);
                        if (i % 2 == 0) {
                            System.out.print(Character.toUpperCase(c18));
                        } else {
                            System.out.print(Character.toLowerCase(c18));
                        }
                    }
                    // Salto de línea estético
                    System.out.println();
                    // Hay que poner break para no ejecutar el default
                    break;

                case 19:
                    // Crear un acrónimo
                    // Pide una frase y genera su acrónimo:
                    // Ejemplo:
                    // "Formación Profesional Dual" → "FPD"
                    // Tomando la primera letra de cada palabra y pasándola a mayúsculas.
                    System.out.println("Introduzca una frase para crear su acrónimo: ");
                    String frase19 = scanner.nextLine();
                    String aux19 = frase19.trim().replaceAll("\\s+", " ");
                    char frases19[] = aux19.toCharArray();
                    System.out.print(Character.toUpperCase(frases19[0]));
                    for (int i = 1; i < frases19.length; i++) {
                        if (frases19[i] == ' ') {
                            System.out.print(Character.toUpperCase(frases19[i + 1]));
                        }
                    }
                    // Salto de línea estético
                    System.out.println();
                    // Hay que poner break para no ejecutar el default
                    break;

                case 20:
                    // Eliminar todas las vocales de una cadena
                    // Pide una frase y elimina las vocales usando Character.toLowerCase() para
                    // comparar.
                    // Debe usarse un StringBuilder para reconstruir resultado.
                    System.out.println("Introduce una palabra o una frase: ");
                    String frase20 = scanner.nextLine();

                    // Creamos el String builder
                    StringBuilder sb20 = new StringBuilder();

                    for (int i = 0; i < frase20.length(); i++) {
                        char original = frase20.charAt(i);
                        char c20 = Character.toLowerCase(original);
                        if (c20 != 'a' && c20 != 'e' && c20 != 'i' && c20 != 'o' && c20 != 'u' && c20 != 'á'
                                && c20 != 'é' && c20 != 'í' && c20 != 'ó' && c20 != 'ú') {
                            sb20.append(original);
                        }
                    }
                    System.out.println("Frase sin vocales: " + sb20.toString());
                    // Hay que poner break para no ejecutar el default
                    break;

                case 0:
                    System.out.println("Saliendo..");
                    // Hay que poner break para no ejecutar el default
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}