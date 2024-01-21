package codingTest;

import java.util.Arrays;

public class CombinationTemplate {
	private static int n;
	private static int m;
	private static int[] arr;
	
	private static void combinate(int depth, int start) {
		if(depth == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=start; i<=n; i++) {
			arr[depth] = i;
			combinate(depth+1, i+1);
		}
	}
	
	public static void main(String[] args) {
		n = 4;
		m = 2;
		arr = new int[m];

		combinate(0, 1);
	}
}
