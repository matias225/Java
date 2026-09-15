import java.util.Scanner;

public class RangoVariable {
    static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Proporciona algún valor: ");
        var dato = Integer.parseInt(consola.nextLine());

        // Revisar si está dentro del rango 1 y 10
        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("¿Variable dentro de rango (1 y 10)? " + estaDentroRango);
    
        // Revisar lógica inversa, si el dato está fuera del rango
        var estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("¿Variable fuera de rango? " + estaFueraRango);
    }
}
