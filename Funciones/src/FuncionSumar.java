public class FuncionSumar {
    // Definimos la función sumar
    static int sumar(int a, int b) {
        return a + b;
    }

    static void main(String[] args) {
        int arg1 = 10, arg2 = 3;
        var resultado = sumar(arg1, arg2);
        System.out.printf("El resultado de la suma de %d y %d es: %d%n", arg1, arg2, resultado);
        arg1 = 7;
        resultado = sumar(arg1, arg2);
        System.out.printf("El resultado de la suma de %d y %d es: %d%n", arg1, arg2, resultado);
    }
}
