package math.Backjoon;

import java.util.Scanner;

public class q11726 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];//0: 가로, 1: 세로

        dp[0] = 1;
        if(N >= 1) dp[1] = 1;


        for (int i = 2; i <= N; i++) {
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.println(dp[N]);
    }
}
