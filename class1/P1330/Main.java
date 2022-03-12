package solved.class1.P1330;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static final String[] res = {"<", "==", ">"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        bw.write(res[A.compareTo(B) + 1]);
        bw.flush();
    }
}
