import java.util.Scanner;

public class PromedioCalificaciones {
    static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
        var consola = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones deseas agregar? ");
        var numeroCalificaciones = Integer.parseInt(consola.nextLine());
        var calificaciones = new Double[numeroCalificaciones];

        var sumaCalificaciones = 0.0;
        for (var i = 0; i < numeroCalificaciones; i++) {
            System.out.print("Ingrese la calificación " + i + " (con .): ");

            calificaciones[i] = Double.parseDouble(consola.nextLine());
            sumaCalificaciones += calificaciones[i];
        }
        var promedio = sumaCalificaciones/numeroCalificaciones;
        System.out.printf("Promedio de las calificaciones: %.2f", promedio);
    }
}
