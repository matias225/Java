public class MetodosCadenas {
    static void main(String[] args) {
        // Metodo de cadenas
        var cadena1 = "Hola mundo";

        // Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace("m","M");
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        // Convertir a mayusculas
        var cadenaMayusculas = cadena1.toUpperCase();
        System.out.println("cadenaMayusculas = " + cadenaMayusculas);
        
        // Conertir a minusculas
        var cadenaMinusculas = cadena1.toLowerCase();
        System.out.println("cadenaMinusculas = " + cadenaMinusculas);

        // Eliminar espacios al incio y al final
        var cadena2 = "   Santiago Romani    ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios al principio y al fin = " + cadena2.trim()); // tambien esta strip()
    }
}
