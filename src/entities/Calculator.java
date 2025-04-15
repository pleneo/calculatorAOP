package entities;

public class Calculator {

    public static Double sum(Double a, Double b){
        return a + b;
    }

    public static Double subtract(Double a, Double b){
        return a - b;
    }

    public static Double multiply(Double a, Double b){
        return a * b;
    }

    public static Double divide(Double a, Double b){
        if (b == 0) throw new ArithmeticException("Impossível dividir por 0.");
        return a / b;
    }

}
