// https://www.acmicpc.net/problem/11660

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] aSum = new int[n + 1][n + 1];

        for (int i = 1; i < aSum.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < aSum[i].length; j++) {
                aSum[i][j] = Integer.parseInt(st.nextToken()) - aSum[i - 1][j - 1] + aSum[i - 1][j] + aSum[i][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            System.out.println(aSum[y1][y2] - aSum[x1 - 1][y2] - aSum[y1][x2 - 1] + aSum[x1 - 1][x2 - 1]);
        }

    }

}