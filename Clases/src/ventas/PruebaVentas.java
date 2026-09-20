package ventas;

public class PruebaVentas {
    static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        var producto1 = new Producto("Blusa", 30.00);
        // System.out.println(producto1);
        var producto2 = new Producto("Zapatos", 50.00);
        // System.out.println(producto2);
        // Primer orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);
        // Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Remera", 20.00));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        System.out.println(orden2);
    }
}
