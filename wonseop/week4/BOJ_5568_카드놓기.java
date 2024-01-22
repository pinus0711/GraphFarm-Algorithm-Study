package week4;

import java.util.*;
import java.io.*;

public class BOJ_5568_카드놓기 {
    public static int n,k;
    public static int min = Integer.MAX_VALUE;
    public static String arr[];
    public static String sol[];
    public static boolean visit[];
    public static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        arr = new String[n];
        sol = new String[k];
        visit = new boolean [n];

        for (int i = 0 ; i < n ; i++) {
            arr[i] = br.readLine();
        }

        dfs(0);
        System.out.println(set.size());


    }

    public static void dfs(int idx) {
        if(idx == k) {
            String b = "";
            for(String a : sol) {
                b += a;
            }
            set.add(b);
            return;
        }

        for(int i = 0 ; i < n ; i++) {
            if(!visit[i]) {
                visit[i] = true;
                sol[idx] = arr[i];
                dfs(idx+1);
                visit[i] = false;
            }
        }

    }
}
