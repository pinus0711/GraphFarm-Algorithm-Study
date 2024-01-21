package codingTest;

import java.util.Arrays;
import java.util.Scanner;

// N과 M (11)
public class BOJ_15665 {
	
	private static int n, m;
	private static int[] nums;
	private static boolean[] visit;
	private static int[] arr;
	private static StringBuilder sb = new StringBuilder();
	
	private static void repeatedPermute(int depth) {
		if(depth == m) {
			for(int value: arr) {
				sb.append(value).append(' ');
			}
			sb.append('\n');
			return;
		}
		int prev = -1;
		for(int i=1; i<=n; i++) {
			if(prev != nums[i]) {
				prev = nums[i];
				arr[depth] = prev;
				repeatedPermute(depth+1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		nums = new int[n+1];
		visit = new boolean[n+1];
		arr = new int[m];
		
		sc.nextLine();
		for(int i=1; i<=n; i++) {
			nums[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		
		repeatedPermute(0);
		System.out.println(sb);
		
	}

}
