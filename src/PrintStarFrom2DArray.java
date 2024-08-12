import java.util.Scanner;

public class PrintStarFrom2DArray {
    public static void printStar() {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String[][] matrix = new String[size][size];
        int midRow = matrix.length / 2;

        for (int i = 0; i < matrix.length; i++) {
            int mid = matrix[i].length / 2;
            int left = i;
            int right = matrix[i].length - 1 - i;
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == midRow) {
                    matrix[i][j] = "*";
                    continue;
                }
                if (j == mid || j == left || j == right) {
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = ".";
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
