package week1;

import java.util.*;
import java.io.*;

public class BOJ_1138_한줄로서기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new LinkedList<>();

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n ; i++) {
            int val = Integer.parseInt(st.nextToken());
            arr[i] = val;
        }

        for (int i = n-1; i >= 0 ; i--) {
            list.add(arr[i], i+1);
        }

//        for (int i = 0; i < n ; i++) {
//            list.add(arr[i], i+1);
//        }

        for (int x : list){
            System.out.print(x + " ");
        }


    }
}
