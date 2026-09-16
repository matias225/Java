import java.util.Arrays;

public class ImprimirArreglos {
    static void main(String[] args) {
        int[] enteros = {100, 200, 300, 400, 500};
        // Acceder a los elementos del arreglo
        System.out.println("Valor 1: " + enteros[0]);
        System.out.println("Valor 1: " + enteros[1]);
        System.out.println("Valor 1: " + enteros[2]);
        System.out.println("Valor 1: " + enteros[3]);
        System.out.println("Valor 1: " + enteros[4]);
        // Imprimir la dirección de memoria
        System.out.println("Imprimir dirección de memoria: " + enteros);
        System.out.println("Imprimir el arreglo: " + Arrays.toString(enteros));
        // Iterar los elementos del arreglo
        System.out.print("Iterar el arreglo: ");
        for (var i = 0; i < enteros.length; i++)
            System.out.print(enteros[i] + " ");
        // Otra forma mejorada
        System.out.print("\nForma mejorada: ");
        for (int entero : enteros)
            System.out.print(entero + " ");
    }
}
