public class NumerosPares {
    static void main(String[] args) {
        System.out.println("*** Números pares del 0 al 20 ***");
        var contador = 0;
        while (contador <= 20) {
            // Revisamos si es par
            if (contador % 2 == 0)
                System.out.print(contador + " ");
            contador++;
        }
    }
}
