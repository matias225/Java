import java.util.Scanner;

public class CreacionDinamicaMatrices {
    static void main(String[] args) {
        // Introducir valores a una matriz
        int filas, columnas;
        var consola = new Scanner(System.in);

        // Definimos la matriz
        System.out.print("Proporciona las filas: ");
        filas = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[filas][columnas];
        // Solicitar los valors
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Valor[" + fila + "][" + col + "] = ");
                matriz[fila][col] = Integer.parseInt(consola.nextLine());
            }
        }
        // Iterar los valores
        System.out.println();
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("Matriz[" + fila + "][" + col + "] = " + matriz[fila][col]);
            }
        }
    }
}
