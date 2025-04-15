package aspects;

import entities.Calculator;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CalculatorLogger {

    @Before("execution(* entities.Calculator.sum(..))")
    public void logSum(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("Operação de soma realizada com os valores " + args[0] + " e " + args[1]);
    }

    @Before("execution(* entities.Calculator.subtract(..))")
    public void logSubtract(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("Operação de subtração realizada com os valores " + args[0] + " e " + args[1]);
    }

    @Before("execution(* entities.Calculator.multiply(..))")
    public void logMultiply(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("Operação de multiplicação realizada com os valores " + args[0] + " e " + args[1]);
    }

    @Before("execution(* entities.Calculator.divide(..))")
    public void logDivide(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("Operação de divisão realizada com os valores " + args[0] + " e " + args[1]);
    }
}