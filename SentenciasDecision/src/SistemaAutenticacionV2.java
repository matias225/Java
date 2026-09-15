import java.util.Scanner;

public class SistemaAutenticacionV2 {
    static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación v2 ***");

        final var USUARIO = "admin";
        final var CONTRASENIA = "123";

        var consola = new Scanner(System.in);
        System.out.print("Ingrese el usuario: ");
        var usuarioIngresado = consola.nextLine().strip();
        System.out.print("Ingrese la contresaña: ");
        var contraseniaIngresada = consola.nextLine().strip();

        if (usuarioIngresado.equals(USUARIO) && contraseniaIngresada.equals(CONTRASENIA))
            System.out.println("Bienvenido al sistema.");
        else if (usuarioIngresado.equals(USUARIO))
            System.out.println("Contraseña incorrecta.");
        else if (contraseniaIngresada.equals(CONTRASENIA))
            System.out.println("Usuario no existente.");
        else
            System.out.println("Usuario y contraseña incorrectos.");
    }
}
