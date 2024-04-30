package projeto.maratona.java.javacore.modificadoresEstaticos.domain;

public class Carro {
    private String nome;
    private double veloxMax;
    private static double veloxlimit = 250;


    public Carro(String nome, double veloxMax){
        this.nome = nome;
        this.veloxMax = veloxMax;
    }


    public void imprime(){
        System.out.println("__________________");
        System.out.println("Nome " + this.nome);
        System.out.println("velocidade maxima " + this.veloxMax);
        System.out.println("Velocidade limite " + this.veloxlimit);

    }



    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public double getVeloxMax() {
        return this.veloxMax;
    }

    public void setVeloxMax(double veloxMax) {
        this.veloxMax = veloxMax;
    }


    public double getVeloxlimit() {
        return this.veloxlimit;
    }

    public void setVeloxlimit(double veloxlimit) {
        this.veloxlimit = veloxlimit;
    }
}
