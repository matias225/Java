package persona;

public class PruebaPersona {
    static void main(String[] args) {
        System.out.println("*** Creación de Clases y Objetos Persona ***");
        var objeto1 = new Persona();
        objeto1.setNombre("Brisa");
        objeto1.setApellido("Olate");
        objeto1.mostrarPersona();
        System.out.println();
        // Segundo objeto
        var objeto2 = new Persona("Matias", "Romani", 33, 5555555);
        objeto2.mostrarPersona();
        System.out.println();
        System.out.println(objeto2.getNombre());
    }
}
