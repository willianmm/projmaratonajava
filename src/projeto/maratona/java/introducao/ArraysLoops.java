package projeto.maratona.java.introducao;

public class ArraysLoops {
    public static void main(String[] args) {
        //enhaced for

        String[] nomes =  new String[6];
        nomes[0] = "Maria";
        nomes[1] = "Ryan";
        nomes[2] = "Paulo";
        for (String str : nomes) {
            System.out.println(str+'\n');

            
        }

        for (int i = 0; i < nomes.length ; i++) {
        nomes = new String[6];
        nomes[0] = "marcone";
        nomes[1] = "perone";
        nomes[2] = "mamone";
        System.out.println(nomes[i]);
        //Troquei os dados do Array que deixaram de existir
        }

        int[] meuArray = {1, 2, 3, 4, 5};
        int valorAntigo = meuArray[1]; // Armazenando o valor antigo
        meuArray[1] = 10; // Substituindo o valor antigo por 10
        System.out.println(valorAntigo);
        System.out.println(meuArray[1]);









    }
}
