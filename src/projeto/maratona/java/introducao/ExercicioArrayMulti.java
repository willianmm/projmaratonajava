package projeto.maratona.java.introducao;

public class ExercicioArrayMulti {
    public static void main(String[] args) {
        int[][] num1 = {{2, 4, 6}, {8, 10, 12}};
        int[][] num2 = {{2, 4, 6}, {8, 10, 12}};
        int[][] som = new int[2][3];

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                som[i][j] = num1[i][j] + num2[i][j];
            }

        }
        for (int i = 0; i < som.length; i++) {
            for (int j = 0; j < som[i].length; j++) {
                System.out.println(som[i][j]);

            }

        }
        for (int i = 0; i < som.length; i++) {
            for (int j = 0; j < som[i].length; j++) {
                System.out.print(som[i][j] + " ");
            }
            System.out.println();
        }


        }

    }
