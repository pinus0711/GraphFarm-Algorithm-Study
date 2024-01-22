package week4;

import java.util.*;
import java.io.*;

public class BOJ_2559_N과M_1 {
    static int n, m;
    static boolean[] visit;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visit = new boolean[n];
        arr = new int[m];

        perm(0);

        System.out.println(sb);

    }

    private static void perm(int idx) {
        if (idx == m) {
            for(int x : arr){
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[idx] = i + 1;
                perm(idx + 1);
                visit[i] = false;
            }
        }
    }
}
