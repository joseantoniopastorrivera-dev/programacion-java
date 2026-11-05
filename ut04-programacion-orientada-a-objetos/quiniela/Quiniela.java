//Autor: JAPR
//Fecha: 13/Feb/2026
//Clase Quiniela

import java.util.Scanner;

public class Quiniela {

    // ATRIBUTOS
    // Usamos final para indicar que este número NUNCA va a cambiar
    private final int NUMERO_PARTIDOS = 15;
    // Arrays para guardar las listas de partidos y las apuestas
    private String[] partido;
    private char[] apuesta;

    // CONSTRUCTORES
    // a)Constructor sin parámetros
    public Quiniela() {
        this.partido = new String[NUMERO_PARTIDOS];
        this.apuesta = new char[NUMERO_PARTIDOS];
    }

    // b)Constructor con parámetros de fuera
    public Quiniela(String[] partido, char[] apuesta) {
        this.partido = partido;
        this.apuesta = apuesta;
    }

    // GETTERS Y SETTERS
    public String[] getPartido() {
        return partido;
    }

    public void setPartido(String[] partido) {
        this.partido = partido;
    }

    public char[] getApuesta() {
        return apuesta;
    }

    public void setApuesta(char[] apuesta) {
        this.apuesta = apuesta;
    }

    // MÉTODOS
    // Método pedirPartidos
    // Pide los emparejamientos uno a uno
    public void pedirPartidos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n--Introduzca los 15 emparejamientos--");
        for (int i = 0; i < this.NUMERO_PARTIDOS; i++) {
            System.out.println("Introduzca el emparejamiento " + (i + 1) + ": ");
            this.partido[i] = entrada.nextLine();
        }
        // No cerramos el scanner (entrada.close()) aquí dentro
        // porque nos daría problemas al usarlo en otros métodos después.
    }

    // Método mostrarPartidos
    // Muestra por pantalla los emparejamientos contenidos en el Array
    public void mostrarPartidos() {
        System.out.println("\n---LISTA DE PARTIDOS---");
        for (int i = 0; i < this.NUMERO_PARTIDOS; i++) {
            System.out.println("Emparejamiento " + (i + 1) + ": " + this.partido[i]);
        }
    }

    // Método pedirApuestas
    // Muestra cada emparejamiento y pide la apuesta [1, X, 2]
    public void pedirApuestas() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("--Introduzca sus apuestas (1, X, 2)--");
        for (int i = 0; i < this.NUMERO_PARTIDOS; i++) {
            System.out.println("Partido " + (i + 1) + ": " + this.partido[i] + " -> Apuesta: ");
            this.apuesta[i] = entrada.next().toUpperCase().charAt(0);
        }
    }

    // Método mostrarPartidosyApuestas
    public void mostrarPartidosyApuestas() {
        System.out.println("\n---BOLETO DE LA QUINIELA---");
        for (int i = 0; i < this.NUMERO_PARTIDOS; i++) {
            System.out.println("Partido " + (i + 1) + ": " + this.partido[i] + " -> Apuesta: " + (this.apuesta[i]));
        }
    }

    // Método generarApuestasAleatorias
    public void generarApuestasAleatorias() {
        // Creamos el objeto 'Random' para generar números
        java.util.Random generador = new java.util.Random();
        System.out.println("---GENERANDO APUESTAS ALEATORIAS---");
        for (int i = 0; i < this.NUMERO_PARTIDOS; i++) {
            int numeroAlAzar = generador.nextInt(3);
            if (numeroAlAzar == 0) {
                this.apuesta[i] = '1';
            } else if (numeroAlAzar == 1) {
                this.apuesta[i] = 'X';
            } else {
                this.apuesta[i] = '2';
            }
        }
        System.out.println("Apuestas generadas con éxito.");
    }

    // Método copiarPartidos
    public void copiarPartidos(Quiniela otraQuiniela) {
        for (int i = 0; i < this.NUMERO_PARTIDOS; i++) {
            this.partido[i] = otraQuiniela.getPartido()[i];
        }
        System.out.println("Partidos copiados desde otra quiniela con éxito.");
    }

    // Método copiarPartidos
    public void copiarPartidos(String[] arrayPartidos) {
        // Verificamos que midan lo mismo
        if (arrayPartidos.length == this.NUMERO_PARTIDOS) {
            for (int i = 0; i < this.NUMERO_PARTIDOS; i++) {
                this.partido[i] = arrayPartidos[i];
            }
            System.out.println("Partidos copiados con éxito desde el array.");
        } else {
            System.out.println("ERROR, el array recibido tiene distinta longitud (" + arrayPartidos.length
                    + ") que la quiniela (" + this.NUMERO_PARTIDOS + "). No se copia nada");
        }
    }

    // Método copiarApuestas
    public void copiarApuestas(Quiniela otraQuiniela) {
        for (int i = 0; i < this.NUMERO_PARTIDOS; i++) {
            this.apuesta[i] = otraQuiniela.getApuesta()[i];
        }
    }

    // Método copiarApuestas(Recibiendo un array char)
    public void copiarApuestas(char[] arrayApuestas) {
        if (arrayApuestas.length == this.NUMERO_PARTIDOS) {
            for (int i = 0; i < this.NUMERO_PARTIDOS; i++) {
                this.apuesta[i] = arrayApuestas[i];
            }
        } else {
            System.out.println("ERROR, la longitud del array de apuestas recibido(" + arrayApuestas.length
                    + ") es distinta que la quiniela(" + this.NUMERO_PARTIDOS + ").");
        }
    }

    // Método comprobarApuestas
    // Compara nuestras apuestas con las de la quiniela oficial
    public int comprobarApuestas(Quiniela quinielaResultados) {
        int aciertos = 0;
        for (int i = 0; i < this.NUMERO_PARTIDOS; i++) {
            if (this.apuesta[i] == quinielaResultados.getApuesta()[i]) {
                aciertos++;
            }
        }
        return aciertos;
    }

}
