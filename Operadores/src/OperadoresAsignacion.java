public class OperadoresAsignacion {
    static void main(String[] args) {
        System.out.println("*** Operadores de Asignación ***");
        // Asignación =
        var miNumero = 10;
        int miNumero2;
        miNumero2 = 15;
        // Asignacion compuesto
        // +=
        miNumero += 5; // miNumero = miNumero + 5;
        System.out.println("miNumero = " + miNumero);
        // -=, *=, /= y %=
        miNumero *= 2; // miNumero = miNumero * 2; --> 30
        System.out.println("miNumero = " + miNumero);
        // Asignación de variables múltiples (deben ser del mismo tipo de dato, no se puede usar var)
        int a = 10, b = 15, c = 20;
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}
