public class DefinirMatrices {
    static void main(String[] args) {
        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        for (var fila = 0; fila < matriz.length; fila++) {
            // 2. Ciclo interno. Recorrer las columnas
            for (var col = 0; col < matriz[fila].length; col++) {
                System.out.println("Valor[" + fila + "][" + col + "] = " + matriz[fila][col]);
            }
        }
    }
}
