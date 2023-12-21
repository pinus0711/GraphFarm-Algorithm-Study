package week1;

import java.util.*;
import java.io.*;

public class BOJ_15654_N과M_5 {

    static int n, m;
    static int[] arr;
    static int[] answer;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        answer = new int[m];
        visit = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        back(0);

        System.out.println(sb);

    }

    private static void back(int idx) {
        if (idx == m) {
            for (int x : answer) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                answer[idx] = arr[i];
                back(idx + 1);
                visit[i] = false;
            }
        }
    }
}
