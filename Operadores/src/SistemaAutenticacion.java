import java.util.Scanner;

public class SistemaAutenticacion {
    static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");
        final var USUARIO = "matias225";
        final var PASSWORD = "123456";

        // Obtener los datos
        var consola = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        var usuarioIngresado = consola.nextLine();
        System.out.print("Ingrese su contraseña: ");
        var contraseniaIngresada = consola.nextLine();

        // Verificar si son verdaderos
        var datosCorrectos = (contraseniaIngresada.equals(PASSWORD)) && (usuarioIngresado.equals(USUARIO));
        System.out.println("¿Datos correctos? " + datosCorrectos);
    }
}
