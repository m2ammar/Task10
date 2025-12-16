import java.util.Scanner;

    public class MatrixTranspose {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter rows: ");
            int row = sc.nextInt();

            System.out.print("Enter columns: ");
            int col = sc.nextInt();

            int[][] A = new int[row][col];

            System.out.println("Enter the matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            System.out.println("Transpose:");
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    System.out.print(A[j][i] + " ");
                }
                System.out.println();
            }
        }
    }


