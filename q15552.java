package math;/*
BufferedReader: Scanner와 유사
Bufferedwriter: System.out.println()과 유사

입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높인다
많은 양의 데이터를 처리할 떄 유리하다

BufferedReader은 Enter만 겨예로 인식하고 받은 데이터는 String으로 고정된다
>> 다른 타입으로 사용하려면 변환이 필요

예외 처리를 꼭 해 주어야 함!
    throw 이용 시 import .java.io.IOException
 */



import java.io.*;
import java.util.StringTokenizer;

public class q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int i = Integer.parseInt(bf.readLine());
        for(int j = 0 ; j < i; j ++) {
            String s = bf.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int answer = a + b;
            bw.write(answer + "\n");

        }

        bw.flush();
        bw.close();

    }

}
