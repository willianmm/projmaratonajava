package projeto.maratona.java.javacore.introducaoclasses.test;

import projeto.maratona.java.javacore.introducaoclasses.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student estudante = new Student();
        estudante.nome = "Will";
        estudante.sexo = 'M';
        estudante.idade = 19;
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
