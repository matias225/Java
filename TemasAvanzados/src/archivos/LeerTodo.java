package archivos;

import java.nio.file.Files; // New Input Output
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        try {
            // Leer todas las lineas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("Contenido del archivo: ");
            //for (String linea : lineas)
            //    System.out.println(linea);
            lineas.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("Error al leer archivo: "+e.getMessage());
        }
    }
}
