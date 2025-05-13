package math.Backjoon;

import java.util.*;

public class q1260 {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        A = new ArrayList[n+1];
        visited = new boolean[n+1];
        
        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            A[a].add(b);
            A[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(A[i]);
        }

        DFS(n,m,v);
        for (int i = 1; i <= n; i++) {
            visited[i] = false;
        }
        System.out.println();
        BFS(v);
    }


    private static void DFS(int n, int m, int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for(int i : A[v]){
            if(!visited[i]) {
                DFS(n,m,i);

            }
        }

    }

    private static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;

        while(!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");
            for (int i : A[now]) {
                if(!visited[i]){
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
    }

}
