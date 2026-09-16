import java.util.Scanner;

public class CalculadoraJava {
    static void main(String[] args) {
        var consola = new Scanner(System.in);
        double num1 = 0.0, num2 = 0.0, resultado;
        var salir = false;
        while (!salir){
            System.out.print("""
                    *** Calculadora Java ***
                    Operaciones:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Ingresa la opción:\s""");
            var opcion = consola.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer operando: ");
                num1 = consola.nextDouble();
                System.out.print("Ingrese el segundo operando: ");
                num2 = consola.nextDouble();
            }

            switch (opcion) {
                case 1 -> {
                    resultado = num1 + num2;
                    System.out.printf("El resultado de la suma es: %.2f%n%n", resultado);
                }
                case 2 -> {
                    resultado = num1 - num2;
                    System.out.printf("El resultado de la resta es: %.2f%n%n", resultado);
                }
                case 3 -> { // Multiplicación
                    resultado = num1 * num2;
                    System.out.printf("El resultado de la multiplicación es: %.2f%n%n", resultado);
                }
                case 4 -> { // División
                    if (num2 == 0)
                        System.out.println("No es posible dividir por 0");
                    else {
                        resultado = num1 / num2;
                        System.out.printf("El resultado de la división es: %.2f%n%n", resultado);
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo de la calculadora...");
                    salir = true;
                }
                default -> System.out.println("Opción invalida");
            }
        }
    }
}
