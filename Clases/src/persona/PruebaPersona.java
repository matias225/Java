package persona;

public class PruebaPersona {
    static void main(String[] args) {
        System.out.println("*** Creación de Clases y Objetos Persona ***");
        System.out.println("Contador personas: " + Persona.getContadorPersonas());
        var objeto1 = new Persona();
        objeto1.setNombre("Brisa");
        objeto1.setApellido("Olate");
        System.out.println(objeto1);
        System.out.println("Contador personas: " + Persona.getContadorPersonas());
        var objeto2 = new Persona("Matias", "Romani", 33, 555555);
        System.out.println(objeto2);
        System.out.println("Contador personas: " + Persona.getContadorPersonas());
        System.out.println("Id objeto 1: " + objeto1.getIdPersona());
        System.out.println("Id objeto 2: " + objeto2.getIdPersona());
    }
}
