import java.util.Random;

public class NumerosAleatorios {
    static void main(String[] args) {
        System.out.println("*** Números Aleatorios ***");
        var random = new Random();

        // Generar un número aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        // Generar un número aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10)+1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        // Generar un número flotante aleatorio entre 0.0 y 1.0
        var floatAleatorio = random.nextFloat(); // por default es entre 0.0 y 1.0
        System.out.println("floatAleatorio = " + floatAleatorio);

        // Simular el lanzamiento de un dado (1 y 6)
        var dado = random.nextInt(6)+1;
        System.out.println("Resultado de lanzar un dado: " + dado);
    }
}
