import java.util.Scanner;

public class SistemaAutenticacionV2Switch {
    static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación v2 (con Switch) ***");

        final var USUARIO_VALIDO = "admin";
        final var CONTRASENIA = "123";

        var consola = new Scanner(System.in);
        System.out.print("Ingrese el usuario: ");
        var usuarioIngresado = consola.nextLine().strip();
        System.out.print("Ingrese la contresaña: ");
        var contraseniaIngresada = consola.nextLine().strip();

        var mensajeRespuesta = switch (usuarioIngresado) {
           case USUARIO_VALIDO -> {
               if (CONTRASENIA.equals(contraseniaIngresada))
                   yield "Bienvenido al sistema.";
               else
                   yield "Contraseña incorrecta.";
           }
           default -> {
               if (CONTRASENIA.equals(contraseniaIngresada))
                   yield "Usuario no existente.";
               else
                   yield "Usuario y contraseña incorrectos.";
           }
        };

        System.out.println(mensajeRespuesta);
    }
}
