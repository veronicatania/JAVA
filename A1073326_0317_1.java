import java.util.Scanner;

public class A1073326_0317_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;

        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        System.out.print("Enter the value of m: ");
        m = input.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the value for arr[" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
