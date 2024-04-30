package projeto.maratona.java.introducao;

public class Arrays4 {
    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }
        for (int num : numeros){
            System.out.println(num);
            //Simplificado mas nao consigo puchar valor expecifico vai em ordem do indice 0 ate o maximo declarado

        }


    }
}
