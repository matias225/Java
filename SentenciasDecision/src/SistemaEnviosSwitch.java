import java.util.Scanner;

public class SistemaEnviosSwitch {
    static void main(String[] args) {
        System.out.println("*** Sistema de Envíos (con switch ***");
        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;

        var consola = new Scanner(System.in);
        System.out.print("Ingrese destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();
        System.out.print("Ingrese el peso del paquete (en kg): ");
        var pesoPaquete = Double.parseDouble(consola.nextLine());

        Double costoEnvio = switch (destino) {
            case "nacional" -> TARIFA_NACIONAL * pesoPaquete;
            case "internacional" -> TARIFA_INTERNACIONAL * pesoPaquete;
            default -> {
                System.out.println("Destino inválido. Ingrese si es nacional o internacional.");
                yield null;
            }
        };

        if (costoEnvio != null)
           System.out.printf("El costo del envío del paquete es: $%.2f", costoEnvio);
    }
}
