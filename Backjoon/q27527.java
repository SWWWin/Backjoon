package math.Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class q27527 {
    static int[] A = new int[1000001];
    static int[] heights;
    static int N;
    static int M;
    static int dest;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();


        int[] heights_ = new int[N];

        for(int i = 0; i < N; i++)
            heights[i] = sc.nextInt();

        if ((9 * M) % 10 == 0) {
            dest = (9 * M) / 10;
        }
        else {
            dest = (9 * M) / 10;
            dest++;
        }
        System.out.println(isPossible());
    }
    public static String isPossible(){
        for(int i = 0; i < M; i++){
            A[heights[i]] += 1;
            if(A[heights[i]] == dest)
                return "YES";
        }

        for(int i = 1; i <= N - M; i++){
            A[heights[i - 1]] -= 1;
            A[heights[i + M - 1]] += 1;
            if(A[heights[i + M - 1]] == dest)
                return "YES";
        }

        return "NO";
    }
}