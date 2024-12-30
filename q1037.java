package math;

import java.util.Scanner;
import java.util.Arrays;

public class q1037 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i = 0; i < a; i ++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(b);

        System.out.println(b[0] * b[a-1]);
    }
 }
