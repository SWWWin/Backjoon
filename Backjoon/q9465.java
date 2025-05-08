package math.Backjoon;

import java.util.Scanner;

public class q9465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        int[][] info = new int[2][N];
        int[][] dp = new int[2][N];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                info[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = info[0][0];
        dp[1][0] = info[1][0];

        for (int j = 2; j < N; j++) {
            dp[0][j] = Math.max(info[1][j], dp[1][j -1]) + info[0][j];
            dp[1][j] = Math.max(dp[0][j], dp[0][j - 1]) + info[1][j];
        }


        System.out.println(Math.max(dp[0][N-1], dp[1][N-1]));



    }
}
