public class TipoVar {
    static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        // Sin el uso de var
        String nombre1 = "Matias";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var nombre2 = "Brisa";
        System.out.println("nombre2 = " + nombre2);
        // Define otras variables usando var
        var edad = 33; // Se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 2000000.5F; // Se infiere el tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = true; // Se infiere boolean
        esCasado = false;
        // esCasado = "No"; // No podemos asignar un tipo distinto
        // Se debe definir su valor
        // var precio; // esto lanza error, tenemos que asignar un valor
        // precio = 10;

        // Se debe poder inferir el tipo de dato
        // var apellido = null;  // no se puede inferir el tipo de dato
    }
}
