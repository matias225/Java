public class IndicesCadena {
    static void main(String[] args) {
        // Manejo de indices en una cadena
        var cadena1 = "Hola mundo";

        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el último caracter
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // Recuperar la letra m (caracter número 6, índice 5)
        var sextoCaracter = cadena1.charAt(5);
        System.out.println("sextoCaracter = " + sextoCaracter);
    }
}
