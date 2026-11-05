package examen.controlador;

import examen.dao.VehiculoDAO;
import examen.excepciones.DatoNoValidoException;
import examen.excepciones.VehiculoNoDisponibleException;
import examen.modelo.*;
import examen.utils.Ansi;
import examen.utils.InputReader;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controlador principal de la aplicación Rentacar.
 * Gestiona la lógica de negocio y la insteracción con el usuario.
 */

public class AppController {

    /**
     * Mapa de vehículos, usando el código de vehículo como clave.
     * Permite evitar duplicados y acceder a un vehículo al instante.
     */

    private Map<String, Vehiculo> catalogo;

    /**
     * Lista de alquileres.
     * El acceso se hace de forma secuencial y cronológica, por lo que un ArrayList
     * es ideal.
     */

    private List<Alquiler> registroAlquileres;

    public AppController() {
        this.catalogo = new HashMap<>();
        this.registroAlquileres = new ArrayList<>();
    }

    /**
     * Bucle principal de la aplicación.
     */
    public void iniciar() {
        int opcion = -1;
        do {
            mostrarMenu();
            opcion = InputReader.leerEnteroMinimo("Seleccione una opción: ", 1);

            switch (opcion) {
                case 1:
                    altaVehiculo();
                    break;
                case 2:
                    realizarAlquiler();
                    break;
                case 3:
                    devolverVehiculo();
                    break;
                case 4:
                    mostrarVehiculos();
                    break;
                case 5:
                    mostrarAlquileres();
                    break;
                case 6:
                    exportarVehiculosTXT();
                    break;
                case 7:
                    importarVehiculosBD();
                    break;
                case 8:
                    guardarAlquileresBinario();
                    break;
                case 9:
                    cargarAlquileresBinario();
                    break;
                case 10:
                    System.out.println(Ansi.BLUE + "Saliendo del sistema Rentacar. ¡Hasta pronto!" + Ansi.RESET);

                default:
                    System.out.println(Ansi.RED + "Opción no válida. Intente de nuevo." + Ansi.RESET);
                    break;
            }
        } while (opcion != 10);
    }

    private void mostrarMenu() {
        System.out.println("\n" + Ansi.BLUE + "=== GESTIÓN DE RENTACAR ===" + Ansi.RESET);
        System.out.println("1. Alta de vehículo");
        System.out.println("2. Realizar alquiler");
        System.out.println("3. Devolver vehículo");
        System.out.println("4. Mostrar catálogo de vehículos");
        System.out.println("5. Mostrar registro de alquileres");
        System.out.println("6. Exportar catálogo (TXT)");
        System.out.println("7. Sincronizar catálogo con Base de Datos (MySQL)");
        System.out.println("8. Guardar alquileres (Binario)");
        System.out.println("9. Cargar alquileres (Binario)");
        System.out.println("10. Salir");
    }

    // Métodos de negocio
    // 1. Alta de vehículo.
    private void altaVehiculo() {
        System.out.println(Ansi.BLUE + "---NUEVO VEHÍCULO---" + Ansi.RESET);

        // Expresión regular para el código
        String codigo;
        boolean codigoValido = false;

        do {
            codigo = InputReader.leerCadena("Código (Ej: COC-2024-001): ").toUpperCase();
            if (codigo.matches("^(COC|MOT|FUR)-\\d{4}-\\d{3}$")) {
                if (catalogo.containsKey(codigo)) {
                    System.out.println(Ansi.RED + "El código ya existe en el catálogo." + Ansi.RESET);
                } else {
                    codigoValido = true;
                }
            } else {
                System.out.println(Ansi.RED + "Código no válido. Respete el formato." + Ansi.RESET);
            }
        } while (!codigoValido);

        String marca = InputReader.leerCadena("Marca: ");
        String modelo = InputReader.leerCadena("Modelo: ");
        int anio = InputReader.leerEnteroMinimo("Año de fabricación: ", 1900);
        boolean disponible = InputReader.leerBooleano("¿Está disponible? SI/NO.");

        int tipo = -1;
        boolean tipoValido = false;
        do {
            tipo = InputReader.leerEnteroMinimo("Tipo (1.Coche, 2.Moto, 3.Furgoneta): ", 1);
            if (tipo == 1 || tipo == 2 || tipo == 3) {
                tipoValido = true;
            } else {
                System.out.println(Ansi.RED + "Error: Opción incorrecta. Elija estrictamente 1, 2 o 3." + Ansi.RESET);
            }
        } while (!tipoValido);

        Vehiculo nuevoVehiculo = null;

        if (tipo == 1) {
            String puertas = InputReader.leerCadena("Número de puertas: ");
            String combustible = InputReader.leerCadena("Combustible: ");
            nuevoVehiculo = new Coche(codigo, marca, modelo, anio, disponible, puertas, combustible);
        } else if (tipo == 2) {
            String cilindrada = InputReader.leerCadena("Cilindrada: ");
            String tieneBaul = InputReader.leerBooleano("¿Tiene baúl? (si/no): ") ? "Sí" : "No";
            nuevoVehiculo = new Moto(codigo, marca, modelo, anio, disponible, cilindrada, tieneBaul);
        } else {
            String carga = InputReader.leerCadena("Carga: ");
            String volumen = InputReader.leerCadena("Volumen");
            nuevoVehiculo = new Furgoneta(codigo, marca, modelo, anio, disponible, carga, volumen);
        }

        catalogo.put(codigo, nuevoVehiculo);
        System.out.println(Ansi.GREEN + "Vehículo dado de alta con éxito." + Ansi.RESET);
    }

    // 2.Realizar alquiler.
    private void realizarAlquiler() {
        if (catalogo.isEmpty()) {
            System.out.println(Ansi.RED + "El catálogo está vacío." + Ansi.RESET);
            return;
        }

        mostrarVehiculos();
        String codigo = InputReader.leerCadena("Introduce el código del vehículo a alquilar.".toUpperCase());

        try {
            Vehiculo v = catalogo.get(codigo);
            if (v == null) {
                throw new DatoNoValidoException("No existe ningún vehículo con ese código.");
            }
            if (!v.isDisponible()) {
                throw new VehiculoNoDisponibleException("El vehículo ya está alquilado.");
            }

            String nombre = InputReader.leerCadena("Nombre del cliente: ");
            int dias = InputReader.leerEnteroMinimo("Días de alquiler: ", 1);

            if (dias > v.getDiasMaximos()) {
                throw new DatoNoValidoException("Excede los días máximos para este tipo de vehículo.");
            }

            String idAlquiler = "ALQUILER-" + (registroAlquileres.size() + 1);
            LocalDate fechaInicio = LocalDate.now();
            LocalDate fechaFin = fechaInicio.plusDays(dias);

            Alquiler nuevoAlquiler = new Alquiler(idAlquiler, nombre, v, fechaFin, fechaFin, null);
            registroAlquileres.add(nuevoAlquiler);
            v.setDisponible(false);

            System.out.println(Ansi.GREEN + "Alquiler realizado con éxito: " + Ansi.RESET);

        } catch (DatoNoValidoException | VehiculoNoDisponibleException e) {
            System.out.println(Ansi.RED + "Error: " + e.getMessage() + Ansi.RESET);
        }
    }

    // 3. Devolver vehículo.
    private void devolverVehiculo() {
        String codigo = InputReader.leerCadena("Introduzca el código del vehículo que desea devolver: ");

        boolean encontrado = false;
        int i = 0;

        // Bucle sin break como exige el enunciado
        while (i < registroAlquileres.size() && !encontrado) {
            Alquiler alq = registroAlquileres.get(i);

            if (alq.getVehiculo().getCodigo().equals(codigo) && alq.getEstado().equals("Pendiente")) {
                encontrado = true;
                alq.setFechaRealDevolucion(LocalDate.now());
                alq.getVehiculo().setDisponible(true);

                // Calculo de costes
                double costeBase = alq.getVehiculo().getCosteDiario();
                System.out.println(Ansi.GREEN + "Vehículo devuelto con éxito. Coste base diario: " + costeBase + "€."
                        + Ansi.RESET);
            }
            i++;
        }
        if(!encontrado){
            System.out.println(Ansi.RED+"No se ha encontrado un alquiler pendiente para ese vehículo."+Ansi.RESET);
        }
    }

    // 4.Mostrar catálogo de vehículos.
    private void mostrarVehiculos() {
        if (catalogo.isEmpty()) {
            System.out.println(Ansi.RED + "No hay vehículos en el catálogo." + Ansi.RESET);
        } else {
            System.out.println(Ansi.BLUE + "\n---CATALOGO DE VEHÍCULOS---" + Ansi.RESET);
            for (Vehiculo v : catalogo.values()) {
                String colorEstado = v.isDisponible() ? Ansi.GREEN : Ansi.RED;
                System.out
                        .println(v.toString() + " | Estado: " + colorEstado + (v.isDisponible() ? "Libre" : "Ocupado")+Ansi.RESET);
            }
        }
    }

    // 5.Mostrar registro de alquileres.
    private void mostrarAlquileres() {
        if (registroAlquileres.isEmpty()) {
            System.out.println(Ansi.RED + "No hay alquileres registrados." + Ansi.RESET);
        } else {
            System.out.println("\n" + Ansi.BLUE + "---REGISTRO DE ALQUILERES---");
            for (Alquiler a : registroAlquileres) {
                String color = a.getEstado().equals("Pendiente") ? Ansi.RED : Ansi.GREEN;
                System.out.println(a.getIdAlquiler() + " | Cliente: " + a.getNombreCliente() + " | Vehículo: "
                        + a.getVehiculo().getCodigo() + " | Estado: " + color + a.getEstado());
            }
        }
    }

    // 6.Exportar catálogo a TXT.
    private void exportarVehiculosTXT() {
        File directorio = new File("files");
        if (!directorio.exists()) {
            directorio.mkdirs();
        }

        try (PrintWriter pw = new PrintWriter(new FileWriter("files/vehiculos_exportados.txt"))) {
            pw.println("CODIGO;MARCA;MODELO;AÑO;DISPONIBLE;TIPO;DATO1;DATO2");
            for (Vehiculo v : catalogo.values()) {
                pw.println(v.getCodigo() + ";" + v.getMarca() + ";" + v.getModelo() + ";" + v.getAnio() + ";"
                        + v.isDisponible() + ";" + v.getTipo() + ";" + v.getDato1() + ";" + v.getDato2());
            }
            System.out.println(Ansi.GREEN + "Catálogo exportado a files/vehiculos_exportados.txt" + Ansi.RESET);
        } catch (IOException e) {
            System.out.println(Ansi.RED + "Error al escribir el fichero: " + e.getMessage() + Ansi.RESET);
        }
    }

    // 7. Sincronizar catálogo con Base de Datos.
    private void importarVehiculosBD() {
        VehiculoDAO.importarVehiculosABaseDeDatos(catalogo.values());
    }

    // 8. Guardar alquileres en binario
    private void guardarAlquileresBinario() {
        File directorio = new File("files");
        if (!directorio.exists()) {
            directorio.mkdirs();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("files/alquileres.dat"))) {
            oos.writeObject(registroAlquileres);
            System.out.println(Ansi.GREEN + "Alquileres guardados correctamente en formato binario." + Ansi.RESET);
        } catch (IOException e) {
            System.out.println(Ansi.RED + "Error al guardar el archivo en binario: " + e.getMessage() + Ansi.RESET);
        }
    }

    // 9. Cargar alquileres en binario
    @SuppressWarnings("unchecked")
    private void cargarAlquileresBinario() {
        File file = new File("files/alquileres.dat");
        if (!file.exists()) {
            System.out.println(Ansi.RED + "No existe ningun archivo de alquileres previo." + Ansi.RESET);
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            registroAlquileres = (List<Alquiler>) ois.readObject();
            System.out.println(Ansi.GREEN + "Alquileres cargados en memoria con éxito: " + Ansi.RESET);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(Ansi.RED + "Error al cargar el archivo binario." + e.getMessage() + Ansi.RESET);
        }
    }

}
