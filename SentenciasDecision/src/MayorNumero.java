import java.util.Scanner;

public class MayorNumero {
    static void main(String[] args) {
        System.out.println("*** El mayor número ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese el segundo número entero: ");
        var num2 = Integer.parseInt(consola.nextLine());

        if (num1 > num2)
            System.out.printf("El primer número es mayor, %d es mayor que %d", num1, num2);
        else if (num2 > num1)
            System.out.printf("El segundo número es mayor, %d es mayor que %d", num2, num1);
        else
            System.out.printf("%d y %d son iguales", num1, num2);
    }
}
