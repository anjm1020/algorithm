package solved.class1.P2577;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int S = A * B * C;

        int[] cache = new int[10];
        while (S != 0) {
            cache[S % 10]++;
            S /= 10;
        }

        for (int i : cache) {
            bw.write(i + "\n");
        }

        bw.flush();
    }
}
