import java.util.Scanner;

public class MatChallenge {
    public static int MathChallenge(int num) {
        if (num <= 0) {
            return 0; // Handle invalid input
        }

        int[] coins = {11, 9, 7, 5, 1}; // Coin values in descending order
        int count = 0;

        for (int coin: coins) {
            while (num >= coin) {
                num -= coin;
                count++;
            }
        }

        return count;
    }

    public static void main(String args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(MathChallenge(s.nextInt()));
    }
}
