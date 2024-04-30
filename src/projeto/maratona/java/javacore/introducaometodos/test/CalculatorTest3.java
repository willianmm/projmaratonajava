package projeto.maratona.java.javacore.introducaometodos.test;

import projeto.maratona.java.javacore.introducaometodos.domain.Calculator;

public class CalculatorTest3 {
    public static void main(String[] args) {

        Calculator divisao = new Calculator();
        double result = divisao.divideDoisNumeros(20, 6);
        System.out.println(result);
        //////////////////////////////////////////////////////
        divisao.divideDoisNumeros2(66, 0);

    }
}
