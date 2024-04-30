package projeto.maratona.java.javacore.introducaoclasses.test;

import projeto.maratona.java.javacore.introducaoclasses.domain.Cars;

public class CarsTest {
    public static void main(String[] args) {
        Cars carro = new Cars();
        Cars carro2 = new Cars();



        carro.Nome = "Cyber truck";
        carro.Modelo = "Tesla";
        carro.Ano = 2024;
        carro2.Modelo = "Chevrolet";
        carro2.Nome = "Celta";
        carro2.Ano = 2003;

        System.out.println("Modelo: " + carro2.Modelo);
        System.out.println("Nome: " + carro2.Nome);
        System.out.println("Ano: " + carro2.Ano);
        System.out.println("Modelo: " + carro.Modelo);
        System.out.println("Nome: " + carro.Nome);
        System.out.println("Ano de Fabricacao " + carro.Ano);



    }
}
