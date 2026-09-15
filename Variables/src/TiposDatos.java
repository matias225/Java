public class TiposDatos {
    static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros (su valor default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte: " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort: " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt: " + tipoInt);
        long tipoLong = 987654321098765432L; // L o l para indicar tipo long
        System.out.println("tipoLong: " + tipoLong);

        // Punto flotante (Valor default 0.0)
        float tipoFloat = 3.14F; // F o f para indicar tipo float
        System.out.println("tipoFloat: " + tipoFloat);
        double tipoDouble = 3.1315; // D o d para indicar que es double
        System.out.println("tipoDouble: " + tipoDouble);

        // Caracter (Valor default '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar: " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar: " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar: " + tipoChar);

        // Booleano (Valor default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean: " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean: " + tipoBoolean);

        // Tipos Object (Referencia)
        String nombre = null;
        System.out.println("nombre: " + nombre);
        nombre = "Matias Romani";
        System.out.println("nombre: " + nombre);
    }
}
