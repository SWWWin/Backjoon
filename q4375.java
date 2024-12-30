package math;

import java.util.Scanner;

public class q4375 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = 1;
            int c = 1;
            while (true) {
                if (b % a == 0) {
                    break;
                } else {
                    b = (b * 10 + 1) % a;
                    c++;
                }
            }

            System.out.println(c);
        }
    }


}
