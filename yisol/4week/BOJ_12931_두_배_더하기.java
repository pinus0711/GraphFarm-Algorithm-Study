import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int cnt = 0;

        int max = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        // 최대값이 1이 될 때까지 반복
        while (max > 1) {
            for (int i = 0; i < N; i++) {
                if (arr[i] % 2 == 1) {
                    arr[i]--;
                    cnt++;
                }
                arr[i] /= 2;
            }
            cnt++;
            max /= 2;
        }
        for(int i:arr){
            if(i==1) cnt++;
        }

        System.out.println(cnt);
    }
}
