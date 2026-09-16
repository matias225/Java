public class NumerosImpares {
    static void main(String[] args) {
        System.out.println("*** Números impares ***");
        var contador = 0;
        do {
            // Revisamos si es número impar
            if (contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;
        } while (contador <= 20);
    }
}

