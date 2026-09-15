import java.util.Scanner;

public class EstacionAnio {
    static void main(String[] args) {
        System.out.println("*** Estación del año ***");
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el número de mes en el que se encuentra (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "";
        if (mes == 12 || mes == 1 || mes == 2)
            estacion = "Verano";
        else if (mes == 3 || mes == 4 || mes == 5)
            estacion = "Otoño";
        else if (mes == 6 || mes == 7 || mes == 8)
            estacion = "Invierno";
        else if (mes == 9 || mes == 10 || mes == 11)
            estacion = "Primavera";
        else
            estacion = "Desconocida";
        System.out.println("Se encuentra en la estación: " + estacion);
    }
}
