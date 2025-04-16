package math.Backjoon;

 /*
스택
- 삽입과 삭제 연산이 후입선출로 이뤄지는 자료구조
First in Last out
-> 원리를 알아두는 것이 중요

위치
top: 삽입과 삭제가 일어나는 위치

연산
push: top 위치에 새로운 데이터 삽입
pop: top위치에 현재 있는 데이터를 삭제하고 삽입
peek: top 위치에 현재 있는 데이터를 단순 확인

- 깊이 우선 탐색, 백트래킹 종류에서 자주 사용
- 재귀 함수 알고리즘과 일맥상통


큐
- 선입선출
- 삽입 삭제가 양방향으로 이루어짐

용어
rear: 큐에서 가장 끝 데이터를 가리킴
front: 큐에서 가장 앞의 데이터를 가리킴
add: rear 부분에 새로운 데이터 삽입
poll:  fromt 부분에 있는 데이터 삭제하고 확인
peek: 큐의 맨 앞(front)에 있는 데이터 확인

-너비우선 탐색에서 자주 사용

우선순위 큐
- 값이 들어간 순서와 상관없이 우선순위가 높은 데이터가 먼저 나오는 구조
큐 설정에 따라 front에 항상 최댓값 혹은 최솟값 위치

 */

import java.util.Scanner;
import java.util.Stack;

/*
스택으로 오름차순 수열 만들기

스택 연산 수행 방법
1. 현재 수열 값 >= 자연수
- push를 계속 해 주면서 증가시킴
2. 현재 수열 값 < 자연수
- pop으로 스택에 있는 값을 꺼낸다
- 꺼낸 값이 현재 수열 값이 아닌 경우 NO 출력

스택은 오름차순으로만 넣을 수 있다
 */
public class q1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i ++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        StringBuffer bf = new StringBuffer();
        for(int i = 0; i < A.length; i ++) {
            int su = A[i];
            if(su >= num) {
                while(su >= num) {
                    stack.push(num ++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }else {
                int n = stack.pop();
                if(n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}
