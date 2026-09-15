public class DiaSemanaMejorado {
    static void main(String[] args) {
        System.out.println("*** Dia de la Semana con Switch Mejorado ***");
        var dia = 11;
        var diaSemana = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        System.out.println("Esta en el dia de la semana: " + diaSemana);
    }
}
