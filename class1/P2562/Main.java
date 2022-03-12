package solved.class1.P2562;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            int curr = Integer.parseInt(br.readLine());
            list.add(curr);
            map.put(curr, i+1);
        }

        Collections.sort(list, Comparator.reverseOrder());

        int max = list.get(0);
        bw.write(max + "\n");
        bw.write(map.get(max) + "\n");
        bw.flush();
    }
}
