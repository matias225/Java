package archivos;

import java.io.File; // input/output
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    static void main(String[] args) throws IOException {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe");
            } else {
                // Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                // Se guarda el archivo a disco duro
                salida.close();
                System.out.println("El archivo se ha creado");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
