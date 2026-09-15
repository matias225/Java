public class DetalleLibro {
    static void main(String[] args) {
        // Detalle de un Libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 36270.99;

        // Imprimir los valores
        System.out.println("Título del libro: " + tituloLibro);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("¿Está disponible?: " + libroDisponible);
        System.out.println("Precio: $ " + precio);

        tituloLibro = "El Señor de los Anillos";
        System.out.println("Título del libro modificado: " + tituloLibro);
    }
}
