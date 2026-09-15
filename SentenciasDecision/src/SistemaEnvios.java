import java.util.Scanner;

public class SistemaEnvios {
    static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");
        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;

        var consola = new Scanner(System.in);
        System.out.print("Ingrese destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine().strip();
        System.out.print("Ingrese el peso del paquete (en kg): ");
        var pesoPaquete = Double.parseDouble(consola.nextLine());
        var costoEnvio = 0.0;

        if (destino.equalsIgnoreCase("nacional"))
            costoEnvio = TARIFA_NACIONAL * pesoPaquete;
        else if (destino.equalsIgnoreCase("internacional"))
            costoEnvio = TARIFA_INTERNACIONAL * pesoPaquete;
        else
            System.out.println("Destino incorrecto. Ingrese si es nacional o internacional.");

        if (costoEnvio != 0.0)
           System.out.printf("El costo del envío es de: $%.2f", costoEnvio);
    }
}
