import java.util.Scanner;

public class CajeroAutomatico {
    static void main(String[] args) {
        var consola = new Scanner(System.in);
        var saldo = 1000.0;
        var deposito = 0.0;
        var retiro = 0.0;
        var salir = false;
        while (!salir) {
            System.out.print("""
                    *** Aplicación de Cajero Automático ***
                    Operaciones que puede realizar:
                    1. Consultar saldo
                    2. Depositar
                    3. Retirar
                    4. Salir
                    Seleccione una opción:\s""");
            var opcion = consola.nextInt();
            switch (opcion) {
                case 1 -> System.out.printf("Saldo actual: $%.2f%n%n", saldo);
                case 2 -> {
                    System.out.print("Ingrese cuanto desee depositar: ");
                    deposito = consola.nextFloat();
                    saldo += deposito;
                }
                case 3 -> {
                    System.out.print("Ingrese cuanto desee retirar: ");
                    retiro = consola.nextFloat();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.printf("Tu nuevo saldo es de $%.2f%n%n", saldo);
                    } else
                        System.out.printf("No tienes suficiente saldo. Saldo actual $%.2f%n%n", saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero...");
                    salir = true;
                }
                default -> System.out.println("Opción incorrecta.\n");
            }
        }
    }
}
