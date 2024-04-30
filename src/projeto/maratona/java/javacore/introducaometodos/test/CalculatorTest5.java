package projeto.maratona.java.javacore.introducaometodos.test;

import projeto.maratona.java.javacore.introducaometodos.domain.Calculator;

public class CalculatorTest5 {
    public static void main(String[] args) {
        Calculator caluladora = new Calculator();
        int[] array = {1, 2, 3, 4, 5};
        caluladora.somaArray(array);
        //outro metodo com varArgs
        caluladora.somaVarArgs(1,2,3,4,5,6,7,8,9,10);




    }
}
