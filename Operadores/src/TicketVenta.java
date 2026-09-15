import java.util.Scanner;

public class TicketVenta {
    static void main(String[] args) {
        System.out.println("*** Generación Ticket de Venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio tomate: ");
        var precioTomate = Double.parseDouble(consola.nextLine());

        System.out.print("Precio banana: ");
        var precioBanana = Double.parseDouble(consola.nextLine());

        System.out.print("¿Aplicar descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Cálculo del subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioBanana + precioTomate;

        // Aplicar el descuento
        var descuento = subtotal * (descuentoPorcentaje/100.0);

        // Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

        // Cálculo con impuestos (21%)
        var impuesto = subtotalConDescuento * .21;

        // Cálculo total de la compra (con impuestos)
        // var costoTotalCompra = impuesto + subtotal;
        // o directamente
        var costoTotalCompra = subtotalConDescuento * 1.21;

        // Imprimir el ticket
        System.out.printf("""
                %n         Ticket de venta
                ____________________________________
                Subtotal:                   $%.2f
                Descuento:              $%.2f (%d%%)
                Impuesto (21%%):             $%.2f
                ____________________________________
                Total de la compra:         $%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, costoTotalCompra);
    }
}
