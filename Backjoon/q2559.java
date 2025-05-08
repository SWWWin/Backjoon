package math.Backjoon;

import java.util.Scanner;

public class q2559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] sum = new int[N];

        for (int i = 0; i < N; i++) {
            sum[i] = sc.nextInt();
        }

        int max = -111;
        for (int i = 0; i < N - K + 1; i++) {
            int add = 0;
            for (int j = i; j < K + i; j++) {
                add += sum[j];
            }
            if(add > max) max = add;
        }

        System.out.println(max);
    }
}
