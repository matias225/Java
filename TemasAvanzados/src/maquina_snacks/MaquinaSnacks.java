package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);
        // Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Máquina de Snacks ***");
        Snacks.mostrarSnack(); // Mostrar inventario de snacks disponibles
        while(!salir){
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            } finally {
                System.out.println(); // Salto de linea para cada iteración
            }
        }
    }


    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                Menu:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Salir
                Elige una opción:\s""");
        // Leemos y retornamos la opción seleccionada
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos) {
        var salir = false;
        switch (opcion) {
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("¡Regresa pronto!");
                salir = true;
            }
            default -> System.out.println("Opción incorrecta: " + opcion);
        }
        return  salir;
    }

    private static void agregarSnack(Scanner consola) {
        System.out.print("Nombre del snack: ");
        var nombre =  consola.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack se ha agregado correctamente.");
        Snacks.mostrarSnack();
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos) {
        System.out.print("¿Qué snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());
        // Validar que el snack exista en la lista
        var snackEncontrado = false;
        for (var snack: Snacks.getSnacks())
            if (snack.getIdSnack() == idSnack) {
                // Agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("Ok, Snack agregado exitosamente. "+ snack);
                snackEncontrado = true;
                break;
            }
        if (!snackEncontrado)
            System.out.println("Id de snack no encontrado: " + idSnack);
    }

    private static void mostrarTicket(List<Snack> productos) {
        var ticket = "*** Ticket de compra ***";
        var total = 0.0;
        for (var prod: productos) {
            ticket += "\n\t- " + prod.getNombre() + " - $"  + prod.getPrecio();
            total += prod.getPrecio();
        }
        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

}
