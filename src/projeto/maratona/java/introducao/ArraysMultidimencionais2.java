package projeto.maratona.java.introducao;

public class ArraysMultidimencionais2 {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        int [] array2 = {1, 2, 3};
//consigo declarar tamanhos de array diferentes dentro do array referencial
        array[0] = new int[2];
        array[1] = array2;
        array[2] = new int[10];

        for (int[] i : array) {
            System.out.println("--------------");
            for (int num : i) {
                System.out.println(num);
            }

        }


    }
}
