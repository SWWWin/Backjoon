package math.Backjoon;

import java.util.Scanner;

public class q2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }

        dp[0] = score[0];
        if(N >= 2) dp[1] = score[1] + score[0];
        if(N >= 3) dp[2] = Math.max(score[0] + score[2], score[1] + score[2]);

        for(int i = 3; i < N; i ++) {
            dp[i] = Math.max(score[i] + dp[i-2], dp[i - 3] + score[i -1] + score[i]);
        }

        System.out.println(dp[N-1]);

    }
}
