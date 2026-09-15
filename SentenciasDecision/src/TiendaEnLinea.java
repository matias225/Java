import java.util.Scanner;

public class TiendaEnLinea {
    static void main(String[] args) {
        System.out.println("*** Tiendo en Línea con Descuentos ***");
        final var MONTO_MINIMO_DESCUENTO = 1000;
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el monto de su compra: ");
        var montoComprado = Double.parseDouble(consola.nextLine());
        System.out.print("¿Es miembro? (Si/No) ");
        var esMiembro = consola.nextLine();
        var descuento = 0.0;

        // Verificamos cada caso, con los datos proporcionados
        if (esMiembro.strip().equalsIgnoreCase("si") && montoComprado >= MONTO_MINIMO_DESCUENTO) {
            // $1000 y mimbro, descuento de 10%
            descuento = 0.1;
            System.out.println("\nFelicidades, has obtenido un descuento de 10%" );
        } else if (esMiembro.equalsIgnoreCase("si")) {
            // Solo miembro 5%
            descuento = 0.05;
            System.out.println("\nFelicidades, has obtenido un descuento de 5%");
        } else {
            // ni miembro, ni gasto 1000 0%
            descuento = 0;
            System.out.println("\nSin descuento");
        }

        if (descuento != 0) {
            var montoDescuento = montoComprado * descuento;
            var montoFinal = montoComprado - montoDescuento;
            System.out.printf("""
            Monto de la compra: $%.2f
            Monto del descuento: $%.2f%%
            Monto final de la compra con descuento: $%.2f
            """, montoComprado, montoDescuento, montoFinal);
        } else {
            System.out.printf("""
            Te invitamos a que te hagas miembro de la tienda
            Monto de la compra: $%.2f
            """, montoComprado);
        }
    }
}
