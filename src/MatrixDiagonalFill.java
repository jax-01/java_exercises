public class MatrixDiagonalFill {

    public static void diagonalFill() {
        int n = new java.util.Scanner(System.in).nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // value of each cell is the distance from the main diagonal
                matrix[i][j] = Math.abs(i - j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
