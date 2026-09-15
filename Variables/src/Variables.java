public class Variables {
    static void main(String[] args) {
        // Variables
        int edad = 33;
        double precio = 300.40;
        boolean disponible = true; // true/false
        char genero;
        genero = 'M'; // M / F

        // Acceder a las variables
        System.out.println("Variables sin modificar:");
        System.out.println(edad);
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);

        // Modificar el valor
        edad = 34;
        precio = 399.99;
        disponible = false;
        genero = 'F';

        System.out.println("Variables modificadas:");
        System.out.println(edad);
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);
    }
}
