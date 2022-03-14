package solved.class1.P2920;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    private static final String[] RESULT = {"ascending", "mixed", "descending"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int status;
        status = Integer.compare(list.get(0), list.get(1));
        for (int i = 1; i < list.size()-1; i++) {
            if (status != Integer.compare(list.get(i), list.get(i + 1))) {
                status = 0;
                break;
            }
        }

        bw.write(RESULT[status + 1]);
        bw.flush();
    }
}
