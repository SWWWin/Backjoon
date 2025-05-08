package math.Backjoon;

import java.util.Scanner;
/*
    윈도우를 만들기
    N번 반복 - 회전 초밥 내부에서 만들 수 있는 모든 윈도우 확인
    윈도우를 확인한 후 윈도우 내부에 서비스 초밥의 번호가 없다면 초밥까지 먹기
 */
public class q15961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] count = new int[d+1];
        int kind = 0;
        int max = 0;

        for (int i = 0; i < k; i++) {
            if(count[arr[i]] == 0) kind ++;
            count[arr[i]] ++;
        }

        max = (count[c] == 0) ? kind + 1 : kind;

        for (int i = 1; i < N; i++) {
            int out = arr[i - 1];
            int in = arr[(i + k - 1) % N];

            count[out]--;
            if(count[out] == 0) kind--;

            if(count[in] == 0) kind++;
            count[in]++;

            int totalKinds = (count[c] == 0) ? kind + 1 : kind;
            max = Math.max(max, totalKinds);
        }

        System.out.println(max);

    }
}
