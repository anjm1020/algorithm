package solved.class1.P2741;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int i = 1;
        while (i <= N) {
            bw.write(i++ + "\n");
        }

        bw.flush();
    }
}
