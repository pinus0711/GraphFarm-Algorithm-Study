// 순열 템플릿
package codingTest;

import java.util.Arrays;

public class PermuationTemplate {
	private static int n, m;
	private static boolean[] visit;
	private static int[] arr;
	
	private static void permute(int depth) {
		if(depth == m) {
			System.out.println(Arrays.toString(arr));
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
		n = 4;
		m = 2;
		visit = new boolean[n+1];
		arr = new int[m];
		
		permute(0);

	}

}
