package solved.class1.P2675;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine());

        StringTokenizer st;
        while (testCase-- != 0) {

            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < R; j++) {
                    bw.write(str.charAt(i));
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
