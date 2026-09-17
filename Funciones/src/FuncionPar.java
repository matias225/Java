import java.util.Scanner;

public class FuncionPar {
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static void main(String[] args) {
        System.out.print("Proporciona un valor: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.printf("¿%d es par? %b", numero, esPar(numero));
    }
}
