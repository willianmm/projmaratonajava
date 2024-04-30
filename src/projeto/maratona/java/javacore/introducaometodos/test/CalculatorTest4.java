package projeto.maratona.java.javacore.introducaometodos.test;

import projeto.maratona.java.javacore.introducaometodos.domain.Calculator;

public class CalculatorTest4 {
    public static void main(String[] args) {
        Calculator altera = new Calculator();
        int num1 = 10;
        int num2 = 15;

        altera.alteraDoisNumeros(num1, num2);
        System.out.println("------------------------");
        System.out.println("num1 " +num1 );
        System.out.println("num2 " +num2 );




    }
}
