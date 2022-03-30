package solved.class2.P1259;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while ((str = br.readLine()).compareTo("0") != 0) {
            if (str.length() % 2 != 0) {
                int middle = str.length() / 2;
                String front = str.substring(0, middle);
                String end = str.substring(middle + 1, str.length());
                str = front + end;
            }
            Stack<Integer> st = new Stack<>();
            for (char ch : str.toCharArray()) {
                int i = Integer.parseInt(String.valueOf(ch));
                if (st.empty()) st.push(i);
                else if (st.peek() != i) st.push(i);
                else st.pop();
            }
            if (st.empty()) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
    }
}
