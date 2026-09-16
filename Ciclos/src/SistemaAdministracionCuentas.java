import java.util.Scanner;

public class SistemaAdministracionCuentas {
    static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        while (!salir){
            System.out.print("""
                    *** Sistema de Administración de Cuentas ***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opción:\s""");
            var opcion = consola.nextInt();
            // Evaluar cada opción
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                        System.out.println("Saliendo...\n");
                        salir = true;
                }
                default -> System.out.println("Opción incorrecta...\n");
            }
        }
    }
}
