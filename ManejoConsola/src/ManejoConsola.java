import java.util.Scanner;

public class ManejoConsola {
    static void main(String[] args) {
        // Introducir valores por consola
        var consola = new Scanner(System.in); // in - input - entrada de datos
        System.out.print("Ingrese su nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Texto ingresado: " + nombre);
    }
}
