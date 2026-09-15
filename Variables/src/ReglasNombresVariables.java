public class ReglasNombresVariables {
    static void main(String[] args) {
        // Reglas nombres de variables
        String nombreCompleto = "Matias Romani"; // Correcto, y buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Matias Nicolas Romani"; // Correcto, no aplica las buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        // String nombre-cliente = "Matias"; // Incorrecto
        String nombre_cliente = "Matias"; // Correcto, no aplica buenas practicas
        String _apellido = "Romani"; // Correcto y aceptable
        String $apellido = "Romani"; // Correcto y aceptable
        int totPzs = 10; // Correcto, no aplica buenas practicas
        int totalPiezas = 10; // Correcto, aplica las buenas practicas
        boolean casado = true; // Correcto, aún puede mejorar
        boolean esCasado = true; // Correcto, aplica las buenas practicas
        boolean isCasado = true; // Correcto, y aplica buenas practicas *
        boolean tieneSaldo = true; // Correcto, y aplica buenas practicas
        boolean hasSaldo = true; // Correcto, y aplica buenas practicas *
    }
}
