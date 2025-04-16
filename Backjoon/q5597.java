package math.Backjoon;

import java.util.Scanner;

public class q5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = 0;
        }

        for(int i = 0; i < 28; i ++) {
            int finder = sc.nextInt();
            arr[finder - 1] = 1;
        }
        int check = 0;
        for(int i = 0; i < arr.length; i ++) {
            if(check > 2) {
                break;
            }
             else if(arr[i] == 0) {
                System.out.println(i + 1);
                check ++;
            }
        }
    }
}
