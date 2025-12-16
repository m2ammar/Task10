import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] A = new int[n][n];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            mainDiagonal += A[i][i];
            secondaryDiagonal += A[i][n - 1 - i];
        }

        System.out.println("Main diagonal sum: " + mainDiagonal);
        System.out.println("Secondary diagonal sum: " + secondaryDiagonal);
    }
}
