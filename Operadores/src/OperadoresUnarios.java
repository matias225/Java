public class OperadoresUnarios {
    static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;
        // Operador unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);
        // Operador unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // Operadores unarios de incremento/decremento
        // Pre-incremento
        resultado = ++a; // primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + resultado);
        // Post-incremento
        a = 3;
        resultado = a++; // primero se usa el valor y luego se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa = " + a);

        // Pre-decremento
        resultado = --b;
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se decremento = " + b);
        // Post-decremento
        b = -2;
        resultado = b--;
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento se decrementa = " + b);
    }
}
