import java.util.Scanner;

public class SistemaEmpleados {
    static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");
        var consola = new Scanner(System.in);

        // Nombre del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        // Edad del empleado
        System.out.print("Ingrese la edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario del empleado
        System.out.print("Ingrese el salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Es jefe de departamento
        System.out.print("¿Es jefe de departamento? (true/false) ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir los valores del Empleado
        System.out.println("\nDatos del empleado");
        System.out.println("\tNombre del empleado: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " años");
        //System.out.println("\tSalario: " + salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\t¿Es Jefe de Departamento? " + esJefeDepartamento);
    }
}
