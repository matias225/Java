public class FormateoCadenas {
    static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Matias";
        var edad = 33;
        var salario = 1500000.50;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf (no agrega el salto de linea, lo agregamos con %n)
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);

        var numeroEmpleado = 12;
        // Formateo con text block (\s agrega un espacio en blanco)
        mensaje = """
                %nDetalle de la persona:\s
                ----------------------
                \tNombre: %s
                \tN° Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        // Formateo con text block y printf directamente
        System.out.printf("""
                %nDetalle de la persona:\s
                ----------------------
                \tNombre: %s
                \tN° Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}
