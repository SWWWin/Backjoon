package math.SWEA;

import java.util.Scanner;

public class q1945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int N = sc.nextInt();
            int a = 0, b = 0, c = 0, d = 0, e = 0;
            while(N % 2 == 0) {
                a ++;
                N /= 2;
            }

            while(N % 3 == 0) {
                b ++;
                N /= 3;
            }

            while(N % 5 == 0) {
                c ++;
                N /= 5;
            }

            while(N % 7 == 0) {
                d ++;
                N /= 7;
            }

            while(N % 11 == 0) {
                e ++;
                N /= 11;
            }

            System.out.println("#" + N + " " + a + " " + b + " " + c + " " +d + " " +e);
        }
    }
}



/*
스캔 받기
숫자 받기

for() {
숫자 받기
a,b,c,d,e 생성
while(숫자가 2로 나눠짐)
나머지 받기

}
 */