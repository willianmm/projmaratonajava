package projeto.maratona.java.javacore.introducaometodos.domain;

public class MediaSalarios {

    public double mediaSalario(double... numeros) {
        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / 3;


    }
}



