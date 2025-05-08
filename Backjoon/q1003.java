package math.Backjoon;

import java.util.Scanner;

public class q1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();

            if(N == 0) {
                System.out.println("1 0");
                continue;
            }
            if(N == 1) {
                System.out.println("0 1");
                continue;
            }
            int[][] dp = new int[N + 1][2]; // 0: 0의 갯수 1: 1의 갯수


            dp[0][0] = 1;
            dp[0][1] = 0;
            dp[1][0] = 0;
            dp[1][1] = 1;
            //dp[2][0] = dp[0][0] + dp[1][0];
            //dp[2][1] = dp[0][1] + dp[1][1];


            for(int j = 2; j <= N; j ++) {
                dp[j][0] = dp[j - 2][0] + dp[j -1][0];
                dp[j][1] = dp[j - 2][1] + dp[j -1][1];
            }

            System.out.println(dp[N][0] + " " + dp[N][1]);

        }
    }
}
