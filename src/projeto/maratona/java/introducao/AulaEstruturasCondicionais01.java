package projeto.maratona.java.introducao;

public class AulaEstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAltorizado = idade >= 18;
        if (idade >= 20) {
            System.out.println("pode vender");
        }
        if (!isAltorizado) {
            System.out.println("nao altorizado");
        } else {
            System.out.println("nao pode vender");
        }
        String resultado = idade > 20 ? "pode vender" : "nao pode vender";
        System.out.println(resultado);

    }
}
