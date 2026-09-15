public class ComparacionCadenas {
    static void main(String[] args) {
        // Comparación de cadenas (pool cadenas)
        var cadena1 = "Java";
        // Como la cadena Java ya existe en el pool de cadenas, se reutiliza
        var cadena2 = "Java";
        // Si queremos crear un objeto nuevo usamos la sintaxis formal de creación de objetos
        var cadena3 = new String("Java");
        // Comparación de cadenas (==), compara la referencia en memoria
        System.out.print("cadena1 es igual en referencia a la cadena2: ");
        System.out.println(cadena1 == cadena2);
        // Comparamos referencias de cadena1 y cadena3
        System.out.print("cadena1 es igual en referencia a la cadena3: ");
        System.out.println(cadena1 == cadena3);
        // Para comparar contenido utilizamos el metodo equals()
        System.out.print("cadena1 es igual en contenido a la cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
