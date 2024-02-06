// https://www.acmicpc.net/problem/11659

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        int[] tempArr = new int[n];

        for (int idx = 0; idx < n; idx++) {
            tempArr[idx] = Integer.parseInt(sc.next());
        }

        int[] arrSum = new int[tempArr.length + 1];

        for (int idx = 0; idx < n; idx++) {
            arrSum[idx + 1] = arrSum[idx] + tempArr[idx];
        }

        for (int idx = 0; idx < m; idx++) {
            int i = Integer.parseInt(sc.next());
            int j = Integer.parseInt(sc.next());

            System.out.println(arrSum[j] - arrSum[i - 1]);
        }

    }
}