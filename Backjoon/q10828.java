package math.Backjoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class q10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Stack<Integer> myStack = new Stack<>();
        sc.nextLine();
        for(int i = 0; i < N; i ++) {
            String math = sc.nextLine();
            if(math.startsWith("push")) {
                String[] arr = math.split(" ");
                myStack.push(Integer.parseInt(arr[1]));
            } else if(math.equals("pop")){
                if(myStack.empty()){
                    System.out.println(-1);
                }else System.out.println(myStack.pop());
            } else if(math.equals("size")) {
                System.out.println(myStack.size());
            } else if (math.equals("empty")) {
                if(myStack.empty())
                    System.out.println(1);
                else System.out.println(0);
            } else if (math.equals("top")) {//peek도 empty인지 확인해야 한다
                if(myStack.empty())
                    System.out.println(-1);
                else {
                    int s = myStack.peek();
                    System.out.println(s);
                }


            }
        }
    }
}
