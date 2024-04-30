package projeto.maratona.java.introducao;
import java.util.Scanner;


public class Exercicio02 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double salario;
        double taxaInicial = 9.70 / 100;
        double taxaMedia = 37.35 / 100;
        double taxaFinal = 49.50 / 100;
        double taxaReal;

        System.out.println("Digite qual e o seu salario anual: ");
        salario = entrada.nextDouble();

        if(salario <= 34712){
            taxaReal = salario * taxaInicial ;
        } else if (salario >= 34713 && salario <= 68507){
            taxaReal = salario * taxaMedia;
        }else{
            taxaReal = salario * taxaFinal;
        }


        System.out.println("seu salario anual e "+ salario + "e por isso pagara "+ taxaReal + "em impostos");

    }

}

