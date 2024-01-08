package week3;

import java.util.*;
import java.io.*;

public class BOJ_15655_N과M_8 {
    static int n, m;
    static int[] arr;
    static boolean[] visit;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visit = new boolean[n];
        answer = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        permute(0, 0);

        System.out.println(sb);

    }

    private static void permute(int start, int idx) {
        if (idx == m) {
            for (int x : answer) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < n; i++) {
            answer[idx] = arr[i];
            permute(i, idx + 1);
        }
    }
}
