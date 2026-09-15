public class PrecedenciaOperadores {
    static void main(String[] args) {
        // Precedencia de Operadores en Java:
        // 1. Postfijo: expr++, expr--
        // 2. Unarios: ++expr, --expr, +expr, -expr, ~, !
        // 3. Creación de Objetos: new, new[]
        // 4. Multiplicación/División: *, /, %
        // 5. Aditivos: +, -
        // 6. Relacionales: <, >, <=, >=
        // 7. Igualdad: ==, !=
        // 8. Lógicos AND Condicional: &&
        // 9. Lógicos OR Condicional: ||
        // 10. Ternario: ? :
        // 11. Asignación: =, +=, -=, *=, /=, %=

        // si estan en el mismo nivel se ejecuta primero el mas a la izquierda

        // Expresión
        var a = 12 / 3 + 2 * 3 - 1;
        // Primero multiplicación y división
        // Paso 1. 12 / 3 = 4
        // Paso 2. 2 * 3 = 6
        // Paso 3. 4 + 6 = 10
        // Paso 4. 10 - 1 = 9
        // a = 9

        System.out.println("a = " + a);
    }
}
