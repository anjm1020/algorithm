package solved.class1.P8958;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- != 0) {
            String result = br.readLine();
            String[] list = result.split("X+");

            int sum = 0;
            for (String str : list) {
                int len = str.length();
                sum += len * (len + 1) / 2;
            }

            bw.write(sum + "\n");
        }
        bw.flush();
    }
}
