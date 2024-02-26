package codingTest;

public class PGS_타겟_넘버 {

	private static int cnt = 0;

	public static void DFS(int[] numbers, int depth, int len, int sum, int target) {
		if (depth == len) {
			if (sum == target)
				cnt++;
			return;
		}

		DFS(numbers, depth+1, len, sum+numbers[depth], target);
		DFS(numbers, depth+1, len, sum-numbers[depth], target);

	}

	public static void main(String[] args) {
		int[] numbers = {4, 1, 2, 1};
		int target = 4;

		int len = numbers.length;
		int depth = 0;
		int sum = 0;
		DFS(numbers, depth, len, sum, target);

		System.out.println("cnt : " + cnt);

	}

}
