import java.util.Scanner;

public class ReservaHotel {
    static void main(String[] args) {
        System.out.println("Sistema Reserva de Hotel");
        final var TARIFA_DIARIA_SIN_VISTA = 150.50;
        final var TARIFA_DIARIA_CON_VISTA = 190.50;

        var consola = new Scanner(System.in);
        System.out.print("Nombre del cliente: ");
        var nombreCliente = consola.nextLine();

        System.out.print("Días de estadía: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("¿Tiene vista al mar? (Si/No) ");
        var vistaAlMarTexto = consola.nextLine();
        var vistaAlMarBoolean = vistaAlMarTexto.strip().equalsIgnoreCase("si");
        vistaAlMarTexto = vistaAlMarBoolean ? "Si :)" : "No :(";

        // Cálculos
        var costoVista = vistaAlMarBoolean ? TARIFA_DIARIA_CON_VISTA : TARIFA_DIARIA_SIN_VISTA;
        var costoTotal = costoVista * diasEstadia;

        // Mostrar la información
        System.out.printf("""
                %n------- Detalles de la Reservación -------
                Nombre del cliente: %s
                Días de estadía: %d
                Costo total: %.2f
                Habitación con vista al mar: %s
                """, nombreCliente, diasEstadia, costoTotal, vistaAlMarTexto);
    }
}
