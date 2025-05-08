package math.Backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class q15565 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] info = new int[N];
        ArrayList<Integer> checkOne = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            info[i] =sc.nextInt();
            if(info[i] == 1){
                checkOne.add(i);
            }
        }


        if(checkOne.size() < K) {
            System.out.println(-1);
            return;
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < checkOne.size() - K + 1; i++) {
            int start = checkOne.get(i);
            int end = checkOne.get(i+K-1);
            int c = end - start + 1;
            if(c < min) min = c;
        }
        System.out.println(min);


    }
}