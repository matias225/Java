import java.util.Scanner;

public class ValorPositivo {
    static void main(String[] args) {
        System.out.println("*** Valor Positivo ***");

        var consola = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        var numeroIngresado = Integer.parseInt(consola.nextLine());

        if (numeroIngresado > 0) {
            System.out.println("El número ingresado es positivo");
        } else if (numeroIngresado < 0) {
            System.out.println("El número ingresado es negativo");
        } else {
            System.out.println("El número es 0");
        }
    }
}
