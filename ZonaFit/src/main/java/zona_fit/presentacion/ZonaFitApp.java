package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZonaFitApp {
    static void main(String[] args) {
        zonaFitApp();
    }

    public static void zonaFitApp() {
        var salir = false;
        var consola = new Scanner(System.in);
        // Creamos un objeto de la clase clienteDao
        var clienteDAO = new ClienteDAO();
        List<Cliente> clientes = new ArrayList<>();
        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, clientes, clienteDAO);
            } catch (Exception e) {
                System.out.println("Error al ejecutar comando: "+e.getMessage());
            } finally {
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner consola) {
        System.out.print("""
                *** Zona Fit (GYM) ***
                1. Listar clientes
                2. Buscar cliente
                3. Agregar cliente
                4. Modificar cliente
                5. Eliminar cliente
                6. Salir
                Elige una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Cliente> clientes, IClienteDAO clienteDAO) {
        var salir = false;
        switch (opcion) {
            case 1 -> {
                System.out.println("Listado de clientes: ");
                clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> {
                System.out.print("ID de cliente a buscar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if (encontrado)
                    System.out.println("Cliente encontrado: " + cliente);
                else
                    System.out.println("Cliente NO encontrado: " + cliente);
            }
            case 3 -> {
                System.out.println("--- Agregar cliente ---");
                System.out.print("Ingrese el nombre del cliente: ");
                var nombreCliente = consola.nextLine();
                System.out.print("Ingrese el apellido del cliente: ");
                var apellidoCliente = consola.nextLine();
                System.out.print("Ingrese la membresia del cliente: ");
                var membresiaCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(nombreCliente, apellidoCliente, membresiaCliente);
                var agregado = clienteDAO.agregarCliente(cliente);
                if  (agregado)
                    System.out.println("Se agrego el cliente: " + cliente);
                else
                    System.out.println("NO se agrego el cliente: " + cliente);
            }
            case 4 -> {
                System.out.println("--- Modificar Cliente ---");
                System.out.print("Id de cliente a modificar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                System.out.print("Ingrese el nuevo nombre del cliente: ");
                var nuevoNombre = consola.nextLine();
                System.out.print("Ingrese el nuevo apellido del cliente: ");
                var nuevoApellido = consola.nextLine();
                System.out.print("Ingrese la nueva membresia del cliente: ");
                var nuevaMembresia = Integer.parseInt(consola.nextLine());
                // Creamos el objeto a modificar
                var cliente = new Cliente(idCliente, nuevoNombre, nuevoApellido, nuevaMembresia);
                var modificado = clienteDAO.actualizarCliente(cliente);
                if (modificado)
                    System.out.println("Se modfico el cliente: " + cliente);
                else
                    System.out.println("NO se modifico el cliente: " + cliente);
            }
            case 5 -> {
                System.out.println("--- Eliminar Cliente ---");
                System.out.println("Id de cliente a eliminar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente =  new Cliente(idCliente);
                var eliminar = clienteDAO.eliminarCliente(cliente);
                if (eliminar)
                    System.out.println("Cliente eliminado: " + cliente);
                else
                    System.out.println("NO se elimino el cliente: " + cliente);
            }
            case 6 -> {
                System.out.print("¡Hasta pronto!");
                salir = true;
            }
            default -> System.out.println("Opción incorrecta: " + opcion);
        }
        return salir;
    }
}
