// https://www.acmicpc.net/submit/2559/71405414

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        int[] intArr = new int[n];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }

        int temp = 0;

        for (int i = 0; i < k; i++) {
            temp += intArr[i];
        }

        int result = temp;

        for (int i = k; i < n; i++) {
            temp = temp + intArr[i] - intArr[i - k];

            result = Math.max(result, temp);
        }

        System.out.println(result);
    }
}