//Autor: JAPR
//Fecha: 05/Feb/2026
//Clase Intervalo.java

public class Intervalo {

    // 1.Atributos
    private double maximo;
    private double minimo;

    // 2.Constructor(A.-Vacío, inicializa en cero)
    public Intervalo() {
        this.maximo = 0;
        this.minimo = 0;
    }

    // 3.Getters
    public double getMaximo() {
        return maximo;
    }

    public void setMaximo(double maximo) {
        this.maximo = maximo;
    }

    public double getMinimo() {
        return minimo;
    }

    public void setMinimo(double minimo) {
        this.minimo = minimo;
    }

    // B.-DOS VALORES TIPO DOUBLE. Constructor método 'valido' para verificar que el
    // mínimo es menor que el máximo
    public Intervalo(double minimo, double maximo) {
        if (minimo <= maximo) {
            this.minimo = minimo;
            this.maximo = maximo;
        } else {
            System.out.println("ERROR, el mínimo no puede ser más grande que el máximo.");
            this.minimo = 0;
            this.maximo = 0;
        }
    }

    // C.-UN VALOR TIPO DOUBLE QUE ES EL MÁXIMO Y MÍNIMO A 0
    public Intervalo(double maximo) {
        this.minimo = 0;
        this.maximo = maximo;
    }

    // D.-UN SOLO PARÁMETRO TIPO INTERVALO
    public Intervalo(Intervalo otroIntervalo) {
        this.maximo = otroIntervalo.maximo;
        this.minimo = otroIntervalo.minimo;
    }

    // Override para que se vea bonito
    @Override
    public String toString() {
        return "[" + this.minimo + ", " + this.maximo + "]";
    }

    // MÉTODOS DE EJERCICIOS 2
    // Método valido. Comprueba que min <= max
    public boolean valido() {
        return this.minimo <= this.maximo;
    }

    // Método longitud. Distancia entre puntos
    public double longitud() {
        return this.maximo - this.minimo;
    }

    // Método punto medio. El centro del intervalo
    public double puntoMedio() {
        return (this.maximo + this.minimo) / 2;
    }

    // Método desplazar. Mueve el intervalo
    public void desplazar(double cantidad) {
        this.maximo = this.maximo + cantidad;
        this.minimo = this.minimo + cantidad;
    }

    // Método copia. Copia el intervalo
    public Intervalo copia() {
        return new Intervalo(this.minimo, this.maximo);
    }

    // Método iguales. Compara si ese intervalo es idéntico a otro
    public boolean iguales(Intervalo otroIntervalo) {
        return this.maximo == otroIntervalo.maximo && this.minimo == otroIntervalo.minimo;
    }

    // Método incluye. Comprueba si el valor está en el intervalo
    public boolean incluye(double punto) {
        return punto >= this.minimo && punto <= this.maximo;
    }

    // Método incluyeIntervalo
    public boolean incluyeIntervalo(Intervalo otroIntervalo) {
        return this.minimo <= otroIntervalo.minimo && this.maximo >= otroIntervalo.maximo;
    }

    // MÉTODOS AVANZADOS
    // Método troceado. Divide el intervalo en trozos iguales
    // Devuelve un array de intervalos
    public Intervalo[] troceado(int partes) {
        // Calculamos el tamaño de cada parte
        double tamanoTrozo = this.longitud() / partes;
        // Creamos el array donde guardaremos las partes
        Intervalo[] resultados = new Intervalo[partes];
        // Vamos creando los trozos en un bucle
        double inicioTrozo = this.minimo;
        for (int i = 0; i < partes; i++) {
            // El fin de este trozo es el inicio+tamaño
            double finTrozo = inicioTrozo + tamanoTrozo;
            // Guardamos el nuevo intervalo en el array
            resultados[i] = new Intervalo(inicioTrozo, finTrozo);
            inicioTrozo = finTrozo;
        }
        return resultados;
    }

    // Método escalar. Multiplica la longitud
    public void escalar(double parametro) {
        // Calculamos la nueva longitud
        double nuevaLongitud = this.longitud() * parametro;
        // Calculamos el punto medio
        double puntoMedio = this.puntoMedio();
        // Calculamos mínimo y máximo usando puntoMedio y nuevaLongitud
        this.minimo = puntoMedio - (nuevaLongitud / 2);
        this.maximo = puntoMedio + (nuevaLongitud / 2);
    }

    // Método desplazado. Igual que desplazar pero devuelve uno nuevo
    public Intervalo desplazado(double cantidad) {
        // Creamos uno nuevo con los valores modificados
        Intervalo nuevo = new Intervalo(this.minimo + cantidad, this.maximo + cantidad);
        return nuevo;
    }

    // Método intersección.
    // Devuelve el tramo común entre dos intervalos. Si no se tocan, devuelve NULL.
    public Intervalo interseccion(Intervalo otroIntervalo) {
        // El inicio de la intersección el es el mínimo más grande
        double inicioComun = Math.max(this.minimo, otroIntervalo.minimo);
        // El final de la intersección es el máximo más pequeño
        double finalComun = Math.min(this.maximo, otroIntervalo.maximo);
        // Si el inicio es menor o igual al fin, es que se tocan
        if (inicioComun <= finalComun) {
            return new Intervalo(inicioComun, finalComun);
        } else {
            // Si no tienen ningún tramo en común, devolvemos NULL
            return null;
        }
    }

    // Método simétrico
    // Devuelve el intervalo "espejo" respecto a su inicio.
    public Intervalo simetrico() {
        // Calculamos la longitud del intervalo a 'espejar'
        double tamano = this.longitud();
        // Calculamos los nuevos mínimo y máximo del intervalo espejo
        double nuevoMaximo = this.minimo;
        double nuevoMinimo = this.minimo - tamano;
        // Devolvemos intervalo espejo
        return new Intervalo(nuevoMinimo, nuevoMaximo);
    }

}
