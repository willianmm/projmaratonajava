package projeto.maratona.java.introducao;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String [] args){
        // imprima de dia 1 a 7 se e dia util ou nao com 1 sendo domingo com Switch-case
        byte dia;
        Scanner pergunte;
        pergunte = new Scanner(System.in);
        String diaSemana;
        System.out.println("Qual dia da semana voce esta? ");
        dia = pergunte.nextByte();
        switch (dia){
            case 1:
                diaSemana = ("Domingo nao e dia util");
                break;
            case 2:
                diaSemana = ("segunda e dia util");
                break;
            case 3:
                diaSemana = ("terca e dia util");
                break;
            case 4:
                diaSemana = ("quarta e dia util");
                break;
            case 5:
                diaSemana = ("quinta e dia util");
                break;
            case 6:
                diaSemana = ("sexta e dia util");
                break;
            case 7:
                diaSemana = ("sabado nao e dia util");
                break;
            default:
                diaSemana = ("esse dia nao existe");
        }

        System.out.println(diaSemana);
        // ou

        switch (dia){
            case 1:
            case 7:
                diaSemana = ("nao e dia util");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                diaSemana = ("dia util");
                break;
            default:
                diaSemana = ("dia invalid0");


        }
               System.out.println(diaSemana);
              //sem o break executam em sequencia

    }

}
