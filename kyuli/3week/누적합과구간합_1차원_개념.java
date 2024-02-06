// https://jih3508.tistory.com/50
// https://velog.io/@ohdowon064/Algorithm-2%EC%B0%A8%EC%9B%90-%EB%B0%B0%EC%97%B4-%EB%B6%80%EB%B6%84%ED%95%A9-%EB%88%84%EC%A0%81%ED%95%A9-%EA%B5%AC%ED%95%98%EA%B8%B0
// https://johoonday.tistory.com/214

// #1. 1차원 배열의 누적합과 구간합

import java.util.Arrays;

public class 누적합과구간합_1차원_개념 {

	public static void main(String[] args) {
		// (1) 누적합 : 배열에서 특정 구간의 값을 누적해서 더하는 것.
		// (1-1)이중 for문 방식 : prefix_sum 배열에 값 하나를 넣을 때마다 array를 매번 더한다.
		// 시간 복잡도가 O(N^2)로 너무 길다.
		int[] array = { 1, 8, 7, 4, 3, 5, 6 };
		int n = array.length;

		int[] prefix_sum = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				prefix_sum[i] += array[j];
			}
		}
		System.out.println(Arrays.toString(prefix_sum));
		// (1-2) prefix_sum2 배열에서 이전 방의 값에 array 방의 값을 더하는 방식
		// 시간 복잡도 O(N)
		int[] prefix_sum2 = new int[n + 1];
		for (int i = 0; i < n; i++) {
			prefix_sum2[i + 1] = prefix_sum2[i] + array[i];
		}
		System.out.println(Arrays.toString(prefix_sum2));

		// (2) 구간합 : 특정 구간의 합. 누적합에서 특정 구간 이전까지의 누적합을 빼서 구한다.
		// 1번째 인덱스부터 5번째 인덱스까지의 합을 구할 때
		// for문을 돌리면 시간 복잡도가 O(N) (index를 탐색),
		// 5번째까지의 구간합에서 1번째까지의 구간합을 빼면 시간복잡도가 O(1) (구간합 이용)

		int x = 1;
		int y = 5;
		int part_sum = prefix_sum2[y + 1] - prefix_sum2[x + 1];
		System.out
				.println("prefix_sum2[y + 1] : " + prefix_sum2[y + 1] + ", prefix_sum2[x + 1] : " + prefix_sum2[x + 1]);
		System.out.println("part_sum : " + part_sum);

	}

}
