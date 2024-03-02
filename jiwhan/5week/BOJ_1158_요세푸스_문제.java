// https://www.acmicpc.net/problem/1158

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        br.close();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int cnt = 1;
        StringBuilder result = new StringBuilder("<");

        while (true) {

            if (cnt == k) {
                result.append(queue.remove());
                if (queue.isEmpty()) break;
                result.append(", ");

                cnt = 1;
            } else {
                queue.add(queue.remove());

                cnt++;
            }

        }

        result.append(">");

        System.out.println(result);

    }

}
