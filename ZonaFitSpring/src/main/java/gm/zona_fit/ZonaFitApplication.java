package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private IClienteServicio clienteServicio;

	private static final Logger LOGGER = LoggerFactory.getLogger(ZonaFitApplication.class);
	String nl = System.lineSeparator();

	public static void main(String[] args) {
		LOGGER.info("Iniciando la aplicación");
		SpringApplication.run(ZonaFitApplication.class, args);
		LOGGER.info("Aplicación finalizada!");
	}

	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}

	private void zonaFitApp() {
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir) {
			var opcion = mostrarMenu(consola);
			salir = ejecutarOpciones(consola, opcion);
			LOGGER.info(nl);
		}
	}

	private int mostrarMenu(Scanner consola) {
        LOGGER.info("""
				\n\n*** Aplicación Zona Fit (GYM) ***
				1. Listar Clientes
				2. Buscar Cliente
				3. Agregar Cliente
				4. Modificar Cliente
				5. Eliminar Cliente
				6. Salir
				Elige una opción:\s""");
		return Integer.parseInt(consola.nextLine());
    }

	private boolean ejecutarOpciones(Scanner consola, int opcion) {
		var salir = false;
		switch (opcion) {
			case 1 -> {
				LOGGER.info(nl + "--- Listado de Clientes ---" + nl);
				List<Cliente> clientes = clienteServicio.listarClientes();
				clientes.forEach(cliente -> LOGGER.info(cliente.toString() + nl));
			}
			case 2 -> {
				LOGGER.info(nl + "--- Buscar Cliente por Id ---" + nl);
				LOGGER.info("ID cliente a buscar: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente != null)
					LOGGER.info("Cliente encontrado: " + cliente + nl);
				else
					LOGGER.info("Cliente no encontrado: " + idCliente + nl);
			}
			case 3 -> {
				LOGGER.info(nl + "--- Agregar Cliente ---" + nl);
				LOGGER.info("Nombre del cliente a agregar: ");
				var nombreCliente = consola.nextLine();
				LOGGER.info("Apellido del cliente a agregar: ");
				var apellidoCliente = consola.nextLine();
				LOGGER.info("Membresia del cliente a agregar: ");
				var membresiaCliente = Integer.parseInt(consola.nextLine());
				var cliente = new Cliente();
				cliente.setNombre(nombreCliente);
				cliente.setApellido(apellidoCliente);
				cliente.setMembresia(membresiaCliente);
				clienteServicio.guardarCliente(cliente);
				LOGGER.info("Cliente agregado: " + cliente + nl);
			}
			case 4 -> {
				LOGGER.info(nl + "--- Modificar Cliente ---" + nl);
				LOGGER.info("ID del cliente a Modificar: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente != null) {
					LOGGER.info("Nombre del cliente a Modificar: ");
					var nombreCliente = consola.nextLine();
					LOGGER.info("Apellido del cliente a Modificar: ");
					var apellidoCliente = consola.nextLine();
					LOGGER.info("Membresia del cliente a Modificar: ");
					var membresiaCliente = Integer.parseInt(consola.nextLine());
					cliente.setNombre(nombreCliente);
					cliente.setApellido(apellidoCliente);
					cliente.setMembresia(membresiaCliente);
					clienteServicio.guardarCliente(cliente);
					LOGGER.info("Cliente modificado: " + cliente + nl);
				} else
					LOGGER.info("Cliente no encontrado: " + cliente + nl);
			}
			case 5 -> {
				LOGGER.info(nl + "--- Eliminar Cliente ---" + nl);
				LOGGER.info("ID del cliente a Eliminar: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				var cliente = clienteServicio.buscarClientePorId(idCliente);
				if  (cliente != null) {
					clienteServicio.eliminarCliente(cliente);
					LOGGER.info("Cliente eliminado: " + cliente + nl);
				} else
					LOGGER.info("Cliente no encontrado: " + idCliente + nl);
			}
			case 6 -> {
				LOGGER.info("¡Hasta pronto!" + nl + nl);
				salir = true;
			}
			default -> LOGGER.info("Opción no válida: " + opcion + nl);
		}
		return salir;
	}
}
