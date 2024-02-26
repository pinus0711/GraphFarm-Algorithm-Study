package week9;

import java.util.*;
import java.io.*;

public class BOJ_2644_촌수계산 {

    static int n, person1, person2, m;
    static ArrayList<Integer>[] map;
    static boolean[] visit;
    static int count = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        person1 = Integer.parseInt(st.nextToken());
        person2 = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        map = new ArrayList[n+1];
        visit = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            map[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x].add(y);
            map[y].add(x);

        }

        dfs(person1, 0);
        System.out.println(count);

    }

    private static void dfs(int person1, int cnt) {
        if(person1 == person2) {
            count = cnt;
            return;
        }

        visit[person1] = true;

        for (int next : map[person1]) {
            if(!visit[next]) {
                dfs(next, cnt + 1);
            }
        }
    }
}
