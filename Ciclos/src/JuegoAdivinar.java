import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinar {
    static void main() {
        System.out.println("*** Juego de adivinanza ***");
        var consola = new Scanner(System.in);
        var random = new Random();
        final var NUMERO_SECRETO = random.nextInt(51);
        final var INTENTOS_MAXIMOS = 5;
        var intentos = 0;
        var numeroIntento = 0;

        while (numeroIntento != NUMERO_SECRETO && intentos < INTENTOS_MAXIMOS) {
            System.out.print("Ingrese que número cree que es (entero entre 0 y 100): ");
            numeroIntento = consola.nextInt();

            if (numeroIntento < NUMERO_SECRETO)
                System.out.println("El número es mas grande...");
            else
                System.out.println("El número es mas chico...");
            intentos++;
        }

        if (numeroIntento == NUMERO_SECRETO)
            System.out.printf("El número es correcto, era %d. Lo adivinaste en %d intentos", NUMERO_SECRETO, intentos);
        else {
            System.out.println("Demasiados intentos. Lo siento, perdiste");
            System.out.printf("El número correcto, era %d %n", NUMERO_SECRETO);
        }
    }
}
