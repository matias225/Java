public class ReservaHotel {
    static void main(String[] args) {
        System.out.println("*** Reserva de Hotel ***");
        var nombreCliente = "Matias Romani";
        var diasEstadia = 5;
        var tarifaDiaria = 1500.50;
        var tieneVistaAlMar = false;
        System.out.println("Valores iniciales");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstadia = " + diasEstadia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
        nombreCliente = "Brisa Candela Olate";
        diasEstadia = 6;
        tarifaDiaria = 1999.99;
        tieneVistaAlMar = true;
        System.out.println();
        System.out.println("Valores modificados");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstadia = " + diasEstadia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
    }
}
