package math.Backjoon;

import java.util.Scanner;

public class q10025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        final int MAX = 1_000_001;
        int[] ice = new int[MAX];

        int maxIndex = 0;

        for (int i = 0; i < N; i++) {
            int g = sc.nextInt();
            int x = sc.nextInt();
            ice[x] += g;
            if(x > maxIndex) maxIndex = x;
        }

        int windowSize = 2 * K + 1;
        long sum = 0;
        long result = 0;

        for (int i = 0; i < windowSize && i < MAX; i++) {
            sum += ice[i];
        }
        result = sum;

        for (int i = windowSize ; i <= maxIndex; i++) {
            sum = sum - ice[i - windowSize] + ice[i];
            result = Math.max(result, sum);
        }

        System.out.println(result);
    }
}
