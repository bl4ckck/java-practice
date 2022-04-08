/**
 * Alvin Naufal
 */
package interview;

import java.util.Scanner;

public class KalibrrQuestionThree {
    private static int divisible(int[] num) {
        int count = 0, a = num[0];
        // Loop from A to B
        while (a <= num[1]) {
            // Divisible by K
            if (a % num[2] == 0) count++;
            a++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] result = new int[in.nextInt()][3];

        for (int i = 0; i < result.length; i++) {
            result[i][0] = in.nextInt();
            result[i][1] = in.nextInt();
            result[i][2] = in.nextInt();
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("Case " + (i + 1) + ": " + divisible(result[i]));
        }
    }
}
