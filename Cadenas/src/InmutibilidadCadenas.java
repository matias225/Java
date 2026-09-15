public class InmutibilidadCadenas {
    static void main(String[] args) {
        // Inmutabilidad de cadenas
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        // Se puede guardar la referencia de la cadena 1 en una nueva variable
        var cadena2 = cadena1;
        // No se modifica, se crea un nuevo objeto y la variable apunta a él
        cadena1 = "Adios";
        System.out.println("cadena1 modificado = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
    }
}
