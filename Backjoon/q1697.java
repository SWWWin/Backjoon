package math.Backjoon;

import java.util.*;


/*
수빈이의 위치, 동생의 위치 받기

어디에 방문했는지[최대갯수크기]
각 위치에 도달할 때 몇 초가 걸렸는지[최대갯수크기]
bfs -> 큐() 사용

시작점을 큐에 넣기/방문 여부 설정

큐가 빌 때까지 반복 {
    1. 현재 위치가 동생의 위치인지 확인
    2. 현재 위치가 동생의 위치가 아니라면 이동
        - 이동 방법 3가지를 모두 찾아서 큐, 방문 위치, 걸린 시간 삽입
}
 */
public class q1697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 수빈이 위치
        int K = sc.nextInt();  // 동생 위치

        int[] dist = new int[100001];       // 각 위치까지 걸린 시간
        boolean[] visited = new boolean[100001];  // 방문 여부
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(N);       // 시작점: 수빈이 위치
        visited[N] = true;    // 방문 표시

        while (!queue.isEmpty()) {
            int now = queue.poll();

            // 종료 조건: 동생 위치에 도달하면 출력하고 끝내기
            if (now == K) {
                System.out.println(dist[now]);
                return;
            }

            // 이동할 수 있는 3가지 방향 탐색
            int[] next = {now - 1, now + 1, now * 2};
            for (int nextPos : next) {
                // 범위 확인, 방문하지 않은 곳이면 탐색
                if (nextPos >= 0 && nextPos <= 100000 && !visited[nextPos]) {
                    queue.offer(nextPos);
                    visited[nextPos] = true;
                    dist[nextPos] = dist[now] + 1;  // 이전 위치 시간 + 1초
                }
            }
        }
    }
}
