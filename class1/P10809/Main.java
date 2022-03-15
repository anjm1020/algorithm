package solved.class1.P10809;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int[] alpha = new int['z'-'a'+1];
        Arrays.fill(alpha, -1);

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (alpha[curr - 'a'] == -1) {
                alpha[curr - 'a'] = i;
            }
        }

        for (int i : alpha) {
            bw.write(i + " ");
        }
        bw.flush();
    }
}
