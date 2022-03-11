package solved.class1.P1157;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            ch = Character.toLowerCase(ch);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }

        int max = 0;
        char maxCh = ' ';
        boolean isDuplicated = false;
        for (Character ch : map.keySet()) {
            Integer count = map.get(ch);
            if (max < count) {
                maxCh = ch;
                max = count;
            } else if (max == count) {
                maxCh = '?';
            }
        }

        bw.write(Character.toUpperCase(maxCh)+"");
        bw.flush();
    }
}
