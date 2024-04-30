package projeto.maratona.java.introducao;

public class EstruturasCondicionaisSwitch {
    public static void main(String [] args){
        // imprimir o dia da semana
        String nomeDia;
        byte day = 4;
        switch (day) {
            case 1:
                nomeDia = ("domingo");
                break;
            case 2:
                nomeDia = ("segunda");
                break;
            case 3:
                nomeDia = ("terca");
                break;
            case 4:
                nomeDia = ("quarta");
                break;
            case 5:
                nomeDia = ("quinta");
                break;
            case 6:
                nomeDia = ("sexta");
                break;
            case 7:
                nomeDia = ("Domingo");
                break;
            default:
                nomeDia = ("Nao e um dia valido");
                break;

        }
        System.out.println("Hoje e "+ nomeDia);
        char sexo = 'M';
        String sexo2;
        switch (sexo){
            case 'H':
                sexo2 = ("E Homem");
                break;
            case 'F':
                sexo2 = ("E mulher");
                break;
            default:
                sexo2 = ("nao binare");
                break;

        }
            System.out.println(sexo2);







    }
}
