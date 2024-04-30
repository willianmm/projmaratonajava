package projeto.maratona.java.introducao;

public class EstrururasDeRepeticao {
    public static void main(String [] args){
        // while, do while, for
        int count = 0;
        while(count < 15){
            System.out.println(++count);
        }
        count = 0;
        do {
            System.out.println("dentro do do-while" + ++count);

        }while (count < 10);

        for(int i = 0; i < 10 ; i++){
            System.out.println(i);

        } //Ou
        for(count = 0; count < 10 ; count++){
            System.out.println("outro jeito" + count);

        }




    }
}
