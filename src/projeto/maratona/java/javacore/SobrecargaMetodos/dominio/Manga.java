package projeto.maratona.java.javacore.SobrecargaMetodos.dominio;

public class Manga {
    private String type;
    private int volumes;
    private String mangaka;
    private String name;



    public Manga(){

    }













    public void init(String mangaka, String type, int volumes){
        this.mangaka = mangaka;
        this.type = type;
        this.volumes = volumes;
    }
    public void init(String mangaka, String type, int volumes, String name){
        this.init(mangaka, type, volumes);
        this.name = name;

    }

    public void imprimeManga(){
        System.out.println(this.type);
        System.out.println(this.volumes);
        System.out.println(this.mangaka);
        System.out.println(this.name);
    }




    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }

    public void setVolumes(int volumes){
        this.volumes = volumes;
    }

    public int getVolumes(){
        return this.volumes;
    }

    public void setNameMangaka(String mangaka){
        this.mangaka = mangaka;
    }

    public String getMangaka(){
        return this.mangaka;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
