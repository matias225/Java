public class FuncionRecursiva {
    // Imprimir 1 al 5 usando una función recursiva
    // Función Recursiva
    static void funcionRecursiva(int numero) {
        // Caso base
        if (numero == 1)
            System.out.print(numero + " ");
        else {
            // Caso recursivo
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    static void main(String[] args) {
        funcionRecursiva(5);
    }
}
