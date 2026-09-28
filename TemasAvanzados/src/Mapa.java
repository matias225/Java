import java.util.HashMap;
import java.util.Map;

public class Mapa {
    static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Juan");
        persona.put("apellido", "Vargas");
        persona.put("edad", "45");
        System.out.println("Valores del mapa o diccionario: ");
        persona.entrySet().forEach(System.out::println);
        persona.put("edad", "46"); // Modificar el valor de la llave existente
        persona.remove("apellido");
        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Iterar los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave, valor): ");
        persona.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
