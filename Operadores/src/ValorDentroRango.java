import java.util.Scanner;

public class ValorDentroRango {
    static void main(String[] args) {
        System.out.println("*** Valor Dentro Rango ***");
        // Definimos los límites
        final var MINIMO = 0;
        final var MAXIMO = 5;
        // Solicitar un valor entre 0 y 5
        System.out.print("Proporcione un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // Verificar si el dato esta dentro de rango
        var estaDentroRango = dato >= MINIMO &&  dato <= MAXIMO;
        System.out.println("estaDentroRango? " + estaDentroRango);
    }
}
