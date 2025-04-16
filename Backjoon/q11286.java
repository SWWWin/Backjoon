package math.Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*
우선순위 큐를 사용
정렬 기준 직접 정의 필요
 */
public class q11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 들어오는 게 많을 때는 버퍼드 리더 쓰는 게 시간적으로 유리
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1,o2) ->{
            //절댓값 작은 데이터 우선
            //절댓값이 같은 경우 음수 우선
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(first_abs == second_abs) {
                return o1 > o2 ? 1 : -1;
            }
            return first_abs - second_abs;
        });

        for(int i = 0; i < N; i ++) {
            int request = Integer.parseInt(br.readLine());
            if(request == 0) {
                if(myQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(myQueue.poll());
                }
            } else {
                myQueue.add(request);
            }
        }
    }
}
