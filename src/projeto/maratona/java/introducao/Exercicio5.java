package projeto.maratona.java.introducao;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String [] args){
        double valor;
        Scanner valorCarro= new Scanner(System.in);
        System.out.println("Qual o valor do carro");
        valor = valorCarro.nextDouble();


        for(int numParcelas = 1 ; numParcelas <= valor ; numParcelas++) {
            double valorParcela = valor / numParcelas;
            if (valorParcela < 1000 ) {
                break;

            }
            System.out.println("Em ate " + numParcelas + " de R$" + valorParcela);

        }

        
        







    }

}
