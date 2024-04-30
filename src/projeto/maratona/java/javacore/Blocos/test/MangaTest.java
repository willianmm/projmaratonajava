package projeto.maratona.java.javacore.Blocos.test;

import projeto.maratona.java.javacore.Blocos.dominio.Manga;

public class MangaTest {
    public static void main(String [] args){
        Manga manga = new Manga("one piece");

        for (int volume : manga.getVolumes()){
            System.out.print(volume + " ");
        }









    }


}
