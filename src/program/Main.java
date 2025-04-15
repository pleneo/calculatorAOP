package program;

import entities.Calculator;

public class Main {
    public static void main(String[] args) {
        Double a = 1.0;
        Double b = 0.0;

        System.out.printf("SOMA entre %.2f e %.2f: " + Calculator.sum(a,b), a,b);
        System.out.printf("%nSUBTRAÇÃO entre %.2f e %.2f: " + Calculator.subtract(a,b), a,b);
        System.out.printf("%nMULTIPLICAÇÃO entre %.2f e %.2f: " + Calculator.multiply(a,b), a,b);

        try {
            System.out.printf("%nDIVISAO entre %.2f e %.2f: " + Calculator.divide(a, b), a, b);
        }catch (ArithmeticException e){
            System.out.printf("%n"+ e.getMessage());;
        }
    }
}
