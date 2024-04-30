package projeto.maratona.java.javacore.introducaoclasses.test;

import projeto.maratona.java.javacore.introducaoclasses.domain.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher professor = new Teacher();
        professor.nome = "Ariovaldo";
        professor.idade = 55;
        professor.sexo = 'M';
        System.out.println(professor.nome);
        System.out.println(professor.sexo);
        System.out.println(professor.idade);
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
