import java.util.Scanner;

public class CalculoAreaYPerimetro {
    static void main(String[] args) {
        System.out.println("*** Cálculo del Área de un Rectángulo ***");
        var consola = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        var baseRectangulo = Double.parseDouble(consola.nextLine());
        System.out.print("Ingrese la altura del rectángulo: ");
        var alturaRectangulo = Double.parseDouble(consola.nextLine());

        var areaRectangulo = baseRectangulo * alturaRectangulo;
        var perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);

        System.out.printf("b = %.2f, h = %.2f%n", baseRectangulo, alturaRectangulo);
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
    }
}
