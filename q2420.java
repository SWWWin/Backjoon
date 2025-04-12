package math;

import java.io.*;
import java.util.StringTokenizer;

public class q2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());

        System.out.println(Math.abs(n-m));

    }
}
