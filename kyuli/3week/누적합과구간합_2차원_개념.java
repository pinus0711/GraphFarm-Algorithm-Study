// https://jih3508.tistory.com/50
// https://velog.io/@ohdowon064/Algorithm-2%EC%B0%A8%EC%9B%90-%EB%B0%B0%EC%97%B4-%EB%B6%80%EB%B6%84%ED%95%A9-%EB%88%84%EC%A0%81%ED%95%A9-%EA%B5%AC%ED%95%98%EA%B8%B0
// https://johoonday.tistory.com/214

// #1. 1차원 배열의 누적합과 구간합

import java.util.Arrays;

public class 누적합과구간합_2차원_개념 {

	public static void main(String[] args) {
		// (1) 2차원 배열의 누적합
		int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int size = a.length;
		
		// 정사각배열이라 size+1 로 행, 열 모두 설정 가능,
		// 원 배열 a 보다 한 칸씩 더 크게 설정.
		// (1, n) 또는 (n, 1) 까지의 누적합을 구할 경우 i-1, j-1 연산할 때 널포인트에러가 나지 않게 하기 위해.
		int[][] prefix_sum = new int[size + 1][size + 1]; 
		
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				System.out.println("i : " + i + ", j : " + j);
				prefix_sum[i][j] = prefix_sum[i-1][j] + prefix_sum[i][j-1] 
									+ a[i - 1][j - 1] - prefix_sum[i - 1][j - 1];
			}
		}
		Arrays.stream(prefix_sum).forEach(array -> System.out.println(Arrays.toString(array) + "wow"));
		
		// (2) 2차원 배열의 구간합
		int x1 = 2;
		int y1 = 1;
		int x2 = 4;
		int y2 = 3;
		
		int result = prefix_sum[x2][y2]  + prefix_sum[x1 -1][y1 -1] - prefix_sum[x2][y1 - 1] - prefix_sum[x1 - 1][y2];
 
	}

}
