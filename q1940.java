package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class q1940 {
/*
정렬하는 게 좋다
정렬을 해도 되는지 확인하려면 시간 복잡도를 확인

유니크한 수, 두 개를 뽑아 값을 만들려면 -> 투포인터

투 포인터 이동 원칙
min + max < M: min++
min + max = M: 만듦, min++, max--(둘 다 사용했으니까)
min + max > M: max--

 */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i ++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        int count = 0;
        int i = 0; //A[0]: MIN
        int j = N-1; //A[N-1]: MAX

        while(i < j) { //서로가 바뀌면 더는 탐색할 이유 없다
            if(A[i]+A[j] < M)i++;
            else if(A[i] + A[j] >M)j--;
            else {
                count ++;
                i ++;
                j --;
            }
        }
        System.out.println(count);
    }
}
