package codingTest;

import java.util.Arrays;
import java.util.Scanner;

// N과 M(1)

public class BOJ_15649 {
	
	private static int n, m;
	private static boolean[] visit;
	private static int[] arr;
	private static StringBuilder sb = new StringBuilder();

	private static void permute(int depth) {
		if(depth == m) {
			for(int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		for(int i=1; i<=n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i;
				permute(depth+1);
				visit[i] = false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[m];
		visit = new boolean[n+1];
		
		permute(0);
		System.out.println(sb);
		
	}

}
