public class DiaSemana {
    static void main(String[] args) {
        System.out.println("*** Dia de la Semana con Switch ***");
        var dia = 2; // 1 - lunes, 2 - martes, etc

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido: " + dia);
                break;
        }
    }
}
