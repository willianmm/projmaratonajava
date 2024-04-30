package projeto.maratona.java.introducao;

public class AulaExercicio {
    public static void main(String[] args) {
        String nome ="Willian";
        String endereco = "Rua da sereia, jardim novo horizonte N41";
        double salario = 1000.00;
        String dataDeRecebimento = "11/11/2004";
        System.out.println("Eu "+nome+", morando no endereco "+endereco+", confirmo que recebi o salario no valor de "+salario+", na data de "+dataDeRecebimento);
        //ou
        String relatorio = "Eu "+nome+", morando no endereco "+endereco+", confirmo que recebi o salario no valor de "+salario+", na data de "+dataDeRecebimento;
        System.out.println(relatorio);
    }
}
