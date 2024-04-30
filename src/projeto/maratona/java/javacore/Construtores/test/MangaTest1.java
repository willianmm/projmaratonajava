package projeto.maratona.java.javacore.Construtores.test;

import projeto.maratona.java.javacore.Construtores.dominio.Manga;

public class MangaTest1 {
    public static void main(String[] args) {
        Manga manga = new Manga("Akira toryama","Romcom", 300 ,"Dragon ball", "otome");

        System.out.println(manga.getVolumes());
        System.out.println(manga.getType());
        System.out.println("----------------------");



        manga.imprimeManga();


    }
}
