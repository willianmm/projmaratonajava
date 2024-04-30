package projeto.maratona.java.javacore.introducaometodos.domain;

public class Pessoa {
    private String name;
    private int age;

    public void imprime(){

        System.out.println(this.name);
        System.out.println(this.age);

    }

    public void setName(String name){
        this.name = name;
    }
    public void setIdade(int age){
        if (age < 0){
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }


}
