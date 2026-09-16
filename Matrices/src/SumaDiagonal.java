import java.util.Scanner;

public class SumaDiagonal {
    static void main(String[] args) {
        // Introducir valores a una matriz
        int filas, columnas;
        var consola = new Scanner(System.in);
        // Definimos la matriz
        System.out.print("Proporciona las filas: ");
        filas = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        System.out.println();

        var matriz = new int[filas][columnas];
        var sumaDiagonal = 0;

        // Solicitamos los valores
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Ingrese el valor["+fila+"]["+col+"]: ");
                matriz[fila][col] = consola.nextInt();
            }
        }
        System.out.println();
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                if (col == fila)
                    sumaDiagonal += matriz[fila][col];
            }
        }

        System.out.println("\nLa suma diagonal es: " + sumaDiagonal);
    }
}
