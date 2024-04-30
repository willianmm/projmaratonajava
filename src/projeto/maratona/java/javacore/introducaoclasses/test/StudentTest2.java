package projeto.maratona.java.javacore.introducaoclasses.test;

import projeto.maratona.java.javacore.introducaoclasses.domain.Student;

public class StudentTest2 {
    public static void main(String[] args) {
        Student estudante = new Student();
        Student estudante2 = new Student();

        estudante.nome = "Edukof";

        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);


        System.out.println("---------------");


        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);




    }
}
