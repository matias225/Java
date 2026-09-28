package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 2);
            System.out.println("resultado: " +resultado);
        } catch (Exception e) {
            System.out.println("Ocurrió una excepcion: "+e.getMessage());
        } finally {
            System.out.println("Se reviso la división entre cero");
        }
    }
}
