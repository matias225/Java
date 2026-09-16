public class SumaAcumulativa {
    static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // Iterar los varlores
        var numero = 1;
        while (numero <= MAXIMO) {
            // Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> " +acumuladorSuma + " + " + numero);
            // Realizar la suma acumulativa
            acumuladorSuma += numero++;

            // Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }
        System.out.println("Suma de los primeros " + MAXIMO + " números: " + acumuladorSuma);
    }
}
