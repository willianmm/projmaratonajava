package projeto.maratona.java.javacore.Blocos.dominio;

public class Manga {
    private String name;
    private int[] volumes;
    {
        System.out.println("ladentrim");
        volumes = new int[500];
        for (int i = 0; i < volumes.length; i++) {
            volumes[i] = i+1;
        }

    }
    public Manga(String name){
        this.name = name;
    }


    public Manga(){
        for (int vol : this.volumes){
            System.out.println(vol + " ");
        }

    }








    public void setVolumes(int[] volumes){
        this.volumes = volumes;
    }
    public int[] getVolumes(){
        return this.volumes;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
