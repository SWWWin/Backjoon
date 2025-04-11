package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*
범위를 지정한 다음 범위를 유지한 채로 이동하며 문제 해결
1,000,000이기 때문에 문자열의 길이가 크다
O(n)의 알고리즘으로 해결해야 함

슬라이딩 윈도우

1. 범위를 만든다
2. 조건에 맞는다면 count ++

문제 풀이
1. 필요한 비밀번호 체크 배열 저장
2. 현재 상태 배열 생성 -> 조건을 충족하지 않는다면 결과값은 0
3. 한 칸 이동 후 빠진 문자, 들어온 문자만 업데이트
 */
public class q12891 {

    static int myArr[];
    static int checkArr[];
    static int checkSecret = 0; // 4가 되면 정답으로!
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Result = 0;
        myArr = new int[4];
        checkArr = new int[4];

        char A[] = new char[S];


        A = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < 4; i ++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0 ) {
                checkSecret ++;
            }
        }

        for(int i = 0; i < P; i ++){//부분문자열 처음 받을때 세팅
            Add(A[i]);
        }

        if(checkSecret == 4) Result ++;

        //슬라이딩윈도우
        for(int i = P; i < S; i ++) {
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) Result++;
        }

        System.out.println(Result);
        bf.close();


    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
}
