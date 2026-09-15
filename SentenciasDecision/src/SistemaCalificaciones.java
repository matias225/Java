import java.util.Scanner;

public class SistemaCalificaciones {
    static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Ingrese su calificación numérica (1-10): ");
        var calificacionNumerica = Double.parseDouble(consola.nextLine());
        var calificacionLetra = "";
        if (calificacionNumerica >= 9 && calificacionNumerica <= 10)
            calificacionLetra = "A";
        else if (calificacionNumerica >= 8 && calificacionNumerica <= 9)
            calificacionLetra = "B";
        else if (calificacionNumerica >= 7 && calificacionNumerica <= 8)
            calificacionLetra = "C";
        else if (calificacionNumerica >= 6 && calificacionNumerica <= 7)
            calificacionLetra = "D";
        else if (calificacionNumerica >= 0 && calificacionNumerica <= 6)
            calificacionLetra = "F";
        else
            calificacionLetra = "Valor desconocido";

        System.out.println("Su calificación numérica pasada a letra es: " + calificacionLetra);
    }
}
