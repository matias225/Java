public class RecorrerMatrices {
    static void main(String[] args) {
        final var FILAS = 2;
        final var COLUMNAS = 3;
        var matriz = new int[FILAS][COLUMNAS];
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // Recorremos la matriz
        // 1. Ciclo más externo. Recorrer las filas
        for (var fila = 0; fila < FILAS; fila++) {
            // 2. Ciclo interno. Recorrer las columnas
            for (var col = 0; col < COLUMNAS; col++) {
                System.out.println("Valor[" + fila + "][" + col + "] = " + matriz[fila][col]);
            }
        }
    }
}
