import java.util.Scanner;

public class AplicacionSaludFitness {
    static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");

        // Constantes
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        // Pedimos los valores al usuario
        var consola = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        var nombreUsuario = consola.nextLine();
        System.out.print("Ingrese cuantos pasos camino hoy: ");
        var pasosCaminados = Integer.parseInt(consola.nextLine());

        // Verificar si el usuario alcanzó la meta de pasos diarios
        var metaAlcanzada = pasosCaminados >= META_PASOS_DIARIO ? "Si :)" : "No :(";

        // Calculamos las calorias quemados
        var caloriasQuemadas = pasosCaminados * CALORIAS_POR_PASO;

        // Mostramos la información
        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d pasos
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzada: %s
                ____________________________________
                La meta de pasos diarios es de: %d pasos
                """, nombreUsuario, pasosCaminados, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIO);
    }
}
