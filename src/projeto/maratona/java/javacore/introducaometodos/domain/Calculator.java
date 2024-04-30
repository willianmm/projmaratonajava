package projeto.maratona.java.javacore.introducaometodos.domain;

public class Calculator {
    public void somaDoisNumeros(){
        System.out.println( + 10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(100-10);

    }

    public void multiplicaDoisNumeros(int num1, int num2, int num3) {
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
    public void divideDoisNumeros2(double num1, double num2){
        if (num2 == 0){
            System.out.println("nao existe divisao por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 100;
        num2 = 1000;
        System.out.println("dentro do calculator");
        System.out.println("Num1 Calculadora " + num1);
        System.out.println("Num2 Calculadora " + num2);

    }

    public void somaArray(int[] numeros){
        double soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaVarArgs(double... numeros){
        double soma = 0;
        for(double num : numeros){
            soma += num;
        }
        System.out.println(soma);

    }











}

