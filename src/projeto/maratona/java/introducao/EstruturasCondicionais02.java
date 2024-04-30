package projeto.maratona.java.introducao;

public class EstruturasCondicionais02 {
    public static void main(String [] args){
        int idade = 11;
        String categoria;
        if (idade < 15){
           categoria = "time infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "time adolecente";
        } else {
            categoria = "time adulto";
        }
        //ou, mas nao e recomendado
        System.out.println(categoria);
        String resultado = idade < 15 ? "time infantil" : idade >= 15 && idade < 18 ? "time adolecente" : "time adulto";
        System.out.println(resultado);

        }
    }

