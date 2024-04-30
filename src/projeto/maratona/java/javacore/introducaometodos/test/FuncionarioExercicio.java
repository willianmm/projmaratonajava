package projeto.maratona.java.javacore.introducaometodos.test;

import java.text.DecimalFormat;

import projeto.maratona.java.javacore.introducaometodos.domain.Funcionarios;
import projeto.maratona.java.javacore.introducaometodos.domain.MediaSalarios;

import java.util.Scanner;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        double salarioFun1;
        double salarioFun2;
        double salarioFun3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o salario do primerio funcionario?");
        salarioFun1 = scanner.nextDouble();
        System.out.println("Qual o salario do segundo funcionario?");
        salarioFun2 = scanner.nextDouble();
        System.out.println("Qual o salario do terceiro funcionario?");
        salarioFun3 = scanner.nextDouble();

        MediaSalarios mediaSalario = new MediaSalarios();
        Funcionarios funcionario1 = new Funcionarios();
        funcionario1.name = "maria";
        funcionario1.age = 18;
        funcionario1.salary = salarioFun1;

        Funcionarios funcionario2 = new Funcionarios();
        funcionario2.name = "jose";
        funcionario2.age = 38;
        funcionario2.salary = salarioFun2;

        Funcionarios funcionario3 = new Funcionarios();
        funcionario3.name = "kauan";
        funcionario3.age = 28;
        funcionario3.salary = salarioFun3;

        funcionario1.imprimir();
        funcionario2.imprimir();
        funcionario3.imprimir();

        DecimalFormat deci = new DecimalFormat("0.00");

        double media = mediaSalario.mediaSalario(funcionario1.salary + funcionario2.salary + funcionario3.salary);
        System.out.println(("A media salarial e = ") + deci.format(media));


    }
}
