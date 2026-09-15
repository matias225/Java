import java.sql.SQLOutput;
import java.util.Scanner;

public class RecetasCocina {
    static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la receta: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingrese los ingredientes: ");
        var ingredientes = consola.nextLine();
        System.out.print("Ingrese el tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese la dificultad: ");
        var dificultadReceta = consola.nextLine();

        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("Nombre receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("Dificultad: " + dificultadReceta);
    }
}
