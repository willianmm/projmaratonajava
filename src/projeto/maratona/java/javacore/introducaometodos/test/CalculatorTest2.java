package projeto.maratona.java.javacore.introducaometodos.test;

import projeto.maratona.java.javacore.introducaometodos.domain.Calculator;

public class CalculatorTest2 {
    public static void main(String[] args) {
        Calculator multiplicacao = new Calculator();
        multiplicacao.multiplicaDoisNumeros(10, 100, 100);


        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.println(number);
        }



    }
}
