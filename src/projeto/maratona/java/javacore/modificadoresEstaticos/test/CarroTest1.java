package projeto.maratona.java.javacore.modificadoresEstaticos.test;

import projeto.maratona.java.javacore.modificadoresEstaticos.domain.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Porshe", 270);
        Carro carro2 = new Carro("BMW", 260);
        Carro carro3 = new Carro("AUDI", 280);



        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }

}
