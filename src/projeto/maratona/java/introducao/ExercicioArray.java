package projeto.maratona.java.introducao;
import java.util.Scanner;
public class ExercicioArray {
    public static void main(String [] args) {

        boolean encontrado = false;

        String[] nomes = {"maria", "pedro"};

        Scanner qualNome = new Scanner(System.in);

        System.out.println("Qual nome voce busca?");

        String nomeBuscado = qualNome.nextLine();

        for (String i : nomes) {
            if (i.equals(nomeBuscado)) {
                encontrado = true;
                break;
            }
        }


        if(encontrado){
            System.out.println(nomeBuscado+" esta no array");
        }else {
            System.out.println(nomeBuscado + " nao esta no array");
        }
















    }
}
