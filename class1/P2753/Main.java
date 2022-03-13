package solved.class1.P2753;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Y = Integer.parseInt(br.readLine());

        bw.write(check(Y)+"");
        bw.flush();
    }

    public static int check(int year) {
        if(year%4==0&&(year%100!=0||year%400==0)) return 1;
        return 0;
    }

}
