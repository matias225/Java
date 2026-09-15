import java.util.Scanner;

public class EstacionAnioMejorada {
    static void main(String[] args) {
        System.out.println("*** Estación del año (mejorada con switch) ***");
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el número de mes en el que se encuentra (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());
        // Puede ser así
        var estacionAnio = switch (mes) {
            case 1, 2, 12 -> "Verano";
            case 3, 4, 5 -> "Otoño";
            case 6, 7, 8 -> "Invierno";
            case 9, 10, 11 -> "Primavera";
            default -> "Desconocida";
        };
        // o así
        // switch (mes) {
        //    case 1, 2, 12 -> estacionAnio = "Invierno";
        //    case 3, 4, 5 -> estacionAnio = "Primavera";
        //    case 6, 7, 8 -> estacionAnio = "Verano";
        //    case 9, 10, 11 -> estacionAnio = "Otoño";
        //    default -> estacionAnio = "Estación desconocida";
        // }
        System.out.println("Se encuentra en la estación: " + estacionAnio);
    }
}
