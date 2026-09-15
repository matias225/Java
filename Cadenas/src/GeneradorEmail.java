public class GeneradorEmail {
    static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        var nombreCompleto = "  Brisa Candela Olate   ";
        var empresa = "Cruz Roja   ";
        var dominio = ".com.ar";
        System.out.println("Nombre usuario: " + nombreCompleto);

        // Normalizar o procesar
        var nombreNormalizado = nombreCompleto.toLowerCase().strip().replace(" ",".");
        System.out.println("Nombre usuario normalizado: " + nombreNormalizado);

        System.out.println("\nNombre empresa: " + empresa);
        empresa = empresa.toLowerCase().strip().replace(" ","");

        System.out.println("Extensión de dominio: " + dominio);
        var dominioNormalizado = empresa + dominio;
        System.out.println("Dominio de email normalizado: " + dominioNormalizado);

        var email = String.join("@", nombreNormalizado, dominioNormalizado);
        System.out.println("\nEmail final generado: " + email);
    }
}
