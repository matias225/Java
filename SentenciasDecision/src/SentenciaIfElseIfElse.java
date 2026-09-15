public class SentenciaIfElseIfElse {
    static void main(String[] args) {
        // Uso de sentencia if
        var edad = 10;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un niño");
        }
    }
}
