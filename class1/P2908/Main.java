package solved.class1.P2908;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = makeReverseInteger(Integer.parseInt(st.nextToken()));
        int B = makeReverseInteger(Integer.parseInt(st.nextToken()));

        bw.write((A > B ? A : B) + "");
        bw.flush();
    }

    private static int makeReverseInteger(int _A) {
        int A = 0;
        while (_A != 0) {
            A *= 10;
            A += _A % 10;
            _A /= 10;
        }
        return A;
    }
}
