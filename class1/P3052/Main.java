package solved.class1.P3052;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final int TESTCASE = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < TESTCASE; i++) {
            int curr = Integer.parseInt(br.readLine());
            set.add(curr%42);
        }

        bw.write(set.size() + "");
        bw.flush();
    }
}
