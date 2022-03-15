package solved.class1.P9498;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());
        score /= 10;

        switch (score) {
            case 10:
            case 9:
                bw.write("A");
                break;
            case 8:
                bw.write("B");
                break;
            case 7:
                bw.write("C");
                break;
            case 6:
                bw.write("D");
                break;
            default:
                bw.write("F");
                break;
        }

        bw.flush();

    }
}
