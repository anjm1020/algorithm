    package solved.class1.P2742;

    import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(br.readLine());

            while (N>0) {
                bw.write(N-- + "\n");
            }

            bw.flush();
        }
    }
