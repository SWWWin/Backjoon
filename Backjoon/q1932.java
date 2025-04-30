package math.Backjoon;

import java.util.Scanner;

public class q1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] triangle = new int[N][N];
        int[][] dp = new int[N][N];


        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = triangle[0][0];

        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) dp[i][j] = dp[i - 1][j] + triangle[i][j];
                else if (j == i) dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
                else dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
            }
        }

        int max = 0;
        for (int j = 0; j < N; j++) {
            if (max < dp[N - 1][j]) max = dp[N - 1][j];
        }

        System.out.println(max);
    }
}
