import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Pedro");
        // Aunque agregemos el nombre repetido, no se agrega
        conjunto.add("Pedro");
        conjunto.add("Brisa");
        conjunto.add("Matias");
        System.out.println("Elementos del Set");
        conjunto.forEach(System.out::println);

        // Remover elemento
        conjunto.remove("Pedro");
        System.out.println("\nNuevos elementos del Set");
        conjunto.forEach(System.out::println);
    }
}
