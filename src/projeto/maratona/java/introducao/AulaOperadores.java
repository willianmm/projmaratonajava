package projeto.maratona.java.introducao;

public class AulaOperadores {
    public static void main(String[] args) {
        // = - / *
        int number1 = 10;
        int number2 = 20;
        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number2 / number1);
        double resultado = number1 / (double) number2;
        System.out.println("resultado " + resultado);
        // %
        int resto = 21 % 2;
        System.out.println(resto);

        //Operadores racionais: < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezDiferenteQueVinte);

        //operadores logicos: &&(AND), ||(OR), |, &
        int idade = 35;
        float salario = 4500F;
        boolean DentroDaLei = idade >= 35 & salario >= 5500;
        System.out.println("esta dentro da lei?" + DentroDaLei);

        double valorContaCorrente = 200;
        double valorPoupanca = 10000;
        float valorps5 = 5000;
        boolean ps5 = valorContaCorrente >= valorps5 || valorPoupanca >= valorps5;
        System.out.println("isPs5?: " + ps5);

        //Operadores de atribuicao: =, +=, -=, /=, %=, *=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        System.out.println(bonus);


        //operadores unarios: ++, --
        int x = 10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(--x);





    }
}
