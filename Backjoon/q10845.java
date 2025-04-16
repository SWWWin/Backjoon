package math.Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> myQueue = new LinkedList<>();


        for(int i = 0; i < N; i ++) {
            String string = br.readLine();
            if(string.startsWith("push")){
                String[] arr = string.split(" ");
                myQueue.add(Integer.parseInt(arr[1]));
            } else if(string.equals("pop")){
                if(myQueue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(myQueue.poll());
                }
            } else if(string.equals("size")){
                System.out.println(myQueue.size());
            } else if(string.equals("empty")){
                if(myQueue.isEmpty()){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (string.equals("front")) {
                if(myQueue.isEmpty()) System.out.println(-1);
                else {
                    System.out.println(myQueue.peek());
                }
            } else if(string.equals("back")) {
                if(myQueue.isEmpty()) System.out.println(-1);
                else {
                    System.out.println(myQueue.getLast());
                }
            }
        }
    }
}
