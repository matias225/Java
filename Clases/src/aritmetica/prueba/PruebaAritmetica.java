package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    static void main(String[] args) {
        System.out.println("*** Prueba aritmética ***");
        Aritmetica aritmetica1 = new Aritmetica(5, 7);
        System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
        aritmetica1.sumar();
        aritmetica1.restar();
        // Creamos un segundo objeto
        var aritmetica2 = new Aritmetica(12, 16);
        aritmetica2.sumar();
        aritmetica2.restar();
        var aritmetica3 = new Aritmetica(12, 3);
        aritmetica3.sumar();
        aritmetica3.multiplicar();
        aritmetica3.dividir();
    }
}
