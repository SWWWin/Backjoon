package math.Backjoon;

import java.util.*;

public class q1697 {
    static final int MAX = 100001;  // 0부터 100,000까지
    static boolean[] visited = new boolean[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(bfs(n, k));
    }

    static int bfs(int start, int target) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start, 0));
        visited[start] = true;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.pos == target) {
                return current.time;
            }

            int[] nextPositions = {current.pos - 1, current.pos + 1, current.pos * 2};
            for (int next : nextPositions) {
                if (next >= 0 && next < MAX && !visited[next]) {
                    visited[next] = true;
                    queue.add(new Node(next, current.time + 1));
                }
            }
        }
        return -1;
    }

    static class Node {
        int pos;
        int time;

        Node(int pos, int time) {
            this.pos = pos;
            this.time = time;
        }
    }
}
