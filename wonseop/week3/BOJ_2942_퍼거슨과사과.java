package week3;

import java.util.*;
import java.io.*;

public class BOJ_2942_퍼거슨과사과 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());

        int minSize = Math.min(r, g);

        int cnt = 1;

        while(true){
            if(cnt > minSize) break;

            if(r % cnt == 0 && g % cnt == 0){
                System.out.println(cnt + " " + r/cnt + " " + g/cnt);
            }
            cnt++;
        }

    }
}
