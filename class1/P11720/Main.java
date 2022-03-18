package solved.class1.P11720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += (int) (c - '0');
        }
        bw.write(sum + "");
        bw.flush();
    }
}
