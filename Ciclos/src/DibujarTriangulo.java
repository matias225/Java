import java.util.Scanner;

public class DibujarTriangulo {
    static void main(String[] args) {
        System.out.println("*** Dibujar un Triángulo ***");
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el número de filas para el triángulo: ");
        var numeroLados = consola.nextInt();

        for (var fila = 1; fila <= numeroLados; fila++) {
            var espaciosBlanco = " ".repeat(numeroLados - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}
