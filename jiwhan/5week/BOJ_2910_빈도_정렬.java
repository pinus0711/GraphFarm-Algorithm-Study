// https://www.acmicpc.net/problem/2910

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());

            if (n > C) return;

            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        set = set.stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).collect(Collectors.toCollection(LinkedHashSet::new));

        StringBuilder sb = new StringBuilder();
        set.forEach(o -> {
            for (int i = 0; i < o.getValue(); i++) {
                sb.append(o.getKey()).append(" ");
            }
        });

        System.out.println(sb);

    }

}
