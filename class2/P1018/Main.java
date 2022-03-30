package solved.class2.P1018;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    private static final int SIZE = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Character, Boolean> mapper = new HashMap<>();
        mapper.put('B', false); // even
        mapper.put('W', true); // odd

        boolean[][] map = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = mapper.get(str.charAt(j));
            }
        }

        int res = SIZE * SIZE;
        for (int i = 0; i <= N - SIZE; i++) {
            for (int j = 0; j <= M - SIZE; j++) {
                res = Math.min(res, check(i, j, map));
            }
        }

        bw.write(String.valueOf(res));
        bw.flush();
    }

    private static int check(int si, int sj, boolean[][] map) {
        int cnt = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((i + j) % 2 == 0) {
                    if (!map[si + i][sj + j]) cnt++;
                } else {
                    if (map[si + i][sj + j]) cnt++;
                }
            }
        }
        return cnt < SIZE * SIZE - cnt ? cnt : SIZE * SIZE - cnt;
    }
}
