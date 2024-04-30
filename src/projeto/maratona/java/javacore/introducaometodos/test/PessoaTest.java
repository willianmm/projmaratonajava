package projeto.maratona.java.javacore.introducaometodos.test;

import projeto.maratona.java.javacore.introducaometodos.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Willian");
        pessoa.setIdade(19);
        //pessoa.idade = 19;
        pessoa.imprime();
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
        pessoa.imprime();



    }
}
