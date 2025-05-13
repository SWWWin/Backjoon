package math.Backjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class q2606 {

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        A = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            int l = sc.nextInt();

            A[t].add(l);
            A[l].add(t);
        }

        int count = DFS(1);

        System.out.println(count);
    }

    public static int DFS(int v) {
        int answer = 0;
        if (visited[v])
            return answer;
        visited[v] = true;
        for (int j : A[v]) {
            if (!visited[j]) {
                answer += 1 + DFS(j);
            }
        }
        return answer;
    }
}
