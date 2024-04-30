package projeto.maratona.java.javacore.introducaometodos.test;

import projeto.maratona.java.javacore.introducaometodos.domain.Estudante;
import projeto.maratona.java.javacore.introducaometodos.domain.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante student1 = new Estudante();
        student1.name = "camila";
        student1.age = 20;
        student1.sex = 'W';

        Estudante student2 = new Estudante();
        student2.name = "Willian";
        student2.age = 19;
        student2.sex = 'M';

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        impressora.imprime(student1);
        impressora.imprime(student2);











    }
}
