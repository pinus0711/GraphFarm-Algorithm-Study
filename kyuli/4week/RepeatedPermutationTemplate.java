// 중복 순열 템플릿. visit 없음
package codingTest;

import java.util.Arrays;

public class RepeatedPermutationTemplate {
	private static int n, m;
	private static int[] arr;

	private static void permute(int depth) {
		if (depth == m) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[depth] = i;
			permute(depth + 1);
		}
	}

	public static void main(String[] args) {
		n = 4;
		m = 2;
		arr = new int[m];

		permute(0);

	}

}
