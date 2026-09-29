package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            // Revisar si existe el archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(nombreArchivo, anexar));
            var nuevoContenido = "Nuevo\ncontenido";
            salida.println(nuevoContenido);
            salida.close();
            System.out.println("Se agrego contenido al archivo...");
        } catch (Exception ex) {
            System.out.println("Error al escribir al archivo: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
