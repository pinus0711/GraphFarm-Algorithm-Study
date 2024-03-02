package codingTest;

import java.util.Arrays;

public class RepeatedCombinationTemplate {
	private static int n, m;
	private static int[] arr;
	
	private static void repeatedCombination(int depth, int start) {
		if(depth == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for(int i=start; i<=n; i++) {
			arr[depth] = i;
			repeatedCombination(depth+1, i);
		}
	}
	public static void main(String[] args) {
		n = 4;
		m = 2;
		arr = new int[m];
		
		repeatedCombination(0, 1);
	}

}
