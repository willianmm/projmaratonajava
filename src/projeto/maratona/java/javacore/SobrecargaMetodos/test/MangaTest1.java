package projeto.maratona.java.javacore.SobrecargaMetodos.test;

import projeto.maratona.java.javacore.SobrecargaMetodos.dominio.Manga;

public class MangaTest1 {
    public static void main(String[] args) {
        Manga manga = new Manga();

        manga.init("Akira toryama","Romcom", 300 ,"Dragon ball");


        System.out.println(manga.getVolumes());
        System.out.println(manga.getType());
        System.out.println("----------------------");



        manga.imprimeManga();

    }
}
