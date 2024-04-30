package projeto.maratona.java.javacore.introducaometodos.test;

import projeto.maratona.java.javacore.introducaometodos.domain.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante student1 = new Estudante();
        student1.name = "camila";
        student1.age = 20;
        student1.sex = 'W';

        Estudante student2 = new Estudante();
        student2.name = "Willian";
        student2.age = 19;
        student2.sex = 'M';


        student1.imprime();
        student2.imprime();


    }
}
