import java.util.Scanner;

public class ValidacionPassword {
    static void main(String[] args) {
        System.out.println("*** Validación Contraseña ***");
        var LONGITUD_MIN_PASS = 6;
        var consola = new Scanner(System.in);
        var salir = false;
        var password = "";

        while(!salir) {
            System.out.print("Ingrese una contraseña (de al menos 6 caracteres): ");
            password = consola.nextLine();

            // Validación
            if (password.length() >= LONGITUD_MIN_PASS) {
                System.out.println("Contraseña válida");
                salir = true;
            } else
                System.out.println("La contraseña es muy corta, ingrese una con 6 o más caracteres");
        }
    }
}
