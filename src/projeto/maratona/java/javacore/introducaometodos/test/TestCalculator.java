package projeto.maratona.java.javacore.introducaometodos.test;

import projeto.maratona.java.javacore.introducaometodos.domain.Calculator;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator adicao = new Calculator();
        Calculator subtracao = new Calculator();

        adicao.somaDoisNumeros();

        subtracao.subtraiDoisNumeros();
    }
}
