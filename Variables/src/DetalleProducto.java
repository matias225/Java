public class DetalleProducto {
    static void main(String[] args) {
        String nombreProducto = "Coca-Cola";
        double precio = 5399.99;
        int cantidadDisponible = 10;
        boolean disponibleVenta = true;
        // Imprimir valores
        System.out.println("**** Tienda en Linea ****");
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);

        // Modificar
        nombreProducto = "Sprite";
        precio = 5300.50;
        cantidadDisponible = 0;
        disponibleVenta = false;
        System.out.println("\nnombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);
    }
}
