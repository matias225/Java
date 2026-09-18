package aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;

    // Constructor vacío
    public Aritmetica() {
        System.out.println("Ejecutando constructor...");
    }

    // Constructor
    public Aritmetica(int operando1, int operando2) {
        System.out.println("Ejecutando constructor...");
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar() {
        var resultado = this.operando1 + this.operando2;
        System.out.printf("El resultado de la suma es: %d%n", resultado);
    }

    public void restar() {
        var resultado = this.operando1 - this.operando2;
        System.out.printf("El resultado de la resta es: %d%n", resultado);
    }

    public void multiplicar() {
        var resultado = this.operando1 * this.operando2;
        System.out.printf("El resultado de la multiplicacion es: %d%n", resultado);
    }

    public void dividir() {
        if (this.operando2 == 0) {
            System.out.println("No se puede dividir por cero");
            return;
        }
        double op1 = this.operando1;
        double op2 = this.operando2;
        var resultado = op1 / op2;
        System.out.printf("El resultado de la division es: %.2f%n", resultado);
    }

    public int getOperando1() {
        return this.operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return this.operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
