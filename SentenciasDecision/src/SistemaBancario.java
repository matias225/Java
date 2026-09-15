import java.util.Scanner;

public class SistemaBancario {
    static void main(String[] args) {
        System.out.println("*** Bienvenidos al Sistema Bancario ***");

        var consola = new Scanner(System.in);
        System.out.print("¿Deseas salir del sistema (Si/No)? ");
        var salirSistemaTexto = consola.nextLine();
        var salirSistema = salirSistemaTexto.strip().equalsIgnoreCase("si");

        // Verificamos (aplicando una lógica inversa)
        if (!salirSistema) {
            System.out.println("Continuamos dentro del sistema...");
        } else {
            System.out.println("Saliendo del sistema...");
        }
    }
}
