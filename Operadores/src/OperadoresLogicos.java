public class OperadoresLogicos {
    static void main(String[] args) {
        System.out.println("*** Operadores Lógicos ***");
        boolean a = true, b = false;
        System.out.println("a = true, b = false");

        System.out.println("Operador AND");
        // and (regresa true si ambos son true)
        var resultado = a && b;
        System.out.println("resultado a && b = " + resultado);

        System.out.println("\nOperador OR");
        // or (regresa true si cualquiera de los valores es true)
        resultado = a || b;
        System.out.println("resultado a || b = " + resultado);

        // not (invierte el valor del valor)
        System.out.println("\nOperdaor NOT");
        resultado = !a;
        System.out.println("resultado !a = " + resultado);
        resultado = !b;
        System.out.println("resultado !b = " + resultado);
    }
}
