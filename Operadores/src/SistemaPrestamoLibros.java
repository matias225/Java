import java.util.Scanner;

public class SistemaPrestamoLibros {
    static void main(String[] args) {
        System.out.println("*** Sistema de Prestamo Libros ***");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuentas con credencial de estudiantes? (true/false) ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿A cuántos kilometros vives de la biblioteca? ");
        var distanciaBibliotecaKm = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tienesCredencial || distanciaBibliotecaKm <= DISTANCIA_PERMITIDA_KM;
        System.out.println("¿Puede pedir un prestamo? " + esElegiblePrestamo);
    }
}
