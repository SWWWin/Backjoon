package math.Backjoon;

import java.util.Scanner;

public class q2302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] vip = new int[M];

        for (int i = 0; i < M; i++) {
            vip[i] = sc.nextInt();
        }

        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i-1] + dp[i -2];
        }


        int result = 1;
        int prev = 0;
        for (int i = 0; i < M; i++) {
            int length = vip[i] - prev - 1;
            result *= dp[length];
            prev = vip[i];
        }

        result *= dp[N - prev];

        System.out.println(result);



    }
}
