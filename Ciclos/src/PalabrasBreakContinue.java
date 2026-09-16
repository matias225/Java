public class PalabrasBreakContinue {
    static void main(String[] args) {
        System.out.println("*** Palabras break y continue ***");

        // Ejemplo break, imprimir sólo el primer número par
        System.out.println("Palabra break");
        for (var numero = 1; numero < 10; numero++) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                break;
            }
        }

        // Ejemplo continue, imprimir sólo números pares
        System.out.println("\nPalabra continue");
        for (var numero = 1; numero < 10; numero++) {
            if (numero % 2 == 1)
                continue;
            System.out.print(numero + " ");
        }
    }
}
