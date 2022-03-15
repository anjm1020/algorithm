package solved.class1.P10171;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static final String CAT = "" +
            "\\    /\\\n" +
            " )  ( ')\n" +
            "(  /  )\n" +
            " \\(__)|";

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(CAT);
        bw.flush();
    }
}
