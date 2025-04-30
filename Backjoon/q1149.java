package math.Backjoon;

import java.util.Scanner;

public class q1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] money = new int[N][3];
        int[][] dp = new int[N][3];

        for (int i = 0; i <N; i++) {
            for (int j = 0; j < 3; j++) {
                money[i][j] = sc.nextInt();
            }
        }

        dp[0][0] = money[0][0];
        dp[0][1] = money[0][1];
        dp[0][2] = money[0][2];

        for(int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i -1][1], dp[i -1][2]) + money[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i-1][2]) + money[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i-1][1]) + money[i][2];
        }

        System.out.println(Math.min(Math.min(dp[N-1][0], dp[N-1][1]),dp[N-1][2]));
    }
}
