import java.io.File;

class ExampleFile05 {
    public static void main(String[] args) {
        // creación de un objeto fichero en la ubicación actual
        File file = new File("newFile.txt");
        try {
            boolean value = file.createNewFile(); // crea el fichero
            if (value) {
                System.out.println("Fichero creado.");
            } else {
                    System.out.println("Fichero ya existe");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}