import java.util.Arrays;
import java.util.Scanner;

public class A1073326_0505 {
    public static void main(String[] args) {
        int[] winningNumbers = {5, 10, 15, 20, 25, 30}; // example winning numbers

        Scanner scanner = new Scanner(System.in);
        int[] lotteryNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = scanner.nextInt();
            if (num < 1 || num > 49) { // check for invalid input
                System.out.println("Invalid input. Numbers must be between 1 and 49.");
                System.exit(1);
            }
            lotteryNumbers[i] = num;
        }

        Arrays.sort(winningNumbers);
        Arrays.sort(lotteryNumbers);

        int numMatches = 0;
        for (int i = 0; i < 6; i++) {
            if (winningNumbers[i] == lotteryNumbers[i]) {
                numMatches++;
            }
        }

        if (numMatches == 6) {
            System.out.println("Congratulations! You won the lottery!");
        } else {
            System.out.println("Sorry, you did not win the lottery. Better luck next time!");
        }
    }
}
