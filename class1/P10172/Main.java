package solved.class1.P10172;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static final String DOG = "" +
            "|\\_/|\n" +
            "|q p|   /}\n" +
            "( 0 )\"\"\"\\\n" +
            "|\"^\"`    |\n" +
            "||_/=\\\\__|";

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(DOG);
        bw.flush();
    }
}
