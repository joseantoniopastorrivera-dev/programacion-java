//Autor: JAPR
//Fecha: 13/Feb/2026
//Clase TestQuiniela

import java.util.Scanner;

public class TestQuiniela {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // PRUEBAS DE CONSTRUCTORES
        System.out.println("---PRUEBAS DE CONSTRUCTORES---");
        // Prueba de constructor vacío
        Quiniela q1 = new Quiniela();
        System.out.println("\n[Quiniela 1] creada vacía.");
        // Comprobamos que java ha creado los arrays vacíos con la longitud adecuada.
        System.out.println("Huecos para partidos: " + q1.getPartido().length);
        System.out.println("Huecos para apuestas: " + q1.getApuesta().length);

        // Prueba de constructor con parámetros
        String[] listaPartidos = new String[15];
        listaPartidos[0] = "Real Madrid - FC Barcelona";
        listaPartidos[1] = "Atlético de Madrid - Real Valladolid";
        listaPartidos[2] = "Sevilla FC - Valencia FC";

        char[] listaApuestas = new char[15];
        listaApuestas[0] = '1';
        listaApuestas[1] = 'X';
        listaApuestas[2] = '2';

        // Creamos la quiniela pasándole estas listas
        Quiniela q2 = new Quiniela(listaPartidos, listaApuestas);
        System.out.println("\n[Quiniela 2] creada con datos.");
        // Comprobamos si ha guardado bien la información usando los Getters
        System.out.println("El partido 1 es: " + q2.getPartido()[0]);
        System.out.println("Su apuesta es: " + q2.getApuesta()[0]);
        System.out.println("El partido 2 es: " + q2.getPartido()[1]);
        System.out.println("Su apuesta es: " + q2.getApuesta()[1]);
        System.out.println("El partido 3 es: " + q2.getPartido()[2]);
        System.out.println("Su apuesta es: " + q2.getApuesta()[2]);

        // Pruebas de pedirPartidos
        Quiniela miQuiniela = new Quiniela();
        // Pedimos los partidos(Te pedirá escribir 15 veces)
        miQuiniela.pedirPartidos();

        // Pruebas de mostrarPartidos
        miQuiniela.mostrarPartidos();

        // Pruebas de pedirApuestas
        miQuiniela.pedirApuestas();

        // Pruebas de mostrarPartidosyApuestas
        miQuiniela.mostrarPartidosyApuestas();

        // Pruebas de generarApuestasAleatorias
        System.out.println("\n--PRUEBA MÁQUINA ALEATORIA--");
        Quiniela quinielaAutomatica = new Quiniela();
        // Pedimos los partidos por teclado
        quinielaAutomatica.pedirPartidos();
        // Generamos las apuestas de forma aleatoria
        quinielaAutomatica.generarApuestasAleatorias();
        // Mostramos los resultados
        quinielaAutomatica.mostrarPartidosyApuestas();

        // Pruebas copiarPartidos
        System.out.println("\n--PRUEBAS DE COPIA--");
        Quiniela quinielaVacia = new Quiniela();
        System.out.println("Copiando partidos desde otra quiniela...");
        quinielaVacia.copiarPartidos(quinielaAutomatica);
        quinielaVacia.mostrarPartidos();

        // Pruebas copiarPartidos
        System.out.println("\nIntentando copiar un array de tamaño incorrecto..");
        // Creamos un array trampa con 5 huecos para que salte error
        String[] arrayTrampa = new String[5];
        arrayTrampa[0] = "Rayo Vallecano - Club Argentinos";
        quinielaVacia.copiarPartidos(arrayTrampa);

        // Pruebas de copiarApuestas
        System.out.println("\n--PRUEBAS DE COPIA DE APUESTAS--");
        // Creamos una quiniela de prueba
        Quiniela quinielaPruebaApuestas = new Quiniela();
        // Copiamos los partidos desde la automática
        quinielaPruebaApuestas.copiarPartidos(quinielaAutomatica);
        // Resultados
        System.out.println("Copiando apuestas desde la quiniela automática..");
        quinielaPruebaApuestas.copiarApuestas(quinielaAutomatica);
        quinielaPruebaApuestas.mostrarPartidosyApuestas();

        // Prueba copiarApuestas
        // Caso 1. Longitud del array correcta
        System.out.println("Intentando copiar un array de apuestas con todo '1'..");
        int tamano = quinielaPruebaApuestas.getApuesta().length;
        char[] misApuestasArray = new char[tamano];
        for (int i = 0; i < tamano; i++) {
            misApuestasArray[i] = '1';
        }
        quinielaPruebaApuestas.copiarApuestas(misApuestasArray);
        quinielaPruebaApuestas.mostrarPartidosyApuestas();
        // caso 2. Longitud del array incorrecta
        System.out.println("Intentando copiar un array con longitud incorrecta...");
        char[] arrayApuestasTrampa = { '1', 'X' };
        quinielaPruebaApuestas.copiarApuestas(arrayApuestasTrampa);

        // Pruebas comprobarAciertos
        System.out.println("\n---JORNADA DE FÚTBOL---");
        // Creamos la quinielaResultados
        Quiniela quinielaResultados = new Quiniela();
        // Copiamos partidos de la random
        quinielaResultados.copiarPartidos(quinielaAutomatica);
        // Generamos apuestas random
        quinielaResultados.generarApuestasAleatorias();
        // Imprimimos los resultados oficiales
        System.out.println("\n---RESULTADOS OFICIALES---");
        quinielaResultados.mostrarPartidosyApuestas();
        // Creamos una apuesta personal para verificar cuantas hemos acertado
        Quiniela miQuiniela2 = new Quiniela();
        // Copiamos los partidos de la oficial
        miQuiniela2.copiarPartidos(quinielaResultados);
        // Generamos resultados random
        miQuiniela2.generarApuestasAleatorias();
        // Mostramos nuestra apuesta personal
        miQuiniela2.mostrarPartidosyApuestas();
        // Comprobamos cuantos aciertos tenemos
        int misAciertos = miQuiniela2.comprobarApuestas(quinielaResultados);
        System.out.println("\nHas obtenido " + misAciertos + " aciertos.");

        scanner.close();

    }
}