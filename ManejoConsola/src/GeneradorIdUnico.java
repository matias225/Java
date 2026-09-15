import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    static void main(String[] args) {
        System.out.println("*** Sistema Generador de Id Único ***");
        var consola = new Scanner(System.in);
        // Generar un número aleatorio de 4 digitos (entre 1 y 9999)
        var random = new Random();
        var numeroAleatorio = random.nextInt(1, 10000);

        // Formatear si es menor a 4 se completa con 0 a la izquierda
        var numeroAleatorioFormateado = String.format("%04d", numeroAleatorio);

        // Pedir nombre, apellido y fecha de nacimiento
        System.out.print("Ingrese su nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingrese su apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingrese su año de nacimiento (YYYY): ");
        var anioNacimiento = consola.nextLine();

        // Formateamos los datos
        var nombreModificado = nombre.trim().substring(0, 2).toUpperCase();
        var apellidoModificado = apellido.trim().substring(0, 2).toUpperCase();
        var anioModificado = anioNacimiento.trim().substring(2);
        var idUnico = nombreModificado + apellidoModificado + anioModificado + numeroAleatorioFormateado;
        System.out.printf("""
                \nHola %s,
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                \t¡Felicidades!
                """, nombre.trim(), idUnico);
    }
}
