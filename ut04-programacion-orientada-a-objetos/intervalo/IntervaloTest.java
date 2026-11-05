//Autor: JAPR
//Fecha: 05/Feb/2026
//Clase IntervaloTest.java

import java.util.Scanner;

public class IntervaloTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---PRUEBAS DE CONSTRUCTORES---");

        // Prueba de constructor vacío
        Intervalo i1 = new Intervalo();
        System.out.println("Intervalo 1(vacío): " + i1);

        // Prueba de constructor dos valores
        Intervalo i2 = new Intervalo(5.5, 10);
        System.out.println("Intervalo 2(dos valores): " + i2);

        // Prueba de constructor con un solo valor para máximo
        Intervalo i3 = new Intervalo(7);
        System.out.println("Intervalo 3(sólo máx): " + i3);

        // Prueba de constructor por parámetro tipo intervalo
        Intervalo i4 = new Intervalo(i2);
        System.out.println("Intervalo 4(copia de i2): " + i4);

        // PARTE 2
        System.out.println("---PRUEBAS DE MÉTODOS(Parte 2)");
        // Prueba método válido
        Intervalo i5 = new Intervalo(10, 15);
        System.out.println("Intervalo original: " + i5);

        System.out.println("¿Es válido el intervalo?: " + i5.valido());

        // Prueba método longitud
        System.out.println("Longitud: " + i5.longitud());

        // Prueba método puntoMedio
        System.out.println("Punto medio: " + i5.puntoMedio());

        // Prueba método desplazar
        i5.desplazar(5);
        System.out.println("Intervalo desplazado (+5): " + i5);

        // Prueba método copia
        System.out.println("Intervalo copia: " + i5.copia());

        // Prueba método iguales
        System.out.println("¿Son iguales el Intervalo 1 y el Intervalo 5? " + i5.iguales(i1));

        // Prueba método incluye
        System.out.println("¿Incluye el 13.0? " + i5.incluye(13));
        System.out.println("¿Incluye el 17.22? " + i5.incluye(17.22));

        // Prueba método incluye intervalo
        Intervalo i6 = new Intervalo(16, 19);
        System.out.println("¿Se incluye i6: " + i6 + " en i5: " + i5 + " ?: " + i5.incluyeIntervalo(i6));
        System.out.println("¿Se incluye i1: " + i1 + " en i5: " + i5 + " ?: " + i5.incluyeIntervalo(i1));

        // PRUEBAS SEGUNDA PARTE
        // Prueba troceado
        System.out.println("\n---PRUEBAS AVANZADAS---");
        Intervalo original = new Intervalo(10, 15);
        System.out.println("ORIGINAL: " + original);
        System.out.println("Introduzca el número de partes en las que desea trocear: ");
        int partes = scanner.nextInt();
        Intervalo[] resultado = original.troceado(partes);
        for (int i = 0; i < partes; i++) {
            System.out.println("TROZO (" + (i + 1) + " partes): " + resultado[i]);
        }

        // Pruebas escalar
        System.out.println("ORIGINAL: " + original);
        System.out.println("Introduzca el parámetro por el cual desea multiplicar la longitud: ");
        double parametro = scanner.nextDouble();
        original.escalar(parametro);
        System.out.println("ESCALADO (x" + parametro + ": " + original);

        // Pruebas desplazado
        System.out.println("Indique el desplazamiento: ");
        double desplazamiento = scanner.nextDouble();
        Intervalo movido = original.desplazado(desplazamiento);
        System.out.println("ORIGINAL: " + original);
        System.out.println("DESPLAZADO(+" + desplazamiento + "): " + movido);

        // Prueba de intersección
        System.out.println("\n---PRUEBAS DE INTERSECCIÓN---");
        Intervalo intA = new Intervalo(10, 20);
        Intervalo intB = new Intervalo(15, 25);
        Intervalo intC = new Intervalo(30, 40);
        Intervalo intD = new Intervalo(0, 11);

        System.out.println("Intervalo A: " + intA);
        System.out.println("Intervalo B: " + intB);
        System.out.println("Intervalo C: " + intC);
        System.out.println("Intervalo D: " + intD);

        Intervalo choqueAB = intA.interseccion(intB);
        System.out.println("Intersección A y B: " + choqueAB);
        Intervalo choqueAC = intA.interseccion(intC);
        System.out.println("Intersección A y C: " + choqueAC);
        Intervalo choqueAD = intA.interseccion(intD);
        System.out.println("Intersección A y D: " + choqueAD);
        Intervalo choqueBC = intB.interseccion(intC);
        System.out.println("Intersección B y C: " + choqueBC);
        Intervalo choqueBD = intB.interseccion(intD);
        System.out.println("Intersección B y D: " + choqueBD);
        Intervalo choqueCD = intC.interseccion(intD);
        System.out.println("Intersección C y D: " + choqueCD);

        // Pruebas de simétrico
        System.out.println("---PRUEBAS DE SIMÉTRICO---");
        Intervalo intE = new Intervalo(0, 10);
        System.out.println("Intervalo E: " + intE);
        System.out.println("Simétrico de E: " + intE.simetrico());
        System.out.println("Intervalo A: " + intA);
        System.out.println("Simétrico de A: " + intA.simetrico());
        System.out.println("Intersección de A y B: " + choqueAB);
        System.out.println("Simétrico de intersección de A y B: " + choqueAB.simetrico());

        scanner.close();
    }

}
