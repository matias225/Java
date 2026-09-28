import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Listas {
    static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        // En las listas se pueden agregar repetidos
        //miLista.add("Domingo");


        // for (String dia : miLista)
        //     System.out.println("Dia de la semana: " + dia);

        // System.out.println();

        // Funciones Lambda (función anónima de un código muy compacto)
        // miLista.forEach( elemento -> {
        //    System.out.println("Elemento: " + elemento);
        //});

        miLista.forEach(System.out::println);
        System.out.println("\nLista de nombres: ");
        List<String> nombre = Arrays.asList("Pedro", "Brisa", "Matias");
        nombre.forEach(System.out::println);
    }
}
