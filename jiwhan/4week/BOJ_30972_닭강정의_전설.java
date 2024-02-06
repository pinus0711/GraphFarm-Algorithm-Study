// https://www.acmicpc.net/problem/30972

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] table = new int[n + 1][n + 1];
        int[][] negTable = new int[n + 1][n + 1];

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < n + 1; j++) {
                table[i][j] = Integer.parseInt(st.nextToken()) - table[i - 1][j - 1] + table[i][j - 1] + table[i - 1][j];
                negTable[i][j] = table[i][j] * -1;
            }
        }

        st = new StringTokenizer(br.readLine());
        int q = Integer.parseInt(st.nextToken());

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());

            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            int negResult = negTable[r2][c2] + negTable[r1 - 1][c1 - 1] - negTable[r1 - 1][c2] - negTable[r2][c1 - 1];
            int posResult = table[r2 - 1][c2 - 1] + table[r1][c1] - table[r1][c2 - 1] - table[r2 - 1][c1];

            System.out.println(negResult + (posResult * 2));

        }

    }

}
