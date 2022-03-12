package solved.class1.P1546;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> score = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            score.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(score, Comparator.reverseOrder());
        double max = score.get(0);

        double sum = 0;

        for (int i = 0; i < N; i++) {
            sum += score.get(i) / max * 100;
        }

        bw.write((sum / N)+"");
        bw.flush();
    }
}
