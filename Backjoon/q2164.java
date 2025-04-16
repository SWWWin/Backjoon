package math.Backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
카드 게임

자료의 양쪽에서 삭제/삽입이 일어난다면 큐의 선입선출 성질을 이용

 */
public class q2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for(int i = 1; i <= N; i ++) {
            myQueue.add(i);
        }

        while(myQueue.size()>1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }

        System.out.println(myQueue.poll());
    }
}
