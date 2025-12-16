import java.util.Scanner;

public class RowColumnAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter columns: ");
        int column = sc.nextInt();

        int[][] A = new int[row][column];

        System.out.println("Enter matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Row sums
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < column; j++) {
                sum += A[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum: " + sum);
        }

        // Column sum
        for (int j = 0; j < column; j++) {
            int sum = 0;
            for (int i = 0; i < row; i++) {
                sum += A[i][j];
            }
            System.out.println("Column " + (j + 1) + " sum: " + sum);
        }
    }
}
