package week1;

import java.util.*;
import java.io.*;

public class BOJ_15652_N과M_4 {

    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        back(0, 0);

        System.out.println(sb);

    }

    private static void back(int start, int idx) {
        if (idx == m) {
            for (int x : arr) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            arr[idx] = i + 1;
            back(i, idx + 1);
        }
    }
}
